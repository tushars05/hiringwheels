package org.ncu.hirewheels.services;

import java.util.List;

import org.ncu.hirewheels.entities.Location;

public interface LocationService {
    List<Location> getAllLocations();
    Location getLocationById(Long locationId);
    Location createLocation(Location location);
}
