/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computemethodsapp;
import java.util.Scanner;

/**
 *
 * @author 30128198
 */
public class ComputeMethodsApp {

    public static void main(String[] args) {
        double celcius, farenheit, hypotenuse;
        int width, height, dieRoll;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Farenheit: ");
        farenheit = sc.nextDouble();
        
        System.out.print("Enter Width of Triangle: ");
        width = sc.nextInt();
        
        System.out.print("Enter Height of Triangle: ");
        height = sc.nextInt();
        
        System.out.println("");
        
        celcius = ComputeMethods.fToC(farenheit);
        System.out.println(farenheit + " Farenheit in Celcius is " + celcius);
        
        hypotenuse = ComputeMethods.hypotenuse(width, height);
        System.out.println("Hypotenuse of the triangle is " + hypotenuse);
        
        dieRoll = ComputeMethods.roll();
        System.out.println("The sum of two dice values is: " + dieRoll);
    }
}
