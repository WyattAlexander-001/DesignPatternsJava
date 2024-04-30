package FactoryPatternShapes;

//Main class to demonstrate Factory Pattern
public class FactoryPatternDemo {
 public static void main(String[] args) {
     ShapeFactory shapeFactory = new ShapeFactory();

     // Get an object of Circle and call its draw method.
     Shape shape1 = shapeFactory.getShape("CIRCLE");
     Shape shape11 = shapeFactory.getShape("CIRcle");
     shape1.draw();
     shape11.draw();

     // Get an object of Rectangle and call its draw method.
     Shape shape2 = shapeFactory.getShape("RECTANGLE");
     shape2.draw();

     // Get an object of Triangle and call its draw method.
     Shape shape3 = shapeFactory.getShape("TRIANGLE");
     shape3.draw();
 }
}
