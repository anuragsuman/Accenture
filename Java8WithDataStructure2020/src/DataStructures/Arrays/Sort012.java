package DataStructures.Arrays;

public class Sort012 {

    public static void sortArray(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        int index = 0;

        while(index <= end){
            if(nums[index] == 0){
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;
            } else if(nums[index] == 2){
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            }else{
                index++;
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,0,1,2,1,0};
        sortArray(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
