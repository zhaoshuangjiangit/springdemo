package com.spring.test;

import com.spring.beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname TestDemo
 * @Description TODO
 * @Date 2020/11/16 0:07
 * @Created by zhaoshuangjian
 */
public class TestDemo {
    public static void main(String[]args){
        // 方式一 不用框架

        /*//不使用Spring框架之前的步骤
        //1.创建一个HelloWorld的对象
        HelloWorld helloWorld = new HelloWorld();
        //2.为实例对象的属性赋值
        helloWorld.setStudentName("zzzzzzzzzzzzzzzzzzz中国万岁！！！");
        //3.调用对象的方法
        helloWorld.sayHello();*/



        //方式二 利用Spring IOC调用 Bean
        //使用Spring框架后
        //1.创建Spring IOC 容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        //2.通过IOC容器对象来得到Helloworld对应的对象，利用bean id来唯一标识这个对象
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        //3.调用sayHello()方法
        helloWorld.sayHello();

    }
}
