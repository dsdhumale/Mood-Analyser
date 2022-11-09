package com.Bridgelabz;

public class MoodAnalyser {
    String mood;
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Problem");
    }
    public String analysisMood(String message) {
        if (message.equalsIgnoreCase("I am in any Mood"))
            mood =  "HAPPY";
        return mood;
    }
}
