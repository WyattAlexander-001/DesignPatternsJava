package BridgePattern;

//We want various kinds of remote controls
public class RemoteControl {
    protected Device device; //this is the bridge

    public RemoteControl(Device device) {
        this.device = device;
    }
    public void turnOn(){
        device.turnOn();
    }
    public void turnOff(){
        device.turnOff();
    }
}
