package DataStructures.Arrays;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,6,2,6};
        findDuplicates(arr);
        findDuplicatesUsingCount(arr);
    }

    // O(n^2)
    public static void findDuplicates(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Number: " + arr[i]);
                }

            }
        }
    }

    // O(n)
    public static void findDuplicatesUsingCount(int[] arr){
        int[] count = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
        	System.out.println(count[arr[i]]);
            if(count[arr[i]] == 1){
                System.out.println(arr[i]);
            }else{
                count[arr[i]]++;
            }
        }
    }
}
