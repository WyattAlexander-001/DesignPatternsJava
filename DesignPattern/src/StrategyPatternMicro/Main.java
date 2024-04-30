package StrategyPatternMicro;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy();  // Output: Strategy A execution
        
        context.setStrategy(new ConcreteStrategyB()); //We changed strategy
        context.executeStrategy();  // Output: Strategy B execution
        
        
        
        
        System.out.println(context.getClass());
    }
}
