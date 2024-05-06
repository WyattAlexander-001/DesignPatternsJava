package ObserverPattern;

public class Chart implements Observer{
    private  DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public void update() {
        System.out.println("Chart is notified" + dataSource.getValue());
    }

    //Not coupled with datasource class
//    @Override
//    public  void  update(int val){
//        System.out.println("Chart is notified" + val);
//    }
}
