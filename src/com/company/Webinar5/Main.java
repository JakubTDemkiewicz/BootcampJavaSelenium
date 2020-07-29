package com.company.Webinar5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int selectedOption;
        do  {
            displayMenu();
            selectedOption = handleMenuOptions();
        }while ((selectedOption !=0));
    }

    public static void displayMenu(){
        System.out.println("\t\t\tMenu");
        System.out.println("1. Create and display multiplication table for the selected size");
        System.out.println("2. Display standard multiplication table for 1-100(Size=10)");
        System.out.println("3. Display factorial for selected value: ");
        System.out.println("0. Close program");
        System.out.println("What you want to do? : ");
    }

    public static int handleMenuOptions(){
        switch (readResponseFromUser()){
            case 1:
                createAndDisplayCustomMultiplicationTable();
                break;
            case 2:
                displayMultiplicationTable(createMultiplicationTable(10));
                System.out.println("\n");
                break;
            case 3:
                displayFactorialResult();
                break;
            case 0:
                System.out.println("Bye bye");
                return 0;
            default:
                System.out.println("You provided wrong value");
        }
        return Integer.MIN_VALUE;
    }

    public static void displayFactorialResult() {
        System.out.println("Provide a number: " );
        int value = readResponseFromUser();
        if (value >= 0)
            System.out.println("Result: " + factorial(value) + "\n");
        else
            System.out.println("Wrong value!");
    }

    public static void createAndDisplayCustomMultiplicationTable() {
        System.out.println("Please provide the size of Table: ");
        int value =readResponseFromUser();
        if (value > 0)
            displayMultiplicationTable(createMultiplicationTable(value));
        else
            System.out.println("Wrong value!");
        System.out.println("\n");
    }

    public static int readResponseFromUser(){
        Scanner scanner = new Scanner(System.in);
        try {
            return Math.abs(Integer.parseInt(scanner.nextLine()));
        }catch (NumberFormatException e){
            return -1;
        }
    }

    public static int[][] createMultiplicationTable(int size){
        int[][] table = new int[size][size];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i+1)*(j+1);
            }
        }
        return table;
    }

    public static void displayMultiplicationTable(int [][] table){
        for (int i = 0; i <table.length; i++) {
            System.out.println();
            for (int j = 0; j < table.length; j++) {
                System.out.print(" " + table[i][j] + " ");
            }
        }
    }

    public static int factorial(int n){
        if (n <= 1){
            return 1;
        }else {
            return  n * factorial(n-1);
        }
    }
}
