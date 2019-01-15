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
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main {

    public static void main(String[] args) {

        Movie movie=new Movie();





        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie m1=(Movie) beanFactory.getBean("movie");
        System.out.println(m1);

        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie m2=((DefaultListableBeanFactory) beanDefinitionRegistry).getBean(Movie.class);
        System.out.println(m2.getActor().getGender());

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie m3=context.getBean(Movie.class);
        System.out.println(m3.getActor().getAge());




    }
}
