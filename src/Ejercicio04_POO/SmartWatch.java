package Ejercicio04_POO;

public class SmartWatch extends SmartDevice {

    protected String screenSize;
    protected String screenForm;

    public SmartWatch() {
    }

    public SmartWatch(String maker, String model, int year, String screenSize, String screenForm) {
        super(maker, model, year);
        this.screenSize = screenSize;
        this.screenForm = screenForm;
    }
}
