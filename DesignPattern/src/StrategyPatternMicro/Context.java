package StrategyPatternMicro;

//Context
public class Context {
 private Strategy strategy;

 public Context(Strategy strategy) { //new up a new Concrete Strategy in constructor
     this.strategy = strategy;
 }

 public void setStrategy(Strategy strategy) { //basically pass in new ConcreteStrategy same as when you made obj
     this.strategy = strategy;
 }

 public void executeStrategy() {
     strategy.execute(); //method call to the implementation
 }
 

}



