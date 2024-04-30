package StrategyPatternMoney;

public class Order {
    private ShippingStrategy shippingStrategy; //Ref the strategy by using Interface name
    private double weight; // weight in kilograms

    public Order(double weight) {
        this.weight = weight;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateShipping() {
        return shippingStrategy.calculateShippingCost(this);
    }

    public double getWeight() {
        return weight;
    }
    
}
