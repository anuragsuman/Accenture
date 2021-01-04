package DataStructures.Arrays;

public class StockBuySell {

    public static int maximizeStockProfit(int[] array){
        int lowestPrice = array[0];
        int maxProfit = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            int profit = 0;
            if(array[i] > lowestPrice) {
                profit = array[i] - lowestPrice;
                if (profit > maxProfit)
                    maxProfit = profit;
            }else{
                lowestPrice = array[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] array = {14, 12, 70, 15, 99, 65, 21, 100};
        System.out.println(maximizeStockProfit(array));
    }
}
