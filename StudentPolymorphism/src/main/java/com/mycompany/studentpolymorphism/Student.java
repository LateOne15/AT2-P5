/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentpolymorphism;

/**
 *
 * @author 30128198
 */
public class Student {
    public String name;
    public int ID;
    
    public Student(String name, int ID) {
        this.ID = ID;
        this.name = name;
    }
    
    public void tellInfo() {
        System.out.println("Name: "+name+", ID: "+ID+", Type: Domestic");
    }
    
    public void attendClass() {
        System.out.println("Attending an in-person class.");
    }
}
