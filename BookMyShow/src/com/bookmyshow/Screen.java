package com.bookmyshow;

import java.util.List;

public class Screen {

    int screenID;
    List<Seat> seatList;

    public Screen(int screenID, List<Seat> seatList) {
        this.screenID = screenID;
        this.seatList = seatList;
    }

    public int getScreenID() {
        return screenID;
    }

    public void setScreenID(int screenID) {
        this.screenID = screenID;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public Seat GetSeatByID(int seatID)
    {
       for(Seat s: seatList)
       {
           if(s.getSeatID() == seatID )
               return s;
       }
       return null;
    }

    public void printScreen()
    {
        System.out.println(screenID + " ");
    }
}
