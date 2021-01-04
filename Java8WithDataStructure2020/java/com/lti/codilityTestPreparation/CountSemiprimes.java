package com.lti.codilityTestPreparation;

public class CountSemiprimes {

	public static void main(String[] args) {
		
		int a[] = {1,26};
		CountSemiprime(a);

	}

	private static void CountSemiprime(int[] a) {
		
		for(int i = a[0] ; i<= a[1];i++) {
			int count =0;
			boolean is = false;
			for(int j = 2 ; j< i; j++) {
				if(i%j == 0) {
					int number = i/j;
					int arr[] = {j,number};
					for(int k =0; k< arr.length ;k++) {
						 is = checkPrimNumber(arr[k]);
					}
					break;
				}
				
			}
			if(is) {
				System.out.println(i);
			}
			
		}
	}

	

	private static boolean checkPrimNumber(int num) {
		//if all the element present in array is prime then return true otherwise return false
		boolean flag = false;
		for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            return true;
        else
           return false;
 
	}

}
