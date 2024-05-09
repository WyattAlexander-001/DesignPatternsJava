package BridgePattern;

public class SonyTv  implements Device{
    @Override
    public void turnOn() {
        System.out.println("Sony: TUNR ONNN!!!");
    }

    @Override
    public void turnOff() {
        System.out.println("SONY TURN OFF!!!!");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("SONY SET THE CHANNEL!!!!");
    }
}
