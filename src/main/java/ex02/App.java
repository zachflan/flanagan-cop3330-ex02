/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String inputString = in.nextLine();

        int charNum = inputString.length( );

        String outputString = inputString + " has " + charNum + " characters.";
        System.out.println(outputString);
    }
}