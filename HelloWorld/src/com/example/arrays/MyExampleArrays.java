package com.example.arrays;
import java.util.Arrays;

public class MyExampleArrays {

    public static String[] myArray = {"pig", "apple", "cat", "cucumber"};


    public static void main(String[] args) {


        System.out.println(myArray.length + 100 + " " + myArray[3]);

        System.out.println(Arrays.toString(myArray));

    }

    public String getArrayItem(int i) {
        return myArray[i];
    }

}
