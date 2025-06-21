package day6_Abstraction;


interface RemoteControl {
    void turnOn();
    void turnOff();
    void changeChannel(int channel);
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }

    public void changeChannel(int channel) {
        System.out.println("TV channel changed to " + channel);
    }
}

class AC implements RemoteControl {
    public void turnOn() {
        System.out.println("AC is ON");
    }

    public void turnOff() {
        System.out.println("AC is OFF");
    }

    public void changeChannel(int channel) {
        System.out.println("AC does not support channel change");
    }

}

public class InterfaceRemoteDemo {
    public static void main(String[] args) {
        RemoteControl tv = new TV();
        tv.turnOn();
        tv.changeChannel(5);
        tv.turnOff();

        RemoteControl ac = new AC();
        ac.turnOn();
        ac.changeChannel(1);
        ac.turnOff();
    }
}
