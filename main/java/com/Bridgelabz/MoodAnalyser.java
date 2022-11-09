package com.Bridgelabz;

public class MoodAnalyser {
    String mood;
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Problem");
    }
    public String analysisMood(String message) {
        if (message.equalsIgnoreCase("I am in sad Mood"))
            mood =  "SAD";
        return mood;
    }
}
