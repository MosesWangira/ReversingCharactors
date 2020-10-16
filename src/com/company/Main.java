package com.company;

import java.util.ArrayList;

public class Main {
    /**
     * function to reverse string
     * */
    public void reverseWordInMyString(String str) {
        System.out.println("String Before: " + str);
        ArrayList<String> strings = new ArrayList<>();
        int index = 0;
        while (index < str.length()) {
            strings.add(str.substring(index, Math.min(index + 4, str.length())));
            index += 4;
        }

        for (String myString : strings) {
            StringBuilder input1 = new StringBuilder();

            /**
             * append a string into StringBuilder input1
             * */
            input1.append(myString);

            /**
             * reverse StringBuilder input1
             * */
            input1 = input1.reverse();

            /**
             * print reversed String
             * */
            System.out.print(input1);
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.reverseWordInMyString("Lorem at");
    }

}
