package DataStructures.Arrays;

public class LargestSum {

    public static int findMaxSum(int[] arr){
       int maxSoFar = 0;
       int maxEndingHere = 0;

       for(int i = 0; i < arr.length; i++){
           maxEndingHere = maxEndingHere + arr[i];
           if(maxEndingHere < 0){
               maxEndingHere = 0;
           }else if(maxEndingHere > maxSoFar){
               maxSoFar = maxEndingHere;
           }
       }
       return maxSoFar;
    }

    public static void main(String[] args){
        int[] arr = {-1, 3, -2, 3, -5};
        System.out.println(findMaxSum(arr));
    }
}
