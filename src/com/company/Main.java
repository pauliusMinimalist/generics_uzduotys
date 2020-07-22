package com.company;

public class Main {

    public static void main(String[] args) {

        int[] masyvasInt = {1, 2, 3};
        String[] masyvasString = {"Hello", "World"};

        printArray(masyvasInt, masyvasString);
    }
    private static void printArray(int[] masyvasInt, String[] masyvasString) {
        for (int elementas : masyvasInt) {
            System.out.println(elementas);
        }
        for (String elementas : masyvasString) {
            System.out.println(elementas);
        }
    }
}
