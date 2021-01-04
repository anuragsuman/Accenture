package DataStructures.Arrays;

public class SearchInSortedAndRotated {

    public static int search(int[] arr, int target) {
        if(arr == null || arr.length == 0)
            return -1;

        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int mid = left + (right - left)/2;

            if(arr[mid] > arr[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }

        int start = left;
        left = 0;
        right = arr.length-1;

        if(arr[start] <= target && arr[right] >= target){
            left = start;
        }else {
            right = start - 1;
        }

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {12, 14, 16, 2, 3, 6, 8};
        System.out.println(search(array, 12));
    }
}
