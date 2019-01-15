package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware
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
        Actor actor= (Actor) applicationContext.getBean("actor1");
    }
}
