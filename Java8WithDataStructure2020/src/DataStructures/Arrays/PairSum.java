package DataStructures.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairSum {

    //Brute force approach O(n^2)
    public static void findPairs(int[] array, int number){
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                if(array[i] + array[j] == number) {
                    System.out.println("Pair: (" + i + ", " + j + ")");
                }
            }
        }
    }

    // Sort array with O(nlogn)
    public static void findPairsSorted(int[] array, int number){
        Arrays.sort(array);
        int low = 0;
        int high = array.length - 1;

        while(low < high){
            if(array[low] + array[high] == number){
                System.out.println("Pair: (" + array[low] + ", " + array[high] + ")");
            }
            if(number > array[low] + array[high])
                low++;
            else
                high--;
        }

    }

    // Using Hashmap O(n)
    public static void findPairsHash(int[] array, int number){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i < array.length; i++){
            if(map.containsKey(number - array[i])){
                System.out.println("Pairs: " + map.get(number-array[i]) + ", " + i);
            }else
                map.put(array[i], i);
        }
    }

    public static void main(String[] args) {

        // sorted - {1,3,4,6,7,10,12}
        int[] array = {1, 4, 10, 12, 6, 7, 3, -2};
        findPairsHash(array, 10);
        findPairs(array, 10);
        //findPairsSorted(array, 7);

    }
}
