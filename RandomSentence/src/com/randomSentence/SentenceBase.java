package com.randomSentence;

public class SentenceBase {
    String[] firstWord = {"The best", "My favorite", "The worst", "The most outstanding"};
    String[] secondWord = {"solution", "thing to do", "thing to think", "thing to say"};
    String[] thirdWord = {"to hide", "to learn more", "to say nice things", "to behave well"};

    public int getLength(String[] anyArray) {

        int arrayRandom = (int) (Math.random() * anyArray.length);
        return arrayRandom;
    }

    public String sentence() {

        String sentence = firstWord[getLength(firstWord)] + " " + secondWord[getLength(secondWord)] + " is " + thirdWord[getLength(thirdWord)];
        return sentence;
    }

}
