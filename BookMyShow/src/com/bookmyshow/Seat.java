package com.bookmyshow;

import com.bookmyshow.enums.SeatCategory;

public class Seat {

    int seatID;
    SeatCategory seatCategory;

    public  Seat(){}

    public Seat(int seatID, SeatCategory seatCategory) {
        this.seatID = seatID;
        this.seatCategory = seatCategory;
    }

    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public SeatCategory getSeatCategory() {
        return seatCategory;
    }

    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }

    public void printSeat()
    {
        System.out.println(seatID + " " + seatCategory );
    }

}
