package DataStructures.Arrays;

public class TrappingRainWater {

    public static void main(String[] args) {
        TrappingRainWater trw = new TrappingRainWater();
        int[] input = {3,1,2,4,2};
        int result = trw.trap(input);
        System.out.println(result);
    }

    public int trap(int[] height){
        int rainWater = 0;
        int maxSeenSoFar = 0;
        int[] maxSeenRight = new int[height.length];
        int maxSeenLeft = 0;

        for(int i = height.length-1; i >= 0; i--){
            if(maxSeenSoFar < height[i]){
                maxSeenSoFar = height[i];
            }
            maxSeenRight[i] = maxSeenSoFar;
        }

        for(int i = 0; i < height.length; i++){

            rainWater = rainWater + Integer.max((Integer.min(maxSeenLeft, maxSeenRight[i])-height[i]), 0);
            if(maxSeenLeft < height[i]){
                maxSeenLeft = height[i];
            }
        }
        return rainWater;
    }
}
