/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.sebastianbohorquez_ej2.exud4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian Bohorquez
 */
public class conversorTest {

 public conversorTest() {
 }
 /**
 * Test of main method, of class conversor.
 */
 @Test
 public void testMain() {
 System.out.println("main");
 String[] argumentos = null;
 conversor.main(argumentos);
 // TODO review the generated test code and remove the default call to fail.
 }
 /**
 * Test of celsiusAFahrenheit method, of class conversor.
 */
 @Test
 public void testCelsiusAFahrenheit() {
 System.out.println("celsiusAFahrenheit");
 float celsius = 0.0f;
 float expResult = 32.0f;
 float result = conversor.celsiusAFahrenheit(celsius);
 assertEquals(expResult, result, 0.0);
 // TODO review the generated test code and remove the default call to fail.
 }
 /**
 * Test of fahrenheitACelsius method, of class conversor.
 */
 @Test
 public void testFahrenheitACelsius() {
 System.out.println("fahrenheitACelsius");
 float fahrenheit = 0.0f;
 float expResult = -17.777779f;
 float result = conversor.fahrenheitACelsius(fahrenheit);
 assertEquals(expResult, result, 0.0);
 // TODO review the generated test code and remove the default call to fail.
 }

}


