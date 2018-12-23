/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtualpairprogrammers.isbntools;

import org.junit.Test;
import static org.junit.Assert.*;


public class StockManagementTests {
    
    public StockManagementTests() {
    }

     @Test
     public void testCanGetACorrectLocatorCode() {
         String isbn = "0140177396";
         StockManager stockManager = new StockManager();
         String locatorCode = stockManager.getLocatorCode(isbn);
         assertEquals("7396J4", locatorCode);
     }
}
