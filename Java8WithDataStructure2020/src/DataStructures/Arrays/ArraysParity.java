package DataStructures.Arrays;


public class ArraysParity {

    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int count = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                result[count] = A[i];
                count++;
            }
        }

        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 != 0){
                result[count] = A[i];
                count++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArraysParity aP = new ArraysParity();
        int[] array = {3,1,4,2};
        int [] result = aP.sortArrayByParity(array);

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
