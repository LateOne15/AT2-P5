/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computemethodsapp;
import java.util.Random;

/**
 *
 * @author 30128198
 */
public abstract class ComputeMethods {
    public static double fToC(double degreesF) {
        double degreesC = (5.0/9.0)*(degreesF-32);
        return degreesC;
    }
    
    public static double hypotenuse(int a, int b) {
        double hypotenuse = Math.sqrt(a*a + b*b);
        return hypotenuse;
    }
    
    public static int roll() {
        Random rand = new Random();
        int firstDie = rand.nextInt(6)+1;
        int secDie = rand.nextInt(6)+1;
        return firstDie+secDie;
    }
}
