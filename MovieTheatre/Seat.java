package org.example;
import java.util.ArrayList;

public class Seat {
    private String seatNumber;
    private Boolean available = true;

    //constructor
    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    //methods
    public String getSeatNumber() {
        return seatNumber;
    }

    //reserve seat
    public void reserve() {
        if (available) {
            available = false;
            System.out.println("Reserved seat " + seatNumber);
        }
        else {
            System.out.println("This seat number: " + seatNumber + " is already reserved");
        }
    }

    //check if avaiable
    public boolean isAvailable() {
        return available;
    }

    //unreserve seat
    public void unreserve() {
        if (!available) {
            available = true;
            System.out.println("Unreserved seat " + seatNumber);
        }
        else {
            System.out.println ("ERROR: this seat number is not reserved");
        }
    }




}
