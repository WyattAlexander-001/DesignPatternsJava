package StrategyPattern;
//Make more interfaces for strategies
public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter){
        compressor.compress(fileName);
        filter.apply(fileName);
    }

    //Ugly version we want to avoid, break Single Res
//    public void store(String fileName){
//        if(compressor == "jpeg"){
//            System.out.println("Compressing using JPEG");
//        }else if(compressor == "png"){
//            System.out.println("Compressing using PNG");
//        }
//
//        if(compressor == "b&w"){
//            System.out("Apply b&w");
//        } //blah blah
//
//    }
}
