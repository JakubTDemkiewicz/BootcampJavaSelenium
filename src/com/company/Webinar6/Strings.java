package com.company.Webinar6;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {
        String text = "Na wyścigach wyścigowych wyścigówek wyścigowych wyścigówka wyścigowa wyścignęła " +
                "wyścigówkę wyścigową numer sześć.";
        String [] textArray = text.split(" ");

        countLetters(text, 'w');
        countLetters(text, 'o');
        System.out.println();

        displayWordsLengthAndWords(textArray);
        String [] textSortedDescending = sortDescByLength(textArray);
        displayWordsLengthAndWords(textSortedDescending);
        System.out.println();

        System.out.println(text.replace("wyścig","nowa") + "\n");

        String firstsAndLastsWords = textArray[0].concat(" " + textArray[1]).concat(" " + textArray[textArray.length-2])
                .concat(" " + textArray[textArray.length-1]);
        System.out.println(firstsAndLastsWords + "\n");

        displaySortedAndContactedSubArray(textArray, 2, textArray.length-2);
    }

    public static void countLetters(String text, char letter) {
        int letterCounter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                letterCounter++;
            }
        }
        System.out.println(letter + " występuje: " + letterCounter);
    }

    public static void displayWordsLengthAndWords(String[] textArray) {
        displayWordLength(textArray);
        displayArray(textArray);
    }

    public static void displayWordLength (String[] textArray) {
        for (String str: textArray){
            System.out.print(str.length() + " ");
        }
    }

    public static void displayArray(String[] displayArray) {
        System.out.println(Arrays.toString(displayArray));
    }

    public static String[] sortDescByLength(String[] arrayToSort){
        String [] array = arrayToSort.clone();
        for (int i = 1; i < array.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (array[j].length() < array[j+1].length())
                    swap(array, j, j+1);
            }
        }
        return array;
    }

    public static void swap (String[] arrayToSort , int i, int j){
        String tmp = arrayToSort[i];
        arrayToSort[i] = arrayToSort[j];
        arrayToSort[j] = tmp;
    }

    public static void displaySortedAndContactedSubArray(String [] array, int begin, int end){
        StringBuilder subString = new StringBuilder();
        String [] copiedArray =  Arrays.copyOfRange(array, begin, end);
        Arrays.sort(copiedArray);
        for (String str : copiedArray){
            subString.append(str).append(" ");
        }
        System.out.println(subString.toString());
    }
}
