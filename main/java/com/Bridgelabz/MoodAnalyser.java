package com.Bridgelabz;

public class MoodAnalyser {
    String mood;
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Problem");
    }
    public String analysisMood(String message) {
        if (message.contains("sad"))
        { mood =  "SAD";
        }
        else{mood = "Happy";
        }
        return mood;
    }
}
