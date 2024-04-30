package StrategyPatternMoney;

public class StandardShipping implements ShippingStrategy {
    public double calculateShippingCost(Order order) {
        return 5.99; // Flat rate
    }
}


