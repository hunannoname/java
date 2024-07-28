package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Hello! What is the weight of youp parcel in kilograms?");

            var weight = scanner.nextDouble();

            if (weight == 0)

                break;
10
            System.out.println("Weight of your parsel " + weight + " kilograms. Enter the price per kilograms please!");

            var price = scanner.nextDouble();

            System.out.println("Total price of your parsel: " + weight * price + " dollars");
        }
    }
}