package com.bookmyshow;

import com.bookmyshow.enums.City;
import com.bookmyshow.enums.SeatCategory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookMyShowData {

    public void CreateMovie(MovieController movieController)
    {
        Movie movie1 = new Movie(1,"3 Idiots",120);
        Movie movie2 = new Movie(2,"Jab We Met",150);
        Movie movie3 = new Movie(3,"Dunki", 132);
        Movie movie4 = new Movie(4,"Article 370",153);

        movieController.AddMovieInCity(movie1, City.DELHI);
        movieController.AddMovieInCity(movie2,City.DELHI);
        movieController.AddMovieInCity(movie3,City.DELHI);
        movieController.AddMovieInCity(movie4,City.DELHI);
        movieController.AddMovieInCity(movie2,City.NOIDA);
        movieController.AddMovieInCity(movie3,City.NOIDA);
        movieController.AddMovieInCity(movie3,City.FARIDABAD);
        movieController.AddMovieInCity(movie4,City.FARIDABAD);
        movieController.AddMovieInCity(movie4,City.GURGAON);
        movieController.AddMovieInCity(movie1,City.GURGAON);
        movieController.AddMovieInCity(movie1,City.GHAZIABAD);
        movieController.AddMovieInCity(movie2,City.GHAZIABAD);


    }

    public void CreateTheatre(TheatreController theatreController,MovieController movieController)
    {
        Movie movie1 = movieController.GetMovieByName("3 Idiots");
        Movie movie2 = movieController.GetMovieByName("Jab We Met");

        Theatre theatre1 = new Theatre(1,"PVR",City.DELHI);
        theatre1.setScreenList(CreateScreens());

        List<MovieShow> movieShowList1 = new ArrayList<MovieShow>();
        MovieShow movieShow1 = new MovieShow(1,
                movie1,
                theatre1.getScreenList().get(0),
                LocalDateTime.of(2024, 3, 20, 13, 0));

        MovieShow movieShow2 = new MovieShow(2,
                movie2,
                theatre1.getScreenList().get(1),
                LocalDateTime.of(2024, 3, 20, 17, 0));

        movieShowList1.add(movieShow1);
        movieShowList1.add(movieShow2);
        theatre1.setMovieShowList(movieShowList1);



        Theatre theatre2 = new Theatre(2,"Cinepolis",City.NOIDA);
        theatre2.setScreenList(CreateScreens());

        List<MovieShow> movieShowList2 = new ArrayList<MovieShow>();
        MovieShow movieShow3 = new MovieShow(1,
                movie1,
                theatre2.getScreenList().get(0),
                LocalDateTime.of(2024, 3, 20, 12, 5));

        MovieShow movieShow4 = new MovieShow(2,
                movie2,
                theatre2.getScreenList().get(1),
                LocalDateTime.of(2024, 3, 20, 16, 10));

        movieShowList2.add(movieShow3);
        movieShowList2.add(movieShow4);
        theatre2.setMovieShowList(movieShowList2);

        theatreController.AddTheatreInACity(City.DELHI,theatre1);
        theatreController.AddTheatreInACity(City.DELHI,theatre2);
        theatreController.AddTheatreInACity(City.NOIDA,theatre1);
        theatreController.AddTheatreInACity(City.NOIDA,theatre2);

    }



    public List<Screen> CreateScreens()
    {
        List<Screen> screenList = new ArrayList<Screen>();

        Screen screen1 = new Screen(1,CreateSeats());
        Screen screen2 = new Screen(2,CreateSeats());
        screenList.add(screen1);
        screenList.add(screen2);

        return  screenList;
    }

    public List<Seat> CreateSeats()
    {
        SeatFactory seatFactory = new SeatFactory();
        List<Seat> seatList = new ArrayList<Seat>();

        for(int i=1;i<=40;i++)
            seatList.add(seatFactory.GetSeat(i, SeatCategory.SILVER));

        for(int i=41;i<=80;i++)
            seatList.add(seatFactory.GetSeat(i, SeatCategory.GOLD));

        for(int i=81;i<=100;i++)
            seatList.add(seatFactory.GetSeat(i, SeatCategory.PLATINUM));

        return  seatList;
    }



}
