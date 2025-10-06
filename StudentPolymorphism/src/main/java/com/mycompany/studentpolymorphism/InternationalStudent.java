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
    public String country = "default";
    public int visaPeriod = 6;
    
    public InternationalStudent(String name, int ID) {
        super(name, ID);
    }
    
    public InternationalStudent(String name, int ID, String country) {
        super(name, ID);
        this.country = country;
    }
    
    public InternationalStudent(String name, int ID, String country, int visaPeriod) {
        super(name, ID);
        this.country = country;
        this.visaPeriod = visaPeriod;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public void setVisaPeriod(int visaPeriod) {
        this.visaPeriod = visaPeriod;
    }
    
    @Override
    public void tellInfo() {
        System.out.println("Name: "+name+", ID: "+ID+", Type: International");
        System.out.println("Country of Origin: "+country+", Visa period: "+visaPeriod+" years");
    }
    
    public void takeLeave() {
        System.out.println("Returning to "+country+" for a break.");
    }
}
