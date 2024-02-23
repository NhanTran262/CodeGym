package com.example.winz_fast.service;

import com.example.winz_fast.model.product.Vehicle;

import java.util.List;

public interface IVehicleService {
    List<Vehicle> getAllVehicle();

    boolean add(Vehicle vehicle);

    boolean edit(Vehicle vehicle);

    boolean remove(int vehicle_id);

    Vehicle getVehicleById(int vehicle_id);
}
