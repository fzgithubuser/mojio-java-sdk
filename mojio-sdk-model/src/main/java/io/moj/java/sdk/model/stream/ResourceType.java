package io.moj.java.sdk.model.stream;

/**
 * Enumeration for activity stream resource types.
 * Created by Mauro on 2016-06-24.
 */
public enum ResourceType {
    VEHICLE("Vehicle"),
    USER("User"),
    MOJIO("Mojio"),
    TRIP("Trip"),
    VEHICLE_STATE("VehicleState"),
    PARKING_RESERVATION("ParkingReservation");

    private String key;

    ResourceType(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public static ResourceType fromKey(String key) {
        for (ResourceType type : values()) {
            if (type.getKey().equals(key)) {
                return type;
            }
        }
        return null;
    }
}
