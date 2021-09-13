/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;

public class App 
{
    static final int ONE_GALLON = 350;
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        //Prompt user input
        System.out.println("What is the length of the room in feet? ");
        String strLength = scan.nextLine();
        System.out.println("What is the width of the room in feet? ");
        String strWidth = scan.nextLine();

        //Convert
        double length = Double.parseDouble(strLength);
        double width = Double.parseDouble(strWidth);

        //Calculations and output
        double area = length * width;
        double paint = Math.ceil(area / ONE_GALLON);

        DecimalFormat decimalFormat = new DecimalFormat("0.#####");
        String output = decimalFormat.format(Double.valueOf(paint));

        System.out.println("You will need to purchase " +output+ " gallons of paint to cover " +area+ " square feet. ");

    }
}
