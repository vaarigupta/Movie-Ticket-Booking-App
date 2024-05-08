package com.bookmyshow;

import com.bookmyshow.enums.City;

import java.util.*;

public class TheatreController {

    Map<City, List<Theatre>> theatresInACity;
    List<Theatre> theatreList;

    public TheatreController()
    {
        theatresInACity = new HashMap<City, List<Theatre>>();
        theatreList = new ArrayList<Theatre>();
    }
    public TheatreController(Map<City, List<Theatre>> theatresInACity, List<Theatre> theatreList) {
        this.theatresInACity = theatresInACity;
        this.theatreList = theatreList;
    }

 /*   public List<Theatre> getTheatreList() {
        return theatreList;
    }

    public void setTheatreList(List<Theatre> theatreList) {
        this.theatreList = theatreList;
    }
*/
    public void AddTheatreInACity(City city, Theatre theatre)
    {
        if(!theatreList.contains(theatre))
        {
            theatreList.add(theatre);
        }

        if(theatresInACity.containsKey(city))
        {
            theatresInACity.get(city).add(theatre);
        }
        else
        {
            theatresInACity.put(city,new ArrayList<Theatre>(Arrays.asList(theatre)));
        }
    }

    public List<Theatre> GetTheatreInACity(City city)
    {
        return theatresInACity.get(city);
    }

    public  Map<Theatre, List<MovieShow>> GetAllShow(City city, Movie interestedMovie)
    {
        Map<Theatre,List<MovieShow>> showsInATheatre = new HashMap<Theatre, List<MovieShow>>();
        List<Theatre> threatresAvailable = GetTheatreInACity(city);
        for(Theatre t : threatresAvailable)
        {
           List<MovieShow> showsForInterestedMovie = new ArrayList<MovieShow>();
           for(MovieShow ms : t.getMovieShowList())
           {
               if(ms.getMovie().equals(interestedMovie))
                   showsForInterestedMovie.add(ms);

           }
           if(!showsForInterestedMovie.isEmpty())
           {
               showsInATheatre.put(t,showsForInterestedMovie);
           }
        }
        return showsInATheatre;

    }
}
