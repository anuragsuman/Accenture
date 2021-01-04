package DataStructures.Arrays;

import java.util.Arrays;

public class
MinimumPlatforms {

    public static int findMinimumPlatforms(int[] arrival, int[] departure){
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int maxPlatform = 0;
        int platformNeeded = 0;
        int i = 0, j = 0;
        while(i < arrival.length && j < departure.length){
            if(arrival[i] < departure[j]){
                platformNeeded++;
                i++;
                if(platformNeeded > maxPlatform)
                    maxPlatform = platformNeeded;
            }else{
                platformNeeded--;
                j++;
            }
        }
        return maxPlatform;
    }

    public static void main(String[] args) {
        int arr[] = {100, 140, 150, 200, 215, 400};
        int dep[] = {110, 300, 220, 230,315, 600};
        System.out.println(findMinimumPlatforms(arr, dep));
    }
}
