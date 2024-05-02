package TaxInterface;

public class Main {
    public static void main (String[] args){
        System.out.println(getCalculator());


    }


    //Just for the example of interfaces using static
    public static TaxCalculator getCalculator(){
        return new TaxCalculator2023();
    }
}
