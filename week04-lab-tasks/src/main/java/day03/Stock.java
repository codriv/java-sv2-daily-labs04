package day03;

import java.util.List;

public class Stock {
    private List<Double> price;

    public Stock(List price) {
        this.price = price;
    }

    public double maxProfit() {
        int indexOfMin = 0;
        for (int i = 1; i < price.size(); i++) {
            if (price.get(i) < price.get(indexOfMin)) {
                indexOfMin = i;
            }
        }
        int indexOfMaxFromMin = indexOfMin;
        for (int i = indexOfMin; i < price.size(); i++) {
            if (price.get(i) > price.get(indexOfMaxFromMin)) {
                indexOfMaxFromMin = i;
            }
        }
        return price.get(indexOfMaxFromMin) - price.get(indexOfMin);
    }
}