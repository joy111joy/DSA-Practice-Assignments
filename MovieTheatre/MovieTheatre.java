package org.example;

public class MovieTheatre {
    private Seat[][] seats;

    // Constructor
    public MovieTheatre(int numRows, int seatsPerRow) {
        seats = new Seat[numRows][seatsPerRow];

        for (int row = 0; row < numRows; row++) {
            for (int seat = 0; seat < seatsPerRow; seat++) {
                seats[row][seat] = new Seat("Row: " + row  + " Seat: " + seat);  // Provide seat number
            }
        }
    }


    // Reserve a seat by row and num
    public void reserveSeat(int row, int seat) {
        //check if entered seat is valid
        if (row >= 0 && row < seats.length && seat >= 0 && seat < seats[row].length) {
            seats[row][seat].reserve();
        } else {
            System.out.println("Invalid seat selection.");
        }
    }

    // unreserv a seat by row and num
    public void unreserveSeat(int row, int seat) {
        //check if entered seat is valid
        if (row >= 0 && seat >= 0 && seat < seats[row].length) {
            seats[row][seat].unreserve();
        }
        else {
            System.out.println("Invalid seat selection.");
        }
    }

    //print layout
    public void printSeatLayout() {
        for (int row = 0; row < seats.length; row++) {
            for (int seat = 0; seat < seats[row].length; seat++) {
                if (seats[row][seat].isAvailable()) {
                    System.out.print("0 ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
