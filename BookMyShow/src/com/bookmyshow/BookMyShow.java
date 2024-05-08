package com.bookmyshow;

import com.bookmyshow.enums.City;
import com.bookmyshow.enums.SeatCategory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {

    BookMyShowData bookMyShowData;
    MovieController movieController;
    TheatreController theatreController;

    public BookMyShow()
    {
        movieController = new MovieController();
        theatreController = new TheatreController();
        bookMyShowData = new BookMyShowData();
    }

    public static void main(String[] args) {


        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.Initialize();
        bookMyShow.CreateBooking(City.DELHI, "3 Idiots");
    }

    public void Initialize()
    {
        bookMyShowData.CreateMovie(movieController);
        bookMyShowData.CreateTheatre(theatreController,movieController);

    }

    public void CreateBooking(City city, String movieName)
    {
        //find out the interested movie using moviename
        Movie interestedMovie = movieController.GetMovieByName(movieName);
        interestedMovie.printMovie();

        System.out.println("-----------------------------");
        //find all the theatres in that city running that movie;
        Map<Theatre, List<MovieShow>>  theatresInACity = theatreController.GetAllShow(city,interestedMovie);
        System.out.println("All the theatres running that movie : ");
        for (Map.Entry<Theatre, List<MovieShow>> entry : theatresInACity.entrySet()) {
            System.out.print("Theatre : ");
            entry.getKey().printTheatre();
            System.out.print("Movie Show : ");

            for(MovieShow show : entry.getValue())
            {
                show.printMovieShow();
            }
            System.out.println();
        }
        //now select a theatre and a show from this map
        Map.Entry<Theatre,List<MovieShow>> entry =  theatresInACity.entrySet().iterator().next();
        List<MovieShow> AvailableShowsInSelectedTheatre = entry.getValue();
        MovieShow interestedShow = AvailableShowsInSelectedTheatre.get(0);

        System.out.println("-----------------------------");
        System.out.print("Selected Show :");
        interestedShow.printMovieShow();
        //create a booking
        int selectedSeatID1 = 31;
        int selectedSeatID2 = 32;

        List<Integer> alreadyBookSeats = interestedShow.getBookedSeats();
        if(!alreadyBookSeats.contains(selectedSeatID1) && !alreadyBookSeats.contains(selectedSeatID2))
        {
            alreadyBookSeats.add(selectedSeatID1);
            alreadyBookSeats.add(selectedSeatID2);

            //get screen for that show
            Screen screen = interestedShow.getScreen();
            Seat s1=   screen.GetSeatByID(selectedSeatID1);
            Seat s2 = screen.GetSeatByID(selectedSeatID2);

            //Select the seats
            List<Seat> selectedSeats = new ArrayList<Seat>();
            selectedSeats.add(s1);
            selectedSeats.add(s2);

            Booking booking = new Booking(interestedShow,selectedSeats,new Payment());
            System.out.println("-----------------------------");
            booking.printBookingDetails();
            System.out.println("-----------------------------");
        }
        else
        {
            System.out.println("Oops! the seat is already booked");
            return;
        }
        System.out.println("BOOKING SUCCESSFUL");

    }

}
