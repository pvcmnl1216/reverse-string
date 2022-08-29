package com.jap;

import java.util.Scanner;

public class ReverseStringDemo {
    public static void main(String[] args) {

        // Creating a new scanner object that reads from the standard input stream.
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the the word");

        //Create a String object.
        String string = scanner.nextLine();


        //Create an object of the class ReverseStringDemo
        ReverseStringDemo reverseStringDemo = new ReverseStringDemo();


        //Call the method getReverseString() and pass the parameter
        String reversedString = reverseStringDemo.getReverseString(string);
        System.out.println("reversedString = " + reversedString);

    }

    //Write the logic to reverse the String  inside the below method and return the reverse String.
    public String getReverseString(String string) {
        String reverseString = " ";
        // Getting the character at the index and adding it to the reverseString.
        for (int index = string.length() - 1; index >= 0; index--) {
            reverseString += string.charAt(index);
        }

        return reverseString.trim();
    }


}

