package DataStructures.SortAndSearchAlgo;

public class BinarySearch {
    public static int binarySearch(int[] data, int target, int low, int high){
        if(low > high)
            return -1;
        int mid = (low+high)/2;
        if(target == data[mid]){
            return mid;
        }
        else if(target > data[mid])
            return binarySearch(data, target, mid+1, high);
        else
            return binarySearch(data, target, low, mid-1);

    }

    public static int binarySearch(int[] A, int target)
    {
        int left = 0, right = A.length - 1;
        // till search space consists of at-least one element
        while (left <= right)
        {
            int mid = (left + right) / 2;
            // key value is found
            if (target == A[mid]) {
                return mid;
            }else if (target < A[mid]) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        // target doesn't exist in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int target = 222;
        int result = binarySearch(data, target, 0, data.length-1);
        int res = binarySearch(data, target);
        System.out.println("The value " + target + " is found at index " + result);
        System.out.println("The value " + target + " is found at index " + res);
    }

}
