package com.stackroute.config;


import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {

    @Bean(name = "movie1")
    public Movie getMovie1(){
        Movie movie=new Movie();
        movie.setMovieId(101);
        movie.setMovieName("Kalank");
        return movie;
    }

    @Bean(name = "movie2")
    public Movie getMovie2(){
        Movie movie=new Movie();
        movie.setMovieId(102);
        movie.setMovieName("SOTY");
        return movie;
    }

    @Bean(name = "actor")
    public Actor getActor(){
        Actor actor=new Actor();
        actor.setName("Varun");
        actor.setGender("Male");
        actor.setAge(30);
        return actor;
    }
    @Bean(name = "beanlifecycledemobean",initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifeCycleDemoBean getBeanLifeCycleDemoBean(){
        return new BeanLifeCycleDemoBean();
    }

    @Bean(name = "beanpostprocessordemo")
    public BeanPostProcessorDemoBean getBeanPostProcessorDemoBean(){
        return new BeanPostProcessorDemoBean();
    }

}
