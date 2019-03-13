package com.src.Cap_HackerRank;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hackerRankSolutions {
			static int num = 30;
			public static void main(String args[] ) throws Exception {
				Scanner scan = new Scanner(System.in);
		        int num = scan.nextInt();
			    for (int index = 1; index<= num; index++)
			    {
			    	int fizz = index%3;
			    	int buzz = index%5;
			    	
			    	if (fizz == 0 && buzz == 0)
			    	{
			    		System.out.println("FizzBuzz");
			    	}
			    	else if (buzz == 0)
			    	{
			    		System.out.println("Buzz");
			    	}
			    	else if (fizz == 0)
			    	{
			    		System.out.println("Fizz");
			    	}
			    	else
			    	{
			    		System.out.println(index);
			    	}
			    }
			    checksum();
			}
			
	public static void checksum()
	{
		
		Scanner scan = new Scanner(System.in);
		int countIndex = scan.nextInt();
		
		
		for (int i = 1; i <= countIndex; i++)
		{
	    System.out.print("Enter a 16 digit credit card number : ");
	    
	    long creditNumber = scan.nextLong();
	    
	    int total = sumOfEvenDigits(creditNumber) + sumOfOddDigits(creditNumber);


	    if (total % 10 == 0)  
	    {
	        System.out.println("Yes");
	    } else {
	    	System.out.println("No");
	    }
		}
	 }



	public static int sumOfOddDigits(long creditNumber) {
	    int result = 0;

	    while (creditNumber > 0) {
	        result += (int) (creditNumber % 10);
	        creditNumber = creditNumber / 100;
	    }

	    return result;
	}

	public static int sumOfEvenDigits(long creditNumber) {

	    int result = 0;
	    long evenDigitIndex = 0;

	    while (creditNumber > 0) {
	    	evenDigitIndex = creditNumber % 100;
	        result += getDigit((int) (evenDigitIndex / 10) * 2);
	        creditNumber = creditNumber / 100;
	    }

	    return result;
	}

	public static int getDigit(int creditNumber) {

	    if (creditNumber <= 9) {
	        return creditNumber;
	    } else {
	        int firstDigit = creditNumber % 10;
	        int secondDigit = (int) (creditNumber / 10);

	        return firstDigit + secondDigit;
	    }
	}
	
	
	

		public void replaceText() throws IOException {
			
			System.out.println("Enter the text to be scrubbed (Press Return and then control + z to end): ");
	        //String inputString = "Hello this is a test message \n<script language="java script">\n\tSomething.somethig.something; \n\tnewline.something;\n</script>\nThis is some more text message";
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String inputString = "", currentLine;
	        while((currentLine = br.readLine()) != null){
	        	inputString += "\n" + currentLine; 
	        }
	        br.close();
	        System.out.println("inputString: " + inputString);
	        
	        if(inputString.length() > 1024*2) return; //Simple 8 bit encoding is assumed
	        
	        String searchKey1 = "<script";
	        String searchKey2 = "</script>";
	                
	        int startPosition = 0, endPosition = 0;
	        startPosition = inputString.indexOf(searchKey1);
	        endPosition = inputString.indexOf(searchKey2);
	        
	        System.out.println("startPosition: " + startPosition);
	        System.out.println("endPosition: " + endPosition);
	        
	        if(startPosition >= 0 && endPosition >=0)
	        {
		        String stringToBeReplaced = inputString.substring(startPosition, endPosition+searchKey2.length());
		        //System.out.println("stringToBeReplaced: " + stringToBeReplaced);
		        
		        String finalString = inputString.replace(stringToBeReplaced, "");
		        System.out.println(finalString);
	        }else
	        {
	        	System.out.println(inputString);
	        }
	        
	        
	        //Next Improvements:
	        /*
	         * Deal with extra spaces
	         * Deal with multiple script tags
	         */
		}

}





