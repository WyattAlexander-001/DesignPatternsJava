package BridgePattern;

public class SamsungTv implements Device {
    @Override
    public void turnOn() {
        System.out.println("SAMSUNG TURNED ON!");
    }

    @Override
    public void turnOff() {
        System.out.println("SAME SUNG TURNED OFF!");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("SAMSUNG CHANGED CHANNEL TO: " +  number);
    }
}
