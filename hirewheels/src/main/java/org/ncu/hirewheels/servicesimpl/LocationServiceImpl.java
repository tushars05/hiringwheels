package org.ncu.hirewheels.servicesimpl;

import java.util.List;

import org.ncu.hirewheels.dao.LocationRepository;
import org.ncu.hirewheels.entities.Location;
import org.ncu.hirewheels.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {
    private final LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @Override
    public Location getLocationById(Long locationId) {
        return locationRepository.findById(locationId).orElse(null);
    }

    @Override
    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }
}
