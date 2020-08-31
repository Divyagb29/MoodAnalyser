package com.mood_analyser.code;

public class MoodAnalyser
{
    private String message;
    public MoodAnalyser(String message)
    {
        this.message = message;
    }

    public String analyseMood(String message)
    {
        if(message.contains("sad")) {
            return "sad";
        }
        else {
            return "happy";
        }
    }

}