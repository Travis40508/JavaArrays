package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Home {
    /**Declaring our member variables */
    private Scanner scanner;
    private boolean isValidAnswer;

    /**Here we're instantiating our scanner member variable and starting the introduction of the application */
    public void init() {
        scanner = new Scanner(System.in);
        introduction();
    }

    /**This introduces the user to the application before giving them the ability to choose what they wish to learn more about. */
    private void introduction() {
        System.out.println("Java has many examples of merging several forms of information together. +\n" +
                "In this Module we'll be going over two such examples : Arrays and ArrayLists.");
        queryResponse();
    }

    /**This method awaits the user's response and calls the correct method accordingly. If the user enters a valid response, this cycle
     * breaks and they learn about the topic they've entered. If their response isn't valid, they're informed of the fact and the cycle continues. */
    private void queryResponse() {
        isValidAnswer = false;
        while (!isValidAnswer) {
            System.out.println("Which would you like to learn more about? \n" +
                    "1. Arrays \n" +
                    "2. Lists/ArrayLists \n" +
                    "3. Exit Application");
            switch (scanner.nextLine()) {
                case "1":
                    showArrayIntroduction();
                    showArrayInformation();
                    isValidAnswer = true;
                    break;
                case "2":
                    showArrayListIntroduction();
                    showArrayListInformation();
                    isValidAnswer = true;
                    break;
                case "3":
                    exitApplication();
                    isValidAnswer = true;
                    break;
                default:
                    invalidResponse();
                    isValidAnswer = false;
                    break;
            }
        }
    }

    /**This simply prints out an introduction about Arrays. We're doing an introductory method so that we don't have to print it every single time
     * the user returns to be shown array options. */
    public void showArrayIntroduction() {
        System.out.println("The major difference between an Array and a List/ArrayList is mutability. \n" +
                "Mutability refers to the ability to change. An array has a set of data that never changes, \n" +
                "either because it can't, or because it isn't expected to. Therefore it's immutable. More on Arrays:");
    }

    /**This simply prints out an introduction about ArrayLists. We're doing an introductory method so that we don't have to print it every single time
     * the user returns to be shown arraylist options. */
    public void showArrayListIntroduction() {
        System.out.println("The major difference between an Array and a List/Arraylist is mutability. \n" +
                "Mutability refers to the ability to change. Therefore Lists and ArrayLists are mutable.");
    }


    /**Here we're giving the user options on what they wish to learn about regarding arrays. */
    public void showArrayInformation() {
        isValidAnswer = false;
        System.out.println("Select One of the Following:\n");
        while(!isValidAnswer) {
            System.out.println(
                    "1. Array Examples \n" +
                    "2. Array Methods \n" +
                    "3. Return Home");
            switch (scanner.nextLine()) {
                case "1" :
                    showArrayExamples();
                    isValidAnswer = true;
                    break;
                case "2" :
                    discussArrayMethods();
                    isValidAnswer = true;
                    break;
                case "3" :
                    queryResponse();
                    isValidAnswer = true;
                    break;
                default :
                    invalidResponse();
                    isValidAnswer = false;
                    break;
            }
        }

    }

    /**Here we're giving the user options on what they wish to learn about regarding arraylists. */
    public void showArrayListInformation() {
        isValidAnswer = false;
        System.out.println("Select One of the Following:\n");
        while(!isValidAnswer) {
            System.out.println(
                    "1. ArrayList Examples \n" +
                            "2. ArrayList Methods\n" +
                            "3. Return Home");
            switch (scanner.nextLine()) {
                case "1" :
                    showArrayListExamples();
                    isValidAnswer = true;
                    break;
                case "2" :
                    discussArrayListMethods();
                    isValidAnswer = true;
                    break;
                case "3" :
                    queryResponse();
                    isValidAnswer = true;
                    break;
                default :
                    invalidResponse();
                    isValidAnswer = false;
                    break;
            }
        }

    }

    /**This method simply exits the application. */
    public void exitApplication() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    /**This method tells the user that their response is invalid and to try again. */
    public void invalidResponse() {
        System.out.println("Invalid Response. Please try again!");
    }

    /**Here we're offering all of the options the user has regarding arrays. */
    public void showArrayExamples() {
        System.out.println("Some examples of Arrays include : \n" +
                "1. Days of the Week - These aren't changing, the same 7 will always hold true and unchanging. \n" +
                "2. Months in a Year - These twelve months will always comprise the array of months. \n" +
                "3. Cast of the Brady Bunch - This show is over, so it can never lose/add members. Therefore its list is set in stone.\n\n");
        showArrayInformation();
    }

    /**This will give various examples of array methods, while creating an array of these examples and printing them out in the process. This will
     * give the students an example on how to use arrays, while giving them concrete information on the subject. */
    public void discussArrayMethods() {
        int position = 1;
        String array[] = new String[3];
        array[0] = "sort - Sorts array according to specifications";
        array[1] = "equals - Performs a boolean check as to its values are equal to another's.";
        array[2] = "length - Returns size of Array.";
        System.out.println("Arrays have various methods that can be used alongside Them. Arrays are, of course, less \n" +
                "flexible than ArrayLists, as they cannot shrink or grow, so their methods are limited. Some examples of Array \n" +
                "methods include:");

        for(int i = 0; i < array.length; i++) {
            System.out.println(position + ". " + array[i]);
            position++;
        }
        System.out.println("\n");

        showArrayInformation();
    }

    /**Here we're creating an arraylist so that we can iterate through it to both provide information on arraylists, and an example on how to create
     * one simultaneously. */
    public void showArrayListExamples() {
        int position = 1;
        List<String> arrayList = new ArrayList();
        arrayList.add("Members of a basketball team");
        arrayList.add("People in line.");
        arrayList.add("Video games in a library");

        System.out.println("ArrayLists have various methods, such as:");
        for(int i = 0 ; i < arrayList.size(); i++) {
            System.out.println(position + ". " + arrayList.get(i));
            position++;
        }
        System.out.println("\n");
        showArrayListInformation();
    }

    /**This simply prints information regarding ArrayList methods. */
    public void discussArrayListMethods() {
        System.out.println("Some examples of ArrayList methods include: \n" +
                "1. Add - Adds to the end of the ArrayList. \n" +
                "2. Remove - Removes item from the ArrayList \n" +
                "3. Pop - Removes and returns top element \n" +
                "4. Push - Adds element to the first position in the list");
        showArrayListInformation();
    }
}
