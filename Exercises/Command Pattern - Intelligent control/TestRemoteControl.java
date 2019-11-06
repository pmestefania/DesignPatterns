public class TestRemoteControl {
    public static void main(String[] args) {

        RemoteControl remote = new RemoteControl(); 

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();        
        Stereo stereo = new Stereo("Living Room");  
        TV tv = new TV("Living Room");        
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);                       
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);   
        
        LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenLight);                       
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight); 

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);        
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);  

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
        remote.setCommand(2, ceilingFanOn, ceilingFanOff);
        remote.setCommand(3, stereoOnWithCD, stereoOff); 
        remote.setCommand(3, tvOn, tvOff);        
       
        System.out.println(remote);

        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        remote.onButtonWasPressed(1);
        remote.offButtonWasPressed(1);
        remote.onButtonWasPressed(2);
        remote.offButtonWasPressed(2);
        remote.onButtonWasPressed(3);
        remote.offButtonWasPressed(3);
    }
}