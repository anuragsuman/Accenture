package DataStructures.Arrays;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumber {

    public static int missingNumber(int[] array, int n){
        int totalSum = n*(n+1)/2;
        int arraySum = 0;
        for(int i= 0; i < array.length; i++){
            arraySum += array[i];
        }
        return (totalSum - arraySum);
    }

    public static void printMissingNumbers(int[] array, int count){
        int missingCount = count - array.length;
        BitSet bitset = new BitSet(count);

        for(int number : array){
            bitset.set(number - 1);
        }

        System.out.printf("The missing numbers in a array %s, with total number %d is %n", Arrays.toString(array), count);
        int lastMissingIndex = 0;

        for(int i = 0; i < missingCount; i++){
            lastMissingIndex = bitset.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,6};
        int n = array.length + 1;
        System.out.printf("Missing number in a array %s is %d ", Arrays.toString(array), missingNumber(array, n));
        System.out.println();

        int[] numbers = {1,3,5,8,9};
        printMissingNumbers(numbers, 10);

    }
}
