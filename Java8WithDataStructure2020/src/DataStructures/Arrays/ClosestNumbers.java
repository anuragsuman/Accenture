package DataStructures.Arrays;

import java.util.Arrays;

public class ClosestNumbers {

    public static void findPair(int[] array) {
        Arrays.sort(array);
        int[] temp = new int[array.length];
        int min = Integer.MAX_VALUE;

        for(int i = 1; i < array.length; i++){
            temp[i] = array[i] - array[i-1];
            if(min > temp[i])
                min = temp[i];
        }
        for(int j = 1; j < array.length; j++){
            if(temp[j] == min) {
                System.out.print("(" + array[j] + " " + array[j - 1] + ") = ");
                int difference = Math.abs(array[j]) - Math.abs(array[j-1]);
                System.out.println(difference);
            }
        }
    }

    public static void main(String[] args) {

        int[] array = {1, 5, 20, 23, 4, -1, -47, 45, 46};
        findPair(array);

    }
}
