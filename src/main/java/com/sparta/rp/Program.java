package com.sparta.rp;

//Program.java in the package com.sparta.rp
//public is access modifier, the other modifiers are private, protected and default
//the scope of public is throughout the programme
// private only same class
//protected -
//default -
public class Program {
    public static void main(String[] args) {
        //method
        int timeOfDay = 21;
        System.out.println(Greeter.getGreeting(timeOfDay));
    }

}
