package com.sparta.rp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreeterTest {
    @Test
    @DisplayName("this is my first test")
     void firstTest(){
        Assertions.assertEquals(1,1);
    }
    @Test
    @DisplayName("Given time is 21, return Good Evening")
    void giveTimeIs21ReturnGoodEvening(){
        int time = 21;
        String expected = "Good Evening";
        String answer = Greeter.getGreeting(time);
        Assertions.assertEquals(expected, answer);

        Assertions.assertEquals("Good Evening", Greeter.getGreeting(21));
    }
    @Test
    @DisplayName("Given time is 6, return Good Morning")
    void giveTimeIs5ReturnGoodMorning(){
        int time = 5;
        String expected = "Good Morning";
        String answer = Greeter.getGreeting(time);
        Assertions.assertEquals(expected, answer);


    }
    @Test
    @DisplayName("Given time is 14, return Good Afternoon")
    void giveTimeIs14ReturnGoodAfternoon(){
        int time = 14;
        String expected = "Good Afternoon";
        String answer = Greeter.getGreeting(time);
        Assertions.assertEquals(expected, answer);


    }
    @Test
    @DisplayName("Given time is 26, return Not Valid time")
    void giveTimeIs26ReturnNotValidTime(){
        int time = 26;
        String expected = "Not Valid Time";
        String answer = Greeter.getGreeting(time);
        Assertions.assertEquals(expected, answer);


    }
}
