package min;

public class Vehicle {
    @FieldInfo("Describing type of vehicle")
    private String type;
    @FieldInfo("Describing type of fuel")
    private String fuelType;
    @FieldInfo
    private int maxSpeed;
    private double weight;

    public Vehicle(String type, String fuelType, int maxSpeed, double weight) {
        this.type = type;
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                '}';
    }
}
