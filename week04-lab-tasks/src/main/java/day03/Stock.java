package day03;

import java.util.List;

public class Stock {
    private List<Double> price;

    public Stock(List price) {
        this.price = price;
    }

    public double maxProfit() {
        double maxProfit = 0;
        for (int i = 0; i < price.size(); i++) {
            for (int j = i + 1; j < price.size(); j++) {
                if (price.get(j) - price.get(i) > maxProfit) {
                    maxProfit = (price.get(j) - price.get(i));
                }
            }
        }
        return maxProfit;
    }
}