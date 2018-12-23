/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtualpairprogrammers.isbntools;

/**
 *
 * @author mrubl
 */
public class ValidateISBN {
    
    private static final int SHORT_ISBN_LENGTH = 10;
    private static final int LONG_ISBN_LENGTH = 13;
    private static final int SHORT_ISBN_MULTIPLIER = 11;
    
    public boolean checkISBN(String isbn){
        
        if(isbn.length() == LONG_ISBN_LENGTH){
            return isThisA13DigitISBN(isbn);
        }else{
            if(isbn.length() != SHORT_ISBN_LENGTH){
                throw new NumberFormatException("ISBN number needs to be 10 digits");
            }

            return isThisAvalid10DigitISBN(isbn);
        }
//        return false;
    }

    private boolean isThisAvalid10DigitISBN(String isbn) throws NumberFormatException {
        int total = 0;
        
        for(int i =0; i < SHORT_ISBN_LENGTH; i++){
            if(!Character.isDigit(isbn.charAt(i))){               
                if (i == 9 && isbn.charAt(i) == 'X'){
                    total +=SHORT_ISBN_LENGTH;
                }else{
                    throw new NumberFormatException("ISBN numbers can only contain"
                            + " number digits");
                }
            }else{
                total+= Character.getNumericValue(isbn.charAt(i))*(SHORT_ISBN_LENGTH-i);
            }
        }
        
        if(total % SHORT_ISBN_MULTIPLIER == 0){
            return true;
        }else{
            return false;
        }
    }    

    private boolean isThisA13DigitISBN(String isbn) {
        int total = 0;
        
        for (int i=0; i < LONG_ISBN_LENGTH; i++){
            if(i%2==0){
                total += Character.getNumericValue(isbn.charAt(i));
            }else{
                total += Character.getNumericValue(isbn.charAt(i))*3;
            }
        }
        
        if(total% LONG_ISBN_MULTIPLIER == 0){
            return true;
        }else{
            return false;
        }
    }
    private static final int LONG_ISBN_MULTIPLIER = 10;
}
