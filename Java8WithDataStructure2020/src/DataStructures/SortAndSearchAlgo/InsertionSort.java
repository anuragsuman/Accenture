package DataStructures.SortAndSearchAlgo;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5,2,4,6,1,3,45,23,12};
        insertionSort(arr);
        char[] data = {'Z', 'A', 'D', 'H', 'Y', 'C', 'a', 'E'};
        insertionSort(data);
    }

    private static void insertionSort(int[] arr) {

        for(int j = 1; j < arr.length; j++){
            int key = arr[j];
            int i = j-1;
            while(i >= 0 && arr[i] > key){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }

        for(int i : arr){
            System.out.println(i);
        }
    }

    private static void insertionSort(char[] data){
        for(int i = 1; i < data.length; i++){
            char curr = data[i];
            int j = i;
            while(j > 0 && data[j-1] > curr){
                data[j] = data[j-1];
                j--;
            }
            data[j] = curr;
        }
        for(char c : data){
            System.out.println(c);
        }
    }
}
