/*
FUNCTION BuyAndSellStock(prices)

    buyPrice ← Infinity
    maxProfit ← 0

    FOR each price in prices

        IF buyPrice < price THEN

            profit ← price - buyPrice

            maxProfit ← maximum(maxProfit, profit)

        ELSE

            buyPrice ← price

        END IF

    END FOR

    RETURN maxProfit

END FUNCTION
 */



public class BuyAndSellStock {

    public static int buyNdSellStock(int prices[]) {

        // Stores the minimum stock price seen so far
        int buyPrice = Integer.MAX_VALUE;

        // Stores the maximum profit obtained so far
        int maxProfit = 0;

        // Traverse all stock prices
        for (int i = 0; i < prices.length; i++) {

            // If current price is greater than buyPrice,
            // then selling today gives profit
            if (buyPrice < prices[i]) {

                // Calculate profit
                int profit = prices[i] - buyPrice;

                // Update maximum profit if current profit is larger
                maxProfit = Math.max(maxProfit, profit);

            } else {

                // Found a cheaper stock price,
                // update buyPrice
                buyPrice = prices[i];
            }
        }

        // Return maximum profit
        return maxProfit;
    }

    public static void main(String[] args) {

        int prices[] = {7, 1, 5, 3, 6, 4};

        int maxProfit = buyNdSellStock(prices);

        System.out.println("Maximum Profit = " + maxProfit);
    }
}