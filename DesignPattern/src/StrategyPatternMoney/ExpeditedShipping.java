package StrategyPatternMoney;

public class ExpeditedShipping implements ShippingStrategy {
    public double calculateShippingCost(Order order) {
        return 15.99; // Flat rate
    }
} 
