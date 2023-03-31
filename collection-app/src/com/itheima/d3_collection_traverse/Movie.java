package com.itheima.d3_collection_traverse;

/**
 * @author : 王希辰
 * @date : 2023/3/4 15:48
 */
public class Movie {
    private String movieName;
    private double score;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public Movie(String movieName, double score, String actor) {
        this.movieName = movieName;
        this.score = score;
        this.actor = actor;
    }

    private String actor;
}
