package com.xiazhi.principle.srp;

/**
 * @author ZhaoShuai
 * @date Create in 2020/4/12
 **/
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
