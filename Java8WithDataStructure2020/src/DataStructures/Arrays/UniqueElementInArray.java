package DataStructures.Arrays;

import java.util.HashMap;
import java.util.Map;

public class UniqueElementInArray {

    // Using Bit manipulation/ XOR approach
    public int findUniqueElement(int[] array){
        int result = 0;
        for(int i = 0; i < array.length; i++){
            result ^= array[i];
        }
        return (result > 0 ? result : -1);
    }

    //Using Hashmap
    public static int hashMapApproach(int[] array){
        HashMap<Integer, Integer> map = new HashMap<>(array.length);
        for(int num : array){
            Integer occurrence = map.get(num);
            map.put(num, occurrence == null ? 1 : occurrence + 1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                return e.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,4,2,2,1,4,3,5,5};
        UniqueElementInArray element = new UniqueElementInArray();
        int res = element.findUniqueElement(array);
        System.out.println(res);
        res = hashMapApproach(array);
        System.out.println( res);

    }

}
