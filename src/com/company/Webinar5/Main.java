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
                System.out.println("Please provide the size of Table " +
                        "(1-25 will be displayed if you provide wrong value)" +": ");
                displayMultiplicationTable(createMultiplicationTable(readResponseFromUser()));
                System.out.println("\n");
                break;
            case 2:
                displayMultiplicationTable(createMultiplicationTable(10));
                System.out.println("\n");
                break;
            case 3:
                System.out.println("Provide a number(if not correct the result will be for 5!): " );
                System.out.println("Result: " + factorial(readResponseFromUser()) + "\n");
                break;
            case 0:
                System.out.println("Bye bye");
                return 0;
            default:
                System.out.println("You provided wrong value");
        }
        return Integer.MIN_VALUE;
    }

    public static int readResponseFromUser(){
        Scanner scanner = new Scanner(System.in);
        try {
            return Math.abs(Integer.parseInt(scanner.nextLine()));
        }catch (NumberFormatException e){
            return 5;
        }
    }

    public static int[][] createMultiplicationTable(int size){
        int[][] table = new int[size+1][size+1];

        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table.length; j++) {
                table[i][j] = i*j;
            }
        }
        return table;
    }

    public static void displayMultiplicationTable(int [][] table){
        for (int i = 1; i <table.length; i++) {
            System.out.println();
            for (int j = 1; j < table.length; j++) {
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
