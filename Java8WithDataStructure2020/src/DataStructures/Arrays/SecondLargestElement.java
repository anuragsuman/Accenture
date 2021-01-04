package DataStructures.Arrays;

public class SecondLargestElement {

    public static int findSecondLargestElement(int[] array){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            if(array[i] > highest){
                secondHighest = highest;
                highest = array[i];
            }else if(array[i] > secondHighest && array[i] != highest){
                secondHighest = array[i];
            }
        }
        return secondHighest;
    }

    public static void main(String[] args) {
        int[] array = {1278,1000,214,600,967,1200,1300};
        System.out.println(findSecondLargestElement(array));
    }
}
