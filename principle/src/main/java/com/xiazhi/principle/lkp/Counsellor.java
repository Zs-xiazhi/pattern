package com.xiazhi.principle.lkp;

/**
 * 辅导员,辅导员和学生是朋友
 * @author ZhaoShuai
 * @date Create in 2020/4/16
 **/
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
