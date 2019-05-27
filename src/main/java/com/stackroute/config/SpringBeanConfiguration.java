package com.stackroute.config;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

    @Bean(name ="movie")
    public Movie getMovie(){

        return new Movie(101,"Pokiri");
    }
    @Bean(name = "actor")
    public Actor getActor(){
        return new Actor("Mahesh","Male",38);
    }

}
