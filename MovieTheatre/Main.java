package org.example;

public class Main {
    public static void main(String[] args) {
        //init theatre
        MovieTheatre theatre = new MovieTheatre(5, 6);

        //reserve seats
        theatre.reserveSeat(0, 0);
        theatre.reserveSeat(1, 3);
        theatre.reserveSeat(4, 5);
        theatre.reserveSeat(0, 2);
        theatre.reserveSeat(2, 4);
        theatre.reserveSeat(3, 1);
        //seat already reserved
        theatre.reserveSeat(4, 5);


        //print layout
        theatre.printSeatLayout();

        //unreserve seats
        theatre.unreserveSeat(0, 0);
        theatre.unreserveSeat(1, 3);
        //Seats already unreserved
        theatre.unreserveSeat(0, 5);


        //pritn layout
        theatre.printSeatLayout();
    }
}
