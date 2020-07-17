# jvm类加载机制
双亲委派机制：
jvm通过ClassLoader来加载类：
classLoader分为以下类型：
bootStrapClassLoader: 它主要负责加载%JAVA_HOME%/jre/lib,-Xbootclasspath参数指定的路径以及%JAVA_HOME%/jre/classes中的类
ExtClassLoader: 主要加载jre/lib/ext下的所有classes目录以及java.ext.dirs系统变量指定的路径中的类库。
AppClassLoader: 主要加载Classpath所指定的位置的类或jar文档。java程序默认类加载器。

BootStrap 是由c++写的，因此在java中找不到对象，所以对应的类加载器是null，ExtClassLoader是由java写的，由BootStrap加载。而我们ExtClassLoader
是加载jre拓展类的，也叫拓展类加载器,是AppClassLoader的父类。而AppClassLoader是默认的类加载器。

当我们系统要加载一个类时，双亲委派机制的工作流程：
首先AppClassLoader会向上查找，问ExtClassLoader：我要加载***类，你这有么？ExtClassLoader向上问BootStrap,我要加载***类，你这有么？
BootStrap如果有的话就返回这个类，如果没有的话就告诉ExtClassLoader我没有，然后ExtClassLoader会查看自己有没有这个类，如果有的话直接返回，如果没有
就告诉AppClassLoader我没有，然后AppClassLoader才会加载本地的类。


