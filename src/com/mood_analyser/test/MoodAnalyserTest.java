package com.mood_analyser.test;

import com.mood_analyser.code.MoodAnalyser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest
{
    MoodAnalyser moodAnalyser = null;

    @Before
    public void objectCreation()
    {
        moodAnalyser = new MoodAnalyser("");
    }
    @Test
    public void happyMood_Return_happy()
    {
        String mood = moodAnalyser.analyseMood("i'm in happy mood");
        Assert.assertEquals("happy" , mood);
    }

}
