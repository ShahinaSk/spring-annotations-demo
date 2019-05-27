package com.stackroute.config;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {

    @Bean(name = "movie")
    public Movie getMovie(){
        Movie movie=new Movie();
        movie.setMovieId(101);
        movie.setMovieName("Kalank");
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

}
