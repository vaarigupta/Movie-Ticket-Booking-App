package com.bookmyshow;

import com.bookmyshow.enums.City;

import java.util.List;

public class Theatre {
    int theatreID;
    String theatreName;
    City city;
    List<Screen> screenList;
    List<MovieShow> movieShowList;

    public Theatre(int theatreID,String theatreName, City city) {
        this.theatreID = theatreID;
        this.theatreName = theatreName;
        this.city = city;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }
    public List<Screen> getScreenList() {
        return screenList;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }

    public List<MovieShow> getMovieShowList() {
        return movieShowList;
    }

    public void setMovieShowList(List<MovieShow> movieShowList) {
        this.movieShowList = movieShowList;
    }

    public int getTheatreID() {
        return theatreID;
    }

    public void setTheatreID(int theatreID) {
        this.theatreID = theatreID;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void printTheatre()
    {
        System.out.println(theatreName + ", " + city);
    }
}
