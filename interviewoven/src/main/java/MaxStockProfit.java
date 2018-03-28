public class MaxStockProfit {

    private static int getMaxStockProfit(int[] stockPrices) {

        int maxStockProfit = stockPrices[1] - stockPrices[0];
        int minPrice = stockPrices[0];
        for(int counter = 1; counter < stockPrices.length; counter++) {
            maxStockProfit = Math.max(maxStockProfit, stockPrices[counter] - minPrice);
            minPrice = Math.min(minPrice, stockPrices[counter]);
        }
        return maxStockProfit;
    }

    public static void main(String... args) {
        int[] stockPrices = new int[] {30, 27, 24, 23, 22};
        System.out.println(getMaxStockProfit(stockPrices));
    }

}