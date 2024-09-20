package org.example;

public class DoubleDimensionArray {
    private int [][] arr;
    public int rows;
    public int cols;

    //Constructor
    public DoubleDimensionArray(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = 0;
            }
        }
    }

    //Methods
    //Insert element into valid index
    public void insert(int row, int col, int value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            arr[row][col] = value;
            System.out.println("Inserted " + value + " at position (" + row + ", " + col + ")");
        } else {
            System.out.println("Invalid index for insertion.");
        }
    }

    //Shows all indexes in the array
    public void traverse() {
        System.out.println("Array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }



    //Search for a specific index
    public boolean search(int value) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == value) {
                    System.out.println("Element " + value + " found at position (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Element " + value + " not found.");
        return false;
    }

    //Delete an element at a specific index
    public void delete(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            System.out.println("Deleted element at position (" + row + ", " + col + ")");
            arr[row][col] = 0; 
        } else {
            System.out.println("Invalid index for deletion.");
        }
    }
}

