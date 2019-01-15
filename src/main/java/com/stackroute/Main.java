package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main {

    public static void main(String[] args) {



        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
//        Movie m1=(Movie)applicationContext.getBean("movieA");
//        Actor actor=m1.getActor();
       // System.out.println(actor);


//            Movie movie1=(Movie)applicationContext.getBean("movieA");
//            Actor actor1=movie1.getActor();
//            System.out.println(actor1);
//
//
//        Movie movie2=(Movie)applicationContext.getBean("movieB");
//        Actor actor2=movie2.getActor();
//        System.out.println(actor2);




        ((ClassPathXmlApplicationContext) applicationContext).close();



    }
}
