package FactoryPatternShapes;

public class Circle implements Shape {
    public void draw() {
        System.out.println("""
         , - ~ ~ ~ - ,
     , '               ' ,
   ,                       ,
  ,                         ,
 ,                           ,
 ,                           ,
 ,                           ,
  ,                         ,
   ,                       ,
     ,                  , '
       ' - , _ _ _ ,  '
        		
        		"""
        		);
    }
}
