package DataStructures.Arrays;

public class LargestProductOfSubArray {

    public static int maxProduct(int[] nums){
        if(nums.length == 0){
            return -1;
        }

        int currentMax = nums[0];
        int currentMin = nums[0];
        int result = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int temp = currentMax;

            currentMax = Math.max(Math.max(currentMax * nums[i], currentMin * nums[i]), nums[i]);
            currentMin = Math.min(Math.min(temp * nums[i], currentMin * nums[i]), nums[i]);

            if (currentMax > result) {
                result = currentMax;
            }
        }
        return result;
    }

    public static int maxSum(int[] nums){
        if(nums.length == 0) return -1;

        int currentMax = nums[0];
        int result = nums[0];

        for(int i = 1; i < nums.length; i++) {
            currentMax = Math.max(currentMax + nums[i], nums[i]);
            if (currentMax > result) {
                result = currentMax;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, -3, 4};
        System.out.println(maxProduct(nums));

        System.out.println(maxSum(nums));
    }
}
