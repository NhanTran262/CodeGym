package com.example.winz_fast.dao;

import com.example.winz_fast.model.product.Vehicle;

import java.util.List;

public interface IVehicleDAO {
    List<Vehicle> getAllVehicle();

    boolean add(Vehicle vehicle);

    boolean edit(Vehicle vehicle);

    boolean remove(int vehicle_id);

    Vehicle getVehicleById(int vehicle_id);
}
