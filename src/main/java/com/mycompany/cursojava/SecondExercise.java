/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dayanathais
 */
public class SecondExercise {
    
    /*Build a program that allows 
    you to load three numbers and 
     shows what the average number is*/
    
    public static void main(String[] args) throws IOException {
     
        System.out.println("enter the first number");
        Integer number1 = theNumber(); //What this line does is pass text to a whole number
        
        System.out.println("enter the second number");
        Integer number2 = theNumber();
        
        System.out.println("enter the third number");
        Integer number3 = theNumber();
        
        Integer summation = number1 + number2 + number3; //Create summation variable
        Double numberAverage = Double.valueOf(summation) / 3; //It becomes double because we need numbers with decimals
        //Double.valueOf(decimal)
        System.out.println("The average number is: " + numberAverage);
    }   
    
    private static Integer theNumber () throws IOException {
        InputStreamReader writeToConsole = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(writeToConsole);
        String strNumber1 = buffer.readLine();
        Integer number1 = Integer.parseInt(strNumber1);
        
        return number1;
        
    }
    
}
