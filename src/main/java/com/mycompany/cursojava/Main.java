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

public class Main {

public static void main(String[] args) throws IOException {
    
    String name = "Thaís";
    Integer cats = 2;
    Integer dog = 1;
    String phrase = "Hi my name is " + name + " and have " + (cats + dog) + " pets"; //text

    //Print to console
    System.out.println(phrase);

Integer age = 20;
        
        //Condition
        if (age >= 18){
            System.out.println("The person is of legal age");
        }else {
            System.out.println("The person must be of legal age");
       }
        
 //Example with Boolean       
 Boolean adult = age <= 12;
 
        //Condition
        if (adult){
            System.out.println("The person is of legal age");
        }else {
            System.out.println("The person must be of legal age");
       }
        
       //This line is creating a variable: writeToConsole
       //Variable type: InputStreamReader
       InputStreamReader writeToConsole = new InputStreamReader(System.in); //From the new a new data is being created
       BufferedReader buffer = new BufferedReader(writeToConsole);
       System.out.println("Hey you! What is your name?");
       String yourname = buffer.readLine();
       System.out.println("Hello " + yourname + " nice to me you");
       
 
    }
}
