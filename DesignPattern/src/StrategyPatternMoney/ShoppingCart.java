package StrategyPatternMoney;

public class ShoppingCart {
    public static void main(String[] args) {
        Order order = new Order(100); // an order weighing 10 kg
        order.setShippingStrategy(new StandardShipping());
        System.out.println("Standard Shipping Cost: $" + order.calculateShipping() +" Your object weighs: " + (int)order.getWeight() + "kg");

        order.setShippingStrategy(new ExpeditedShipping());
        System.out.println("Expedited Shipping Cost: $" + order.calculateShipping());

        order.setShippingStrategy(new InternationalShipping());
        System.out.println("International Shipping Cost: $" + order.calculateShipping());
    }
}