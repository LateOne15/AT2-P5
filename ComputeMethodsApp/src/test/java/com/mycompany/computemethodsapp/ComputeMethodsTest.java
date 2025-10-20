/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.computemethodsapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 30128198
 */
public class ComputeMethodsTest {
    
    public ComputeMethodsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fToC method, of class ComputeMethods.
     */
    @Test
    public void testFToC1() {
        System.out.println("fToC1");
        double degreesF = 80.0;
        double expResult = 26.667;
        double result = ComputeMethods.fToC(degreesF);
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testFToC2() {
        System.out.println("fToC2");
        double degreesF = 45.2;
        double expResult = 7.333;
        double result = ComputeMethods.fToC(degreesF);
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testFToC3() {
        System.out.println("fToC3");
        double degreesF = 108.9;
        double expResult = 42.722;
        double result = ComputeMethods.fToC(degreesF);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of hypotenuse method, of class ComputeMethods.
     */
    @Test
    public void testHypotenuse() {
        System.out.println("hypotenuse1");
        int a = 10;
        int b = 14;
        double expResult = 17.205;
        double result = ComputeMethods.hypotenuse(a, b);
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testHypotenuse2() {
        System.out.println("hypotenuse2");
        int a = 3;
        int b = 4;
        double expResult = 5.0;
        double result = ComputeMethods.hypotenuse(a, b);
        assertEquals(expResult, result, 0.01);
    }
}
