/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentpolymorphism;

/**
 *
 * @author 30128198
 */
public class StudentPolymorphism {

    public static void main(String[] args) {
        Student student = new Student("Name1",1001);
        InternationalStudent intStu = new InternationalStudent("Name2",1002,"UK");
        OnlineStudent onlStu = new OnlineStudent("Name3",1003,"Blackboard",3);
        
        student.tellInfo();
        student.attendClass();
        System.out.println("");
        
        intStu.tellInfo();
        intStu.attendClass();
        intStu.takeLeave();
        System.out.println("");
        
        onlStu.tellInfo();
        onlStu.attendClass();
        onlStu.onlineClass();
        System.out.println("");
        
        Student polyStu = new Student("Stew",1004);
        polyStu.tellInfo();
        polyStu.attendClass();
        System.out.println("");
        
        polyStu = new InternationalStudent(polyStu.name,polyStu.ID);
        ((InternationalStudent)polyStu).setCountry("India");
        ((InternationalStudent)polyStu).setVisaPeriod(3);
        
        polyStu.tellInfo();
        polyStu.attendClass();
        ((InternationalStudent)polyStu).takeLeave();
        System.out.println("");
        
        polyStu = new OnlineStudent(polyStu.name,polyStu.ID);
        ((OnlineStudent)polyStu).setTool("Blackboard");
        ((OnlineStudent)polyStu).setStudyPeriod(4);
        
        polyStu.tellInfo();
        polyStu.attendClass();
        ((OnlineStudent)polyStu).onlineClass();
    }
}
