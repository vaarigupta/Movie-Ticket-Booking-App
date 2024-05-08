package com.bookmyshow;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MovieShow {

    int showID;
    Movie movie;
    Screen screen;
    LocalDateTime movieStartTime;
    List<Integer> bookedSeats;

    public MovieShow(int showID, Movie movie, Screen screen, LocalDateTime movieStartTime) {
        this.showID = showID;
        this.movie = movie;
        this.screen = screen;
        this.movieStartTime = movieStartTime;
        bookedSeats = new ArrayList<>();
    }

    public int getShowID() {
        return showID;
    }

    public void setShowID(int showID) {
        this.showID = showID;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public LocalDateTime getMovieStartTime() {
        return movieStartTime;
    }

    public void setMovieStartTime(LocalDateTime movieStartTime) {
        this.movieStartTime = movieStartTime;
    }

    public List<Integer> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<Integer> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public void printMovieShow()
    {
        System.out.println( movie.getMovieName() + ", Screen ID: " + screen.getScreenID());
    }
}
