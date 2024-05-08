package com.bookmyshow;

import java.util.List;

public class Booking {

    MovieShow show;
    List<Seat> bookedSeats;

    public Booking(MovieShow show, List<Seat> seats, Payment payment) {
        this.show = show;
        this.bookedSeats = seats;
        this.payment = payment;
    }

    Payment payment;

    public MovieShow getShow() {
        return show;
    }

    public void setShow(MovieShow show) {
        this.show = show;
    }

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void printBookingDetails()
    {
        System.out.println("Booking Details are as follows: ");
        show.printMovieShow();
        for(Seat seat : bookedSeats)
        {
            System.out.println(seat.getSeatID() + ": " + seat.getSeatCategory());

        }

    }
}
