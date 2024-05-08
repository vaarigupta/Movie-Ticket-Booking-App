package com.bookmyshow;

import com.bookmyshow.enums.SeatCategory;

public class SeatFactory {

    public Seat GetSeat(int id, SeatCategory seatCategory)
    {
        if(SeatCategory.SILVER.equals(seatCategory))
            return new Seat(id, seatCategory);
        else if(SeatCategory.GOLD.equals(seatCategory))
            return new Seat(id,seatCategory);
        else if(SeatCategory.PLATINUM.equals(seatCategory))
            return new Seat(id,seatCategory);
        else
            return new Seat();
    }
}
