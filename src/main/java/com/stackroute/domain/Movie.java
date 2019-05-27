package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

    private int movieId;
    private String movieName;
    @Autowired
    private Actor actor;

    public Movie(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    public Movie(){

    }

    @Override
    public String
    toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\''+", " + actor +
                '}';
    }
}
