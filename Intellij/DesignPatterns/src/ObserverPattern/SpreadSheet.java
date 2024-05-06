package ObserverPattern;

public class SpreadSheet implements Observer {
    //Not bad coupling
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet is notified " + dataSource.getValue());
    }

    //Not coupled with datasource class
//    @Override
//    public  void  update(int val){
//        System.out.println("SpreadSheet is notified" + val);
//    }
}
