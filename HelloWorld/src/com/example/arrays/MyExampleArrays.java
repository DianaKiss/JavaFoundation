package com.example.arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class MyExampleArrays {

    public static String[] myArray = {"pig", "apple", "cat", "cucumber"};

    public static ArrayList<String> theNicestArrayList = new ArrayList<>();


    public static void main(String[] args) {


        System.out.println(myArray.length + 100 + " " + myArray[3]);
        System.out.println(Arrays.toString(myArray));

        theNicestArrayList.add("firstElement");

        System.out.println(Arrays.toString(theNicestArrayList.toArray()));

    }

    public String getArrayItem(int i) {
        return myArray[i];
    }

}
