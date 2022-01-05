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
public class FirstExercise {
    
    /*Build a program that allows 
    you to load 3 numbers and show 
    which is the largest and the smallest*/
    
    public static void main(String[] args) throws IOException {
     
        System.out.println("enter the first number");
        Integer number1 = loadNumber(); //What this line does is pass text to a whole number
        
        System.out.println("enter the second number");
        Integer number2 = loadNumber();
        
        System.out.println("enter the third number");
        Integer number3 = loadNumber();
        
        calculateGreaterNumber(number1, number2, number3);
        calculateSmallerNumber(number1, number2, number3);
    }
    
    private static Integer loadNumber () throws IOException {
        InputStreamReader writeToConsole = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(writeToConsole);
        String strNumber1 = buffer.readLine();
        Integer number1 = Integer.parseInt(strNumber1);
        
        return number1;
        
    }
       
    private static void calculateGreaterNumber(Integer number1, Integer number2, Integer number3) {
              
        Integer mayor = number1;
        
        if(number2 > mayor) {
            mayor = number2;
        }
        if (number3 > mayor) {
            mayor = number3;
        }
        System.out.println("the greater number is: " + mayor);
        
    }
    
    private static void calculateSmallerNumber(Integer number1, Integer number2, Integer number3) {
        
        Integer menor = number1;
        
        if(number2 < menor) {
            menor = number2;
        }
        if (number3 < menor) {
            menor = number3;
        }
        System.out.println("the smallest number is: " + menor);
        
    }
           
}
