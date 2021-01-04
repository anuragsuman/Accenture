package DataStructures.SortAndSearchAlgo;

public class FindPeakIn1D {

    public static void main(String[] args) {
        int[] arr = {18,19,10};
        int index = peakFinder(arr, 0, arr.length-1);
        System.out.println(arr[index]);
        int peak = peakFinder(arr);
        System.out.println(arr[peak]);
    }

    // recursive approach
    public static int peakFinder(int[] arr, int left, int right){
        int mid = (left + right)/2;
        if((mid == 0 || arr[mid] >= arr[mid-1]) && (mid == arr.length-1 || arr[mid] >= arr[mid+1])){
            return mid;
        }
        if(mid-1 >= 0 && arr[mid] < arr[mid-1]){
            return peakFinder(arr, left, mid-1);
        }
        return peakFinder(arr, mid+1, right);
    }

    public static int peakFinder(int[] nums){
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = (left + right)/2;
            if(nums[mid] < nums[mid + 1]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
