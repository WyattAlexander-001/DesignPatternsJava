package TemplateMethodPattern;

public class Main {
    public static void main (String[] args){
        System.out.println("Template Pattern:");

        var task = new TransferMoneyTask();
        task.execute();
    }
}
