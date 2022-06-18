public class Plane {

    private Type type;
    private FlightManager flightManager;

    public Plane(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPlaneWeight() {
        return this.type.getWeight();
    }

    public int getPlaneCapacity() {
        return this.type.getCapacity();
    }

}
