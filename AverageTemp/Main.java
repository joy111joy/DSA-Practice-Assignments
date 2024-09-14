package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of temperatures: ");
        int numberOfTemperatures = scanner.nextInt();

        double[] temperatures = new double[numberOfTemperatures];

        double sum = 0;

        for (int i = 0; i < numberOfTemperatures; i++) {
            System.out.println("Please enter temperature number" + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
            sum += temperatures[i];
        }

        double averageTemps = sum/numberOfTemperatures;
        System.out.println("The average temperature is " + averageTemps);

        int tempsAboveAverage = 0;
        for (double i : temperatures) {
            if (i > averageTemps) {
                tempsAboveAverage++;
            }
        }

        System.out.println("The number of days above the average temperature is: " + tempsAboveAverage);
    }
}