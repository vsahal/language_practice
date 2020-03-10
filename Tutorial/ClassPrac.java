public class ClassPrac {

    boolean isOn;

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    void displayLightStatus() {
        System.out.println("Light is on? " + isOn);
    }

    public static void main(String[] args) {

        ClassPrac l1 = new ClassPrac();
        ClassPrac l2 = new ClassPrac();

        l1.turnOn();
        l2.turnOff();

        l1.displayLightStatus();
        l2.displayLightStatus();
    }

}