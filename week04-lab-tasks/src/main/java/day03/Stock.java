package day03;

import java.util.List;

public class Stock {
    private List<Double> price;

    public Stock(List price) {
        this.price = price;
    }

    public double maxProfit() {
        double maxProfit = 0d;
        for (int i = 0; i < price.size(); i++) {
            double currentMaxProfit = 0d;
            int indexOfMax = i;
            for (int j = i; j < price.size(); j++) {
                if (price.get(j) > price.get(indexOfMax)) {
                    indexOfMax = j;
                }
            }
            currentMaxProfit = price.get(indexOfMax) - price.get(i);
            if (currentMaxProfit > maxProfit) {
                maxProfit = currentMaxProfit;
            }
        }
        return maxProfit;
    }
}