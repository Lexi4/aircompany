package plane;

import java.util.Objects;

abstract public class Plane {

    String model;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    public Plane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMinLoadCapacity() {
        return maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Plane{model='" + model + "', maxSpeed=" + maxSpeed +", maxFlightDistance=" + maxFlightDistance + ", maxLoadCapacity=" + maxLoadCapacity + '}';
    }

    @Override
    public boolean equals(Object planeObject) {
        if (this == planeObject) {
            return true;
        } else if (!(planeObject instanceof Plane)) {
            return false;
        } else {
            Plane comparedPlane = (Plane) planeObject;
            return maxSpeed == comparedPlane.maxSpeed &&
                    maxFlightDistance == comparedPlane.maxFlightDistance &&
                    maxLoadCapacity == comparedPlane.maxLoadCapacity &&
                    Objects.equals(model, comparedPlane.model);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
