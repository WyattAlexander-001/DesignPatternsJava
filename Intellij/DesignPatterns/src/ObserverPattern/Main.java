package ObserverPattern;
//State of object changes, then it notifies other objects, like a pieChart
public class Main {
    public static void main (String[] args){
        System.out.println("Observer Pattern:");
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);
        //Push Style:
//        var sheet1 = new SpreadSheet(dataSource);
//        var sheet2 = new SpreadSheet(dataSource);
//        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);

    }
}
