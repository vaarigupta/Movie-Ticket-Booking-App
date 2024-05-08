package com.bookmyshow;

import com.bookmyshow.enums.City;

import java.util.*;

public class MovieController {

    Map<City, List<Movie>> moviesInACity;
    List<Movie> movieList;

    public MovieController()
    {
        moviesInACity = new HashMap<City, List<Movie>>();
        movieList = new ArrayList<Movie>();
    }

    public MovieController(Map<City, List<Movie>> moviesInACity, List<Movie> movieList) {
        this.moviesInACity = moviesInACity;
        this.movieList = movieList;
    }

/*    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public void addMovieInList(Movie movie)
    {
        movieList.add(movie);
    }

    public void removeMovieInList(Movie movie)
    {
        movieList.remove(movie);
    }*/

    public void AddMovieInCity(Movie movie,City city)
    {
        if(!movieList.contains(movie))
        {
            movieList.add(movie);
        }
       if(moviesInACity.containsKey(city))
       {
           moviesInACity.get(city).add(movie);
       }
       else
       {
           moviesInACity.put(city,
                   new ArrayList<Movie>(Arrays.asList(movie)));
       }
    }

    public List<Movie> GetMovieByCity(City city)
    {
        return moviesInACity.get(city);
    }

    public Movie GetMovieByName(String movieName)
    {
        for(Movie movie : movieList)
        {
            if(movie.getMovieName().equalsIgnoreCase(movieName))
            {
                return movie;
            }
        }
        return null;
    }

}
