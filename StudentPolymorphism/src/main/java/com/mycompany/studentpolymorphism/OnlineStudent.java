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
    public OnlineTool tool = new OnlineTool("default");
    public int studyPeriod = 1;
    
    public OnlineStudent(String name, int ID) {
        super(name,ID);
    }
    
    public OnlineStudent(String name, int ID, String onlineTool, int studyPeriod){
        super(name,ID);
        tool = new OnlineTool(onlineTool);
        this.studyPeriod = studyPeriod;
    }
    
    public void setTool(String toolName) {
        tool = new OnlineTool(toolName);
    }
    
    public void setStudyPeriod(int period) {
        studyPeriod = period;
    }
    
    @Override
    public void tellInfo() {
        System.out.println("Name: "+name+", ID: "+ID+", Type: Online");
        System.out.println("Study Period: "+studyPeriod+" years, Online learning tool: "+tool.getName());
    }
    
    public void onlineClass() {
        System.out.println("Attending an online class using "+tool.getName());
    }
}
