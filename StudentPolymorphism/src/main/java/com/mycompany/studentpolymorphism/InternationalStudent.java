/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentpolymorphism;

/**
 *
 * @author 30128198
 */
public class InternationalStudent extends Student{
    String country;
    int visaPeriod;
    
    public InternationalStudent(String name, int ID, String country, int visaPeriod) {
        super(name, ID);
        this.country = country;
        this.visaPeriod = visaPeriod;
    }
}
