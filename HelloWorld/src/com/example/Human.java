package com.example;

public class Human {
    public String name = "Gyula";
    private int age;

    public void introduction() {
        System.out.println("My name is " + name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
