package com.spring.beans;

/**
 * @Classname HelloWorld
 * @Description TODO
 * @Date 2020/11/16 0:05
 * @Created by zhaoshuangjian
 */
public class HelloWorld {
    private String studentName;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }
    public void sayHello(){
        System.out.println("Hello"+" "+studentName);
    }
}
