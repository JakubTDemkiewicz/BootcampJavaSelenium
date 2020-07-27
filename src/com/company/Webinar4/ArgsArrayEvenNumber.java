package com.company.Webinar4;

import java.util.Random;

public class ArgsArrayEvenNumber {

    public static void main(String [] args) {
        try {
            int selectedNumber = Math.abs(Integer.parseInt(args[0]));
            System.out.println("You have selected number at: " + selectedNumber);
            int[] arrayWithRandomNumbers = new int[selectedNumber + 10];

            for (int i = 0; i < arrayWithRandomNumbers.length-1; i++) {
                arrayWithRandomNumbers[i] = new Random().nextInt(100)+5;
            }
            System.out.println("The value for selected index is: " + arrayWithRandomNumbers[selectedNumber]);
            if (arrayWithRandomNumbers[selectedNumber] % 2 == 0)
                System.out.println("The number is even");
            else
                System.out.println("The number is not even");
        }catch (NumberFormatException e) {
            System.out.println("You need to provide an Integer into argument");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Argument can't be empty, please provide an Integer");
        }
    }
}
