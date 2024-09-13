package org.example;

import java.util.List;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("Random Number between " + min + " and " + max + " : " + randomNumber);



    }
}