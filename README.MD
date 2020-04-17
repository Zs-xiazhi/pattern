# 六大设计原则
### 1.单一职责原则(Single Responsibility Principle)(SRP)
#####单一职责的定义为: 一个类应该有且只有一个原因引起类的变化
此原则的核心是：解耦和增强内聚性  
首先我们来看一个类设计：
人有姓名，年龄，性别等属性，也有吃饭睡觉等行为，依此创建一个类：
~~~
package com.xiazhi.principle.srp;

/**
 * @author ZhaoShuai
 * @date Create in 2020/4/12
 **/
public class Person {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别：1-男，0-女
     */
    private Integer gander;

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGander() {
        return gander;
    }

    public void setGander(Integer gander) {
        this.gander = gander;
    }
}
~~~
可以看到人的属性和行为都放在一个类里面，如果此时要添加一个属性或者添加一个学习的行为，都会导致这个类的结构改变，这个类的职责既要维护人的属性，又要维护人的行为，因此就有两个职责，不符合职责单一性原则。
当然，这样写也没有问题，但是会导致类的职责不明确，为后期维护带来困难。因此将这个类进行拆分：
~~~
/**
 * 人的属性
 * @author ZhaoShuai
 * @date Create in 2020/4/12
 **/
public class PersonProperty {
    private String name;
    private Integer age;
    private Integer gander;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGander() {
        return gander;
    }

    public void setGander(Integer gander) {
        this.gander = gander;
    }
}
/**
 * 人的行为
 * @author ZhaoShuai
 * @date Create in 2020/4/12
 **/
public interface PersonAction {

    void sleep();

    void eat();

}
public class PersonInstance implements PersonAction {

    private PersonProperty person;
    @Override
    public void sleep() {
        System.out.println(this.person.getName() + "吃饭");
    }

    @Override
    public void eat() {
        System.out.println(this.person.getName() + "睡觉");
    }

    public PersonProperty getPerson() {
        return person;
    }

    public void setPerson(PersonProperty person) {
        this.person = person;
    }
}
~~~
PersonInstance实体实现了行为的接口，而他的内部则有一个PersonProperty的字段。当Person需要添加一个新的属性如：学历等，只需要更改PersonProperty类就可以了，与其他的
类无关，其他的类都务需改动，当需要添加新的行为,如：学习时，只需要改变接口及他的实现类，而务需其他的改动。这样就实现了类的职责单一化。
通过上面的例子来分析下，职责单一性的好处：  
`1.类的复杂性降低了`
`2.负责性降低了，类的可阅读性自然提高了`
`3.可阅读性提高了，那么可维护性自然就提高了`
`4.类的变更风险降低了，原来有两个变化可能导致类的结构发生变化，现在每个类的职责都明确了，每一个变化都有相应的变更类，也就是**只有一个原因引起类的变化**`
### 2.里氏替换原则(Liskov Substitution Principle)(LSP)
##### 定义: 所有引用基类的地方必须能透明的使用子类对象
里氏替换原则：就是说当在程序中将一个对象替换成他的子类时，程序可以继续原有的行为，他察觉不出符类和子类的区别。但是反过来却不成立，如果一个程序使用的是一个子类的话，他不一定适用于父类。  
以电脑举例：电脑有CPU，电脑就是程序实体，CPU就是它使用的基类，CPU又有子类IntelCpu。
~~~
public class Cpu {

    public void work(){
        System.out.println("CPU在工作");
    }
}
public class IntelCpu extends Cpu {
    @Override
    public void work() {
        System.out.println("英特尔CPU工作");
    }
}
public class Computer {

    private Cpu cpu;

    public void run() {
        this.cpu.work();
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
~~~
电脑依赖的是父类，此时将Cpu换成Intel类型的，电脑仍能正常工作，它察觉不到任何改变，这符合里氏替换原则。  
而反过来，假设现在有一台电脑，它只能使用IntelCpu才能工作。
~~~
public class IntelCpuComputer {
    private IntelCpu cpu;
    
    public void run() {
        this.cpu.work();
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }
}
~~~
如果此时将IntelCpu替换成父类CPU，那么计算机就不能正常工作，因为它只有在使用IntelCpu时才能正常工作。
~~~
  public static void main(String[] args) {
      IntelCpuComputer computer = new IntelCpuComputer();
      computer.setCpu(new Cpu());//报错
  }
~~~
再比如说，我们都知道在数学上正方形是特殊的长方形，那么能不能说正方形就是长方形的子类呢？  
我们用代码表示一下正方形和长方形：
~~~
/**
 * 长方形
 * @author ZhaoShuai
 * @date Create in 2020/4/12
 **/
public class Rectangle {

    private Integer height;
    private Integer width;

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
/**
 * 正方形
 * @author ZhaoShuai
 * @date Create in 2020/4/12
 **/
public class Square {
    
    private Integer side;

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }
}
~~~
我们都知道，父类是通过抽取子类的共性封装而成的，从上面代码中可以看出，长方形和正方形的结构式不同的，长方形有长和宽的属性，而正方形只有变长的属性。
因此，正方形不是长方形的子类，当然也可以强行来继承长方形作为父类，但是我们不是为了继承而继承，这种为了继承而继承的情况也是不属于里氏替换原则的。
~~~
package com.xiazhi.principle.lsp;

/**
 * @author ZhaoShuai
 * @date Create in 2020/4/12
 **/
public class SquareExtendsRectangle extends Rectangle {

    private Integer side;

    @Override
    public void setHeight(Integer height) {
        this.setSide(height);
    }

    @Override
    public void setWidth(Integer width) {
        this.setSide(width);
    }

    @Override
    public Integer getHeight() {
        return this.getSide();
    }

    @Override
    public Integer getWidth() {
        return this.getSide();
    }

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }
}
~~~
可以看出，我们给正方形强行继承了长方形，然后我们写一个测试类：
~~~
 public static void main(String[] args) {
        System.out.println("============长方形==============");
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        print(rectangle);

        System.out.println("============正方形==============");
        Rectangle square = new SquareExtendsRectangle();
        square.setHeight(10);
        print(square);

    }

    private static void print(Rectangle rectangle) {
        System.out.println("高："+rectangle.getHeight());
        System.out.println("宽：" + rectangle.getWidth());
    }
~~~
测试后我们发现好像能正常运行，此时我们再加一个方法：
~~~
public static void main(String[] args) {
        System.out.println("============长方形==============");
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        test(rectangle);

        System.out.println("============正方形==============");
        Rectangle square = new SquareExtendsRectangle();
        square.setHeight(10);
        test(square);

    }

    private static void print(Rectangle rectangle) {
        System.out.println("高："+rectangle.getHeight());
        System.out.println("宽：" + rectangle.getWidth());
    }

    private static void test(Rectangle rectangle) {
        while (rectangle.getWidth() >= rectangle.getHeight()) {
            rectangle.setHeight(rectangle.getHeight()+1);
            print(rectangle);
        }
    }
~~~
运行后可以发现， 长方形可以正常运行，而正方形却会出现死循环，因此这种是不符合里氏替换原则的。因为引用父类的地方无法使用子类对象。
#### 在类的设计时，根据依赖倒置原则，要使用抽象类或接口，如果不能使用抽象类或者接口，那么就说明设计违背了里氏替换原则（LSP）
### 3.接口隔离原则(Interface Segregation Principle)(ISP)
##### 定义: 类间的依赖关系应该建立在最小的接口上
接口隔离原则有两个定义：  
`1.客户端不应该依赖它不需要的接口`  
`2. 类间的依赖关系应该建立在最小的接口上`   
首先来看**客户端不应该依赖它不需要的接口**，那么意思就是要依赖它需要的接口，把不需要的接口剔除掉，就需要接口细化，如果接口的方法比较杂乱就没办法剔除。
**类间的依赖关系应该建立在最小的依赖关系上**要求接口细化，因为接口细化之后，才能做到嘴小依赖关系。由此可见，接口隔离原则的要求就是一条：**接口细化**
如何做到接口细化？  
就是要求尽量减少接口的方法。例如，我们去银行办理业务，银行有存款，取款，转账，理财等业务。每一个窗口有一个业务员，每一个窗口都可以办理这些业务。因此业务员的职责都是一样的。
银行的职责有：存款，取款，转账，理财。
~~~
public interface Bank {
    /**
     * 存款
     */
    void saving();

    /**
     * 取款
     */
    void fetch();

    /**
     * 转账
     */
    void transfer();

    /**
     * 理财
     */
    void manageMoney();
}
~~~
这样看的话，这个银行接口的设计是符合职责单一原则的，那么业务员的实现就是：
~~~
public class BankSalesman implements Bank {

    @Override
    public void saving() {
        System.out.println("存款");
    }

    @Override
    public void fetch() {
        System.out.println("取款");
    }

    @Override
    public void transfer() {
        System.out.println("转账");
    }

    @Override
    public void manageMoney() {
        System.out.println("理财");
    }
}
~~~
业务员实现了银行的接口，每一个业务员都有存款，取款，转账，理财的方法，也就是说每一个业务员都有这些职责，但是这样的设计并不合理，因为每一个业务员都强制必须有这些方法，如果现在银行新招一个业务员
只需要有存取款的方法，其他方法都不需要。这样就没办法提出Bank中的方法，因此这个Bank接口的设计是不符合接口隔离原则的。如何实现接口细化？
将银行的方法拆分：
~~~
public interface Saving {
    void saving();
}
public interface Fetch {
    void fetch();
}
public interface Transfer {
    void transfer();
}
public interface ManageMoney {
    void manageMoney();
}
~~~
业务员需要有哪儿些工作，就实现哪儿些接口，如有一个业务员只有理财的业务：
~~~
public class ManageMoneySalesman implements ManageMoney {
    @Override
    public void manageMoney() {
        System.out.println("理财");
    }
}
~~~
可以看到，业务员需要哪儿些职责，就继承哪儿个接口并实现方法。  
接口隔离原则要求：将一个臃肿的接口拆分为多个独立的接口，通过分散定义多个接口，可以预防未来变更的扩散，提高系统的灵活性和可维护性。
接口隔离原则主要包含一下四层含义：  
`1. 接口尽量小`需要注意的是：**根据接口隔离原则拆分接口时，应该首先满足职责单一原则**  
`2. 接口要高内聚`高内聚就是要提高类，接口，模块的处理能力，减少对外的交互。具体到接口隔离原则就是在接口中尽量少公布public方法，接口的pulic 方法越少对系统的开发越有利，变更的
风险也就越小。  
`3. 定制服务`一个系统或系统内的模块之间必然会有耦合，有耦合就要有互相访问的接口，这个接口也可能时类，或者方法。定制服务就是只提供访问者需要的方法。  
`4. 接口设计是有限度的`接口设计粒度越小，系统越灵活，但是，相应的带来的结果就是系统结构变得复杂，维护性降低。  
接口隔离原则是对接口的定义，同时也是对类的定义。接口的设计可以根据以下规则来划分：  
`1. 一个接口只服务于一个子模块或者业务逻辑`
`2. 通过业务逻辑压缩接口中的public方法`
`3. 已经被污染的接口，尽量去修改，若变更的风险较大，则应使用适配器模式进行转换`
`4. 根据自己项目的需求，深入分析，进行设计，不要盲目追求接口隔离原则`
### 4.依赖倒置原则(Dependence Inversion Principle)(DIP)
##### 高层模块不应该依赖底层模块，二者都依赖其抽象; 抽象不应该依赖细节，细节依赖抽象。面向接口编程。
假设我们现在要组装一台电脑，电脑硬件有cpu和内存,而CPU有Intel和AMD两种类型，内存有DDR3 和DDR4两种，那么我们的传统的设计是这样的：
首先我们写出CPU和内存的实现类：
~~~
class AMDCpu{
    void run() {
        System.out.println("AMD CPU在工作");
    }
}
class IntelCpu{
    void run() {
        System.out.println("Intel CPU在工作");
    }
}
class DDR3{
    
    void run() {
        System.out.println("DDR3 内存在工作");
    }
}
class DDR4{
    void run() {
        System.out.println("DDR4 内存在工作");
    }
}
~~~
此时，我们要组装一台Intel+DDR3的电脑，那么我们的电脑应该这样写：
~~~
class Computer{
    private IntelCpu cpu;
    private DDR3 memory;

    void run() {
        this.cpu.run();
        this.memory.run();
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public DDR3 getMemory() {
        return memory;
    }

    public void setMemory(DDR3 memory) {
        this.memory = memory;
    }
}
public class TraditionDesign {
    public static void main(String[] args) {
        Computer computer = new Computer();
        IntelCpu cpu = new IntelCpu();
        computer.setCpu(cpu);
        DDR3 ddr3 = new DDR3();
        computer.setMemory(ddr3);
        computer.run();
    }
}
~~~
现在电脑能运行了，大体看起来没啥问题，但是如果我们此时想要将内存换程DDR4的或者cpu 换成AMD的，那么我们就需要更改Computer类的属性：
~~~
class Computer{
    private AMDCpu cpu;
    private DDR4 memory;

    void run() {
        this.cpu.run();
        this.memory.run();
    }

    public AMDCpu getCpu() {
        return cpu;
    }

    public void setCpu(AMDCpu cpu) {
        this.cpu = cpu;
    }

    public DDR4 getMemory() {
        return memory;
    }

    public void setMemory(DDR4 memory) {
        this.memory = memory;
    }
}
public class TraditionDesign {
    public static void main(String[] args) {
        Computer computer = new Computer();
        AMDCpu cpu = new AMDCpu();
        computer.setCpu(cpu);
        DDR4 ddr4 = new DDR4();
        computer.setMemory(ddr4);
        computer.run();
    }
}
~~~
可以看到，我们想要个更改电脑的配件，那么类就要重新定义属性类型，相应的getter和setter方法也要更改，那么调用getter和setter方法的客户端也要更改代码，更改的地方越多，风险就越大。
##### 依赖倒置原则的核心是：不要面对实现编程，要面对接口或面对抽象类编程。
那么我们看看如果使用依赖倒置原则我们应该如何实现：
######首先定义两个接口：
~~~
interface Cpu{
    void run();
}
interface Memory{
    void run();
}
~~~
######然后实现类实现接口
~~~
class AMDCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("AMD CPU在工作");
    }
}
class IntelCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("Intel CPU在工作");
    }
}
class DDR3 implements Memory{

    @Override
    public void run() {
        System.out.println("DDR3 内存在工作");
    }
}
class DDR4 implements Memory{
    @Override
    public void run() {
        System.out.println("DDR4 内存在工作");
    }
}
~~~
更改我们的Computer属性为接口或抽象类类型的：
~~~
/**
 * 依赖倒置原则
 * @author ZhaoShuai
 * @date Create in 2020/4/9
 **/
public class DependenceInversionPrinciple {

    static class Computer{
        private Cpu cpu;
        private Memory memory;

        void run() {
            this.cpu.run();
            this.memory.run();
        }

        public Cpu getCpu() {
            return cpu;
        }

        public void setCpu(Cpu cpu) {
            this.cpu = cpu;
        }

        public Memory getMemory() {
            return memory;
        }

        public void setMemory(Memory memory) {
            this.memory = memory;
        }
    }

    public static void main(String[] args) {
        Computer computer = new DependenceInversionPrinciple.Computer();
        computer.setCpu(new IntelCpu());
        computer.setMemory(new DDR3());
        computer.run();
    }
}
~~~
从上面代码我们可以看出当我们需要组装一台电脑时，我们只需要在客户端设置不同的实现类对象，就可以随意组装电脑而不用更改Computer类。例如我们现在更改为AMD+DDR4：
~~~
public static void main(String[] args) {
        Computer computer = new DependenceInversionPrinciple.Computer();
        computer.setCpu(new AMDCpu());
        computer.setMemory(new DDR4());
        computer.run();
    }
~~~
我们之更改了客户端的调用，就完成了一台新电脑的组装，对比这两种是实现方式，我们可以发现
依赖倒置原则的好处有：   
`1.代码的可扩展性变好了，我们以后可能在新增新的CPU类型，无需改变现有的类，只需要实现Cpu接口，然后再客户端传递新的类型就行了。`  
`2.代码的耦合程度变低了，无论我们想要组装什么类型的电脑，都无需更改Computer类，因为类里的Cpu和Memory是接口类型，我们只要传递的是这个接口的实现，无论传递什么值都可以`  
所以依赖倒置原则的核心就是：`应该面向接口或抽象类编程`
### 5.迪米特法则(Low of Demeter)
##### 迪米特法则又叫：最少知识原则(Least Knowledge Principle) ,简称LKP 
迪米特原则要求类要小气一点，类只和自己的朋友交流，不和陌生人说话。  
朋友的定义：  
`1. 当前对象本身this`  
`2. 以参数的形式传入当前对象方法中的对象`  
`3. 当前对象的类成员变量`  
`4. 如果当前对象的类成员变量是一个集合，那么集合中的元素都是朋友`  
`5. 当前对象所创建的对象`  
迪米特法则的定义：两个类如果不必彼此直接通信，那么这两个类就不应该发生相互作用，如果其中一个类需要调用另一个类的某一个方法的，可以通过第三方转发这个调用。  
**只和朋友交流**
举例说明：  
在大学中，有很多的院系，每个院系都有院长，辅导员和学生，院长只和辅导员打交道，而辅导员和学生打交道。因此院长和学生就是陌生人的关系。  
假设院长要找几个学生干活，但是学生只听辅导员的，因为他不认识院长。  
设计类：
~~~
public class Student {

    public void work() {
        System.out.println("学生干活");
    }

}
public class Counsellor {

    private Student student;
    
    public void makeStudentWork() {
        this.student.work();
    }
    
    public Student getStudent() {
        return student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
}
~~~
首先我们看如果不使用迪米特原则，那么院长如果找学生干活的话：
~~~
public class President {

    public void makeCounsellorWork() {
            Student student = new Student();
            this.counsellor.setStudent(student);
            this.counsellor.makeStudentWork();
        }
    
        public Counsellor getCounsellor() {
            return counsellor;
        }
    
        public void setCounsellor(Counsellor counsellor) {
            this.counsellor = counsellor;
        }
}
~~~
因为学生不认识院长，只认识辅导员，因此院长首先要找到一个干活的学生，然后还要找到这个学生的辅导员，然后让这个辅导员指挥学生干活：
~~~
public class Traditional {

    public static void main(String[] args) {
        President president = new President();

        Counsellor counsellor = new Counsellor();
        president.setCounsellor(counsellor);
        president.makeCounsellorWork();
    }
}
~~~
院长和学生是陌生人，但是在方法内却依赖了学生这个类，这不符合迪米特法则。我们想一下， 如果院长找学生干活的话，那么他应该直接找辅导员，说：给我找两个学生来干个活。
找学生的事应该辅导员来做，而不是院长找学生。因此我们的方法，应该把找学生这个交给辅导员去做。
~~~
public class Counsellor {

    private Student student;

    public void makeStudentWork() {
        this.student = new Student();
        this.student.work();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
~~~
院长只需要告诉辅导员找个学生干活：
~~~
    public void makeCounsellorWork() {
        this.counsellor.makeStudentWork();
    }
~~~
至于辅导员怎么找学生，跟院长没有关系，当学生的方法属性等发生改变时，只需要更改辅导员类，而不需要修改院长这个类。  
**尽量降低一个类的访问权限, 减少与朋友的交流**  
迪米特法则要求类要小气一点，尽量建少与朋友的交流，也就是尽量少的提供public 方法,转而多使用private, default, protected等方法，尽量使类可以独立的完成自己的任务。   
我们想象一下装软件的过程，在装软件的页面，根据我们的选择，点击下一步跳转不同的页面。我们来实现这个调用：
~~~
/**
 * 假设一个软件，共有四个步骤：
 * 执行流程，当进入安装页面首先调用第一个方法，
 * 然后根据第一个方法的返回值决定调用第二个或者第三个方法。如果调用第二个方法则安装结束，如果调用第三个方法则根据返回结果决定是否调用第四个方法
 * 并结束安装。
 * @author ZhaoShuai
 * @date Create in 2020/4/17
 **/
public class App {

    public int first() {
        System.out.println("开始安装，进行第一步");
        return new Random().nextInt(4);
    }

    public void second() {
        System.out.println("调用结束安装方法");
    }

    public int third() {
        System.out.println("调用第三个方法");
        return new Random().nextInt(3);
    }

    public void four() {
        System.out.println("调用第四个方法");
    }

}
public class Client {

    public static void main(String[] args) {
        App app = new App();

        int first = app.first();
        while (first == 1 || first == 0) {
            first = app.first();
        }

        System.out.println("第一步返回结果：" + first);
        if (first == 2) {
            app.second();

        } else if (first == 3) {

            System.out.println("安装进行第二步");
            int third = app.third();

            System.out.println("第二步返回结果" + third);
            if (third == 2) {

                System.out.println("进行安装第三步");
                app.four();
                app.second();
            }
        }
    }
}
~~~  
方法很简单，我们会发现app类内部的方法，都是public的，而且会按照固定的模式去执行，而这个执行过程交给Client类来管理。也就是让客户端来决定下一步如何调用。
这种设计中，客户端调用大量的app方法，就会使客户端与app两个类的耦合度过高。这时无论修改app内哪儿个方法的返回值，都需要修改客户端的调用代码返回值。    
根据迪米特法则，我们可以把这个调用过程放进app类里面：  
~~~
public class App2 {

    public void startRun() {
        int first = this.first();
        while (first == 1 || first == 0) {
            first = this.first();
        }

        System.out.println("第一步返回结果：" + first);
        if (first == 2) {
            this.second();

        } else if (first == 3) {

            System.out.println("安装进行第二步");
            int third = this.third();

            System.out.println("第二步返回结果" + third);
            if (third == 2) {

                System.out.println("进行安装第三步");
                this.four();
                this.second();
            }
        }
    }

    private int first() {
        System.out.println("开始安装，进行第一步");
        return new Random().nextInt(4);
    }

    private void second() {
        System.out.println("调用结束安装方法");
    }

    private int third() {
        System.out.println("调用第三个方法");
        return new Random().nextInt(3);
    }

    private void four() {
        System.out.println("调用第四个方法");
    }
}
public class Client2 {
    public static void main(String[] args) {
        App2 app2 = new App2();
        app2.startRun();
    }
}
~~~
这样设计的意思就是：你已经是一个成熟的软件了，应该可以自己执行安装过程，而客户端只需要点击开始安装按钮，剩下的安装过程全都交给程序内部自己执行，这样设计
无论app2类内部的方法如何改变，我们都只需要在类内部更改，与外部调用无关。这样就做到了解耦。根据迪米特法则，如果我们确定客户端与app类在同一个包下，由客户端来
调用app2的安装，那么app2的类应该设计为包访问权限，即:`class App2{...}`  
设计原则：  
`1. 优先考虑设计成不变类final`  
`2. 如果一个方法放在本类中，既不增加类间关系，也不对本类产生负面影响，那么就放置在本类中`  
`3. 尽量减少类中的public方法，与接口隔离原则中接口要高内聚思想一样，类也要高内聚`  
`4. 谨慎使用Serializable,如果使用到了RMI方式传递对象，那么这个对象必须实现Serializable接口`  
迪米特法则的缺陷：  
   迪米特法则要求降低类之间的耦合关系，如果要调用尽量通过第三方调用，但是这样就会导致产生大量的中间第三方类，这个类里的大量方法仅仅只是转发类的调用，没有其他实际意义。这样就会导致类的复杂性增加。










### 6.开闭原则(Open Close Principle)(OCP)
#####开闭原则的核心思想：软件应该面对扩展是开放的，而面对修改是关闭的



