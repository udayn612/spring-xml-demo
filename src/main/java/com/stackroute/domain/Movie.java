package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware,BeanFactoryAware
{

    private Actor actor;



    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Movie()
    {

    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public Actor getActor() {

        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Actor actor= (Actor) applicationContext.getBean("actor3");
        System.out.println("From application context"+actor);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        Actor actor=(Actor)beanFactory.getBean("actor3");
        System.out.println("From Bean Factory"+actor);
    }

    public void setBeanName(String s) {
        System.out.println("From BeanName Aware "+s);
    }
}
