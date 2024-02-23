package com.example.winz_fast.service.impl;

import com.example.winz_fast.dao.IVehicleDAO;
import com.example.winz_fast.dao.impl.VehicleDAO;
import com.example.winz_fast.model.product.Vehicle;
import com.example.winz_fast.service.IVehicleService;

import java.util.List;

public class VehicleService implements IVehicleService {
    IVehicleDAO vehicleDAO = new VehicleDAO();

    @Override
    public List<Vehicle> getAllVehicle() {
        return vehicleDAO.getAllVehicle();
    }

    @Override
    public boolean add(Vehicle vehicle) {
        return vehicleDAO.add(vehicle);
    }

    @Override
    public boolean edit(Vehicle vehicle) {
        return vehicleDAO.edit( vehicle);
    }

    @Override
    public boolean remove(int vehicle_id) {
        return vehicleDAO.remove(vehicle_id);
    }

    @Override
    public Vehicle getVehicleById(int vehicle_id) {
        return vehicleDAO.getVehicleById(vehicle_id);
    }
}
