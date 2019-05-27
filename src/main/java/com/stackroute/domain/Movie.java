package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

    private int movieId;
    private String movieName;
    @Autowired
    private Actor actor;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
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
