package StrategyPatternMoney;

public class InternationalShipping implements ShippingStrategy {
    public double calculateShippingCost(Order order) {
        return 25.99 + (0.05 * order.getWeight()); // Base rate plus weight
    }
}
