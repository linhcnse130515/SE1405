/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.MyToys.cF;

/**
 *
 * @author nguye
 */

public class NewEmptyJUnitTest1 {
    @Test  
    public void testSuccessfulLower10Cases(){
        assertEquals(1, cF(0));
        assertEquals(6, cF(3));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));
    }
    @Test
    public void testSuccessfulUpter10Cases(){
        assertEquals(3_628_800, cF(10));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionNagativeCases(){
        cF(-5);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionPositiveCases(){
        cF(16);
    }
}
