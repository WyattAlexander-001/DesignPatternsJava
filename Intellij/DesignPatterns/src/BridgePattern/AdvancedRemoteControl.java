package BridgePattern;

public class AdvancedRemoteControl extends RemoteControl{
    public AdvancedRemoteControl(Device device){
        super(device);
    }
    public void setChannel(int num){
        device.setChannel(num);
    }
}
