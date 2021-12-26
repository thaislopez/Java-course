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
        InputStreamReader writeToConsole = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(writeToConsole);
        
        System.out.println("enter the first number");
        String strNumber1 = buffer.readLine(); //This line saves the number entered
        Integer number1 = Integer.parseInt(strNumber1); //What this line does is pass text to a whole number
        
        System.out.println("enter the second number");
        String strNumber2 = buffer.readLine();
        Integer number2 = Integer.parseInt(strNumber2);
        
        System.out.println("enter the third number");
        String strNumber3 = buffer.readLine();
        Integer number3 = Integer.parseInt(strNumber3);
        
        Integer mayor = number1;
        
        if(number2 > mayor) {
            mayor = number2;
        }
        if (number3 > mayor) {
            mayor = number3;
        }
        System.out.println("the greater number is: " + mayor);
        
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
