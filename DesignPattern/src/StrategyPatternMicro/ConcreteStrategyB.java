package StrategyPatternMicro;

//Concrete Strategy B
public class ConcreteStrategyB implements Strategy {
	//Again, interfaces are a contract, we said we are going to implement this:
 public void execute() {
     System.out.println("Strategy B execution");
 }
}