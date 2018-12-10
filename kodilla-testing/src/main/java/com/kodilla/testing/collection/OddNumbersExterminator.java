package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class OddNumbersExterminator {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random randomNumbers = new Random();


        for (int i = 0; i < 49; i++) {
            Integer randomNumber = randomNumbers.nextInt(99);
            numbers.add(randomNumber);
        }
        public void exterminate(ArrayList <Integer> numbers) {
            for (i = 0; i < numbers.size(); i++) {
                if (numbers%2==0){
                    System.out.println(numbers);
                }
            }
        }
        System.out.println(numbers);
    }

}