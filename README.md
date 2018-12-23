# ISBN Validator

This project validates ISBN numbers and the main focus is for unit testing with JUnit. This repo was coded while following Lynda.com videos.

## Example

The following code checks to see if the 13 digit ISBN is valid. The test makes sure the logics are correct with a valid ISBN.
	
	//ValidateISBN.java
    private boolean isThisALongISBN(String isbn) {
        int total = 0;
        
        for (int i=0; i < LONG_ISBN_LENGTH; i++){
            if(i%2==0){
                total += Character.getNumericValue(isbn.charAt(i));
            }else{
                total += Character.getNumericValue(isbn.charAt(i))*3;
            }
        }
        
        return(total% LONG_ISBN_MULTIPLIER == 0);
    }

	//ValidateISBNTest.java
	@Test
		public void checkAValid13DigitISBN(){
			ValidateISBN validator = new ValidateISBN();
			boolean result = validator.checkISBN("9780120000302");
			assertTrue("first value", result);
			result = validator.checkISBN("9781503941359");
			assertTrue("second value", result);
		}

## Motivation

My main motivation is to have valid tests for work.

## Requirements

This section is optional if there isn't any special dependencies. Else a bulletlist will suffice, e.g.,
+ [Java](https://www.java.com/en/)
+ [JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
+ [JUnit] (https://junit.org/junit5/)

## Installation or Getting Started

After cloning the project, make sure to either change the package name within the code or create a package named "com.virtualpairprogrammers.isbntools" 

	git clone https://github.com/Mang506/JUnitTesting.git

## Usage

Show how to unit test with JUnit.
    
## Reference

+ [Lynda](https://www.lynda.com/) - [Practical Test-Driven Development for Java Programmers](https://www.lynda.com/Software-Development-tutorials/Practical-Test-Driven-Development-Java-Programmers/777389-2.html)

