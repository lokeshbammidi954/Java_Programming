package Java_Programming.Recursion;

public class BuyAndSell {
    public static int BuyAndSellStock(int prices[]){
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profitToday = prices[i] - buyPrice;
                profit = Math.max(profitToday, profit);
            }
            else {
                buyPrice = prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {3,5,7,2,9,15,20};
        System.out.println(BuyAndSellStock(arr));
    }
}
