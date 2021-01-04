package com.lti.codilityTestPreparation;

public class CodilityProblem1 {

	// Function to find the max index  
	// of largest prefix with same 
	// number if X and Y 
	static int solution( int X, 
			int Y,int []A) 
	{ 
		int n = A.length; 
		// counters for X and Y 
		int nx = 0, ny = 0; 

		int result = -1; 
		for (int i = 0; i < n; i++) 
		{ 
			// If value is equal to X  
			// increment counter of X 
			if (A[i] == X) 
				nx++; 

			// If value is equal to Y 
			// increment counter of Y 
			if (A[i] == Y) 
				ny++; 

			// If counters are equal(but not 
			// zero) save the result as i 
			if ((nx != 0) && (nx == ny)) 
				result = i; 
		} 

		return result; 
	} 

	// Driver code 
	static public void main (String[] args) 
	{ 
		int []arr = {7, 42, 5, 6, 42, 8, 7, 5, 3, 6, 7}; 
		int X = 7, Y = 42; 
		System.out.println("Ending index of prefix is "
				+ solution(X, Y, arr)); 
	} 
} 

