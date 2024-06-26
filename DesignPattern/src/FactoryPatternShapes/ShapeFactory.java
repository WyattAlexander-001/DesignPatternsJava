package FactoryPatternShapes;

//Shape Factory Class
public class ShapeFactory {
 // Use getShape method to get object of type shape 
 public Shape getShape(String shapeType){
     if(shapeType == null){
         return null;
     }        
     if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
     } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
     } else if(shapeType.equalsIgnoreCase("TRIANGLE")){
         return new Triangle();
     }
     return null;
 }
}
