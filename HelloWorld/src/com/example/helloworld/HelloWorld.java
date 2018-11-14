package com.example.helloworld;

import com.example.arrays.MyExampleArrays;

public class HelloWorld {
    public static void main(String[] args) {
        for (int i=0; i<2; i++) {
            System.out.println(i + " Hello World!");
        }

        MyExampleArrays newArray = new MyExampleArrays();

        System.out.println(newArray.getArrayItem(1));

    }
}
