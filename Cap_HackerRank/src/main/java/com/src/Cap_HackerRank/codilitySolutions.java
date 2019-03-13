package com.src.Cap_HackerRank;

public class codilitySolutions {

	
	public static void main(String[] args) {
		//String mainString = "a0bb";
		//String mainString = "C00razyRam102Ramb5830";
		//String mainString = "12345RAMB";
		//String mainString = "ASDFJPOAISJDFPASODIJF";
		//String mainString = "121219232009230";
	//System.out.println("length : " +Solution1(mainString));
	int[] A = {1, 2, 5, 9, 10};
	int X =10;
	System.out.println(checkBinaryTree(A, X));
	}
	
	public static boolean isUpperCase(String mainString, int index){
		
		return Character.isUpperCase(mainString.charAt(index));
		
	}
	
	public static boolean isDigit(String mainString, int index){
		
		return Character.isDigit(mainString.charAt(index));
		
	}
	
	public static int passwordFinder(String mainString) {
		// TODO Auto-generated method stub
		//System.out.println("RAam");
		
		//String mainString = "C00razyRam102Ramb5830";

	    int startIndex = 0;
	    int longestStartIndex = 0;
	    int endIndex = 0;
	    int longestLength = Integer.MIN_VALUE;
	    boolean upperCaseFlag = false;
//charIndex > startIndex &&
	    for (int charIndex = 0; charIndex <= mainString.length(); charIndex++){
	        if (charIndex == mainString.length() || isDigit(mainString, charIndex)) {
	            if (upperCaseFlag &&  charIndex - startIndex > longestLength) {
	            	
	                longestLength = charIndex - startIndex;
	                endIndex = charIndex;
	                longestStartIndex = startIndex;
	            }
	            startIndex = charIndex + 1;
	            upperCaseFlag = false;
	        } //else if (Character.isUpperCase(mainString.charAt(charIndex))) {
	        	else if (isUpperCase(mainString, charIndex)) {
	        		upperCaseFlag = true;
	        }
	        
	    }

	    System.out.println(mainString.substring(longestStartIndex, endIndex));
	    
	    if (longestLength == Integer.MIN_VALUE){
	    	longestLength = -1;
	    }
	    return longestLength;
	}
	
	
	public static int checkBinaryTree(int[] A, int X) {
	        int N = A.length;
	        if (N == 0) {
	            return -1;
	        }
	        int l = 0;
	        int r = N-1;
	        while (l < r) {
	            int m = (l + r+1) / 2;
	            if (A[m] > X) {
	                r = m - 1;
	            } else {
	                l = m;
	            }
	        }
	        if (A[l] == X) {
	            return l;
	        }
	        return -1;
	    }
	//}
	    
	    

}

//}
