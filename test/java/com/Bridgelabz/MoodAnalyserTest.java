package com.Bridgelabz;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {
    //Create object of MoodAnalyser class
    MoodAnalyser moodAnalyser = new MoodAnalyser();
    @Test
    public void testMoodAnalysis(){
        String message = "I am in any Mood";
        String mood = moodAnalyser.analysisMood(message);
        Assert.assertEquals("HAPPY",mood);
    }
}
