package io.moj.java.sdk.model.stream;

/**
 * Activity stream object types
 * Created by Mauro on 2016-07-01.
 */
public enum ObjectType {
    SPEED_LIMIT("SpeedLimit"),
    DTC("DiagnosticTroubleCode");

    private String key;

    ObjectType(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public static ObjectType fromKey(String key) {
        for (ObjectType type : values()) {
            if (type.getKey().equals(key)) {
                return type;
            }
        }
        return null;
    }
}
