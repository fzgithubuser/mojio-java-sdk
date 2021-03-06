package io.moj.java.sdk.model;

import io.moj.java.sdk.model.response.ListResponse;
import org.junit.Test;

import static io.moj.java.sdk.test.TestUtils.assertAccess;
import static io.moj.java.sdk.test.TestUtils.assertToStringContainsAllFields;

/**
 * Created by skidson on 16-02-23.
 */
public class EntityTests {

    @Test
    public void testApp() throws IllegalAccessException {
        App app = new App();
        assertToStringContainsAllFields(app);
        assertAccess(app);
    }

    @Test
    public void testGeofence() throws IllegalAccessException {
        Geofence geofence = new Geofence();
        assertToStringContainsAllFields(geofence);
        assertAccess(geofence);
    }

    @Test
    public void testGroup() throws IllegalAccessException {
        Group group = new Group();
        assertToStringContainsAllFields(group);
        assertAccess(group);
    }

    @Test
    public void testListResponse() throws IllegalAccessException {
        ListResponse response = new ListResponse();
        assertToStringContainsAllFields(response);
        assertAccess(response);
    }

    @Test
    public void testMojio() throws IllegalAccessException {
        Mojio mojio = new Mojio();
        assertToStringContainsAllFields(mojio);
        assertAccess(mojio);
    }

    @Test
    public void testTransaction() throws IllegalAccessException {
        Transaction transaction = new Transaction();
        assertToStringContainsAllFields(transaction);
        assertAccess(transaction);
    }

    @Test
    public void testTrip() throws IllegalAccessException {
        Trip trip = new Trip();
        assertToStringContainsAllFields(trip);
        assertAccess(trip);
    }

    @Test
    public void testUser() throws IllegalAccessException {
        User user = new User();
        assertToStringContainsAllFields(user);
        assertAccess(user);
    }

    @Test
    public void testVehicle() throws IllegalAccessException {
        Vehicle vehicle = new Vehicle();
        assertToStringContainsAllFields(vehicle);
        assertAccess(vehicle);
    }

    @Test
    public void testVehicleMeasure() throws IllegalAccessException {
        VehicleMeasure vehicleMeasure = new VehicleMeasure();
        assertToStringContainsAllFields(vehicleMeasure);
        assertAccess(vehicleMeasure);
    }

}
