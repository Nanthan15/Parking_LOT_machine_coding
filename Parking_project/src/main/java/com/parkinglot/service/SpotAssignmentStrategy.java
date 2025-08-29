package com.parkinglot.service;

import com.parkinglot.model.ParkingSpot;
import com.parkinglot.model.VechicleType;

import java.util.Collection;
import java.util.Optional;

public interface SpotAssignmentStrategy {
    Optional<ParkingSpot> findSpot(Collection<ParkingSpot> spots, VechicleType vehicleType);
}
