package com.example.FullStackJavaBatchMarch.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mobile {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(SimConfig.class);
        Jio jio = context.getBean(Jio.class);
        jio.Calling();
        jio.Data();

        Idea idea = context.getBean(Idea.class);
        idea.Calling();
        idea.Data();


    }
}
