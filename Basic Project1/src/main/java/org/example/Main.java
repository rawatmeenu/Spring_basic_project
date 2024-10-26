package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //if bean name is not specified in APPCONFIG then it will take the menthod name as bean name
        //Desktop desk =  context.getBean("desktop", Desktop.class);

        //to set the bean name go to appcnonfig and set the bean name or can aslo give the array of bean name and can use the one.
       // Desktop desk =  context.getBean("deskt", Desktop.class);

        //to mame the object two or use the scope
        Desktop desk =  context.getBean(Desktop.class);
        Desktop desk1 =  context.getBean(Desktop.class);
        desk.compile();


    }

}