package POO;

public class SmartPhone extends SmartDevice {

    protected double capacity;
    protected String software;

    public SmartPhone() {
    }

    public SmartPhone(String maker, String model, int year, double capacity, String software) {
        super(maker, model, year);
        this.capacity = capacity;
        this.software = software;
    }
}
