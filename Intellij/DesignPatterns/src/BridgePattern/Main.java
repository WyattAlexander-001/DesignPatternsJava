package BridgePattern;
//Bridge is basically connecting two base classes together so their children can benefit
public class Main {
    public static void main (String[] args){
        var remoteControl = new RemoteControl(new SonyTv());
        remoteControl.turnOn();
        remoteControl.turnOff();
        var remoteControl2 = new AdvancedRemoteControl(new SonyTv());
        remoteControl2.setChannel(44);

        var samsungRemote = new AdvancedRemoteControl(new SamsungTv());
        samsungRemote.setChannel(55);
    }
}
