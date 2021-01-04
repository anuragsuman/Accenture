package DataStructures.Arrays;

import java.util.HashMap;
import java.util.Map;

public class OddOccurringElements {

    public static int findOddOccurringElement(int[] array){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < array.length; i++){
            int element = array[i];
            if(map.get(element) == null){
                map.put(element, 1);
            } else {
                map.put(element, map.get(element)+1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 == 1){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static int getOddOccurrence(int[] ar){
        int i;
        int result = 0;

        for(i = 0; i < ar.length; i++){
            result = result ^ ar[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {11,2,2,4,6,6,4};
        System.out.println(findOddOccurringElement(array));
        System.out.println(getOddOccurrence(array));
    }
}
