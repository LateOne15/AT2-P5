/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentpolymorphism;

/**
 *
 * @author 30128198
 */
public class OnlineStudent extends Student{
    OnlineTool tool;
    int studyPeriod;
    
    public OnlineStudent(String name, int ID, String onlineTool, int studyPeriod){
        super(name,ID);
        tool = new OnlineTool(onlineTool);
        this.studyPeriod = studyPeriod;
    }
}
