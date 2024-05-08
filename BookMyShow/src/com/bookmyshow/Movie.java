package com.bookmyshow;

public class Movie {
    int movieID;
    String movieName;
    int duration;

    public Movie(int movieID, String movieName, int duration) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.duration = duration;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void printMovie()
    {
        System.out.println( movieName + " " + duration);
    }
}
