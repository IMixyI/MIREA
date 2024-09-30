package vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
    private int batteryCapacity;
    @Override
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public ElectricCar() {
        super();
        setEngineType("Electric");
    }
}
