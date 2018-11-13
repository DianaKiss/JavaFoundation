package com.example;

public class FirstProjekt {
    public static void main(String[] args) {

        Human first = new Human();
        int a = 0;
        char b = 'a';
        String c = "MyString";

        System.out.println(a + b + c);
        first.introduction();
        first.name = "Jani";
        System.out.println(first.name);
        System.out.println(first.getName());
        first.setName("Ilonka");
        System.out.println(first.getName());



        String result = censor("The dog is a friendly dog", "dog", "cat");
        String newResult = censor("The asshole is a friendly asshole.","asshole", "***");
        Integer textCount = counter("The cat is a friendly cat");
        System.out.println(result);
        System.out.println(newResult);
        System.out.println(textCount);

    }

    static String censor(String text, String toChange, String newWord) {
        text = text.replaceAll(toChange, newWord);
        return text;
    }

    static Integer counter(String text) {
        Integer thisLength = text.length();
        return thisLength;
    }

}
