package com.virtualpairprogrammers.isbntools;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mrubl
 */
public class ValidateISBNTest {
    
    public ValidateISBNTest() {
    }

    @Test
    public void checkValid10DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449116");
        assertTrue("first value", result);
        result = validator.checkISBN("0140177396");
        assertTrue("second value", result);
    }
    
    @Test
    public void checkAValid13DigitISBN(){
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9780120000302");
        assertTrue("first value", result);
        result = validator.checkISBN("9781503941359");
        assertTrue("second value", result);
    }
    
    @Test
    public void TenDigitISBNNumbersEndingInAnXAreValid(){
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("012000030X");
        assertTrue(result);
    }

    @Test
    public void checkInvalid10DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449117");
        assertFalse(result);                
    }
    
    @Test
    public void checkInvalid13DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9780120000303");
        assertFalse(result);                
//        fail();
    }
    
    @Test(expected = NumberFormatException.class)
    public void nineDigitISBNsAreNotAllowed(){
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("123456789");
    }
    
    @Test(expected = NumberFormatException.class)
    public void nonNumericISBNsAreNotAllowed(){
//          fail();
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("helloworld");
    }
    
//    9780120000302
}
