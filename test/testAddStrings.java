/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junittestingexample.JUnitTestingExample;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NAYA
 */
public class testAddStrings {
    
    public testAddStrings() {
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

    @Test
    public void testString() 
    {
        JUnitTestingExample j = new  JUnitTestingExample();
        String result = j.addString("My name is ","vicky");
        assertEquals("My name is vicky", result);
    }
}
