package com.example.winz_fast.dao.impl;

import com.example.winz_fast.dao.IVehicleDAO;
import com.example.winz_fast.model.product.Vehicle;
import com.example.winz_fast.utils.JDBCConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleDAO implements IVehicleDAO {
    private static final String SELECT_ALL = "SELECT * FROM vehicles WHERE is_delete = 0";
    private static final String SELECT_BY_ID = "SELECT * FROM vehicles WHERE is_delete = 0 AND vehicle_id = ?";
    private static final String INSERT_VEHICLE =
            "INSERT INTO vehicles (vehicle_name, brand_id, variant_id, price, status)" +
                    "VALUES (?,?,?,?,?)";
    private static final String EDIT_VEHICLE =
            "UPDATE vehicles SET vehicle_name = ?, brand_id = ?, variant_id = ?, price = ?, status = ?" +
                    "WHERE vehicle_id = ?";
    private static final String REMOVE_VEHICLE =
            "UPDATE vehicles SET is_delete = 1 WHERE vehicle_id = ?";

    @Override
    public List<Vehicle> getAllVehicle() {
        List<Vehicle> vehicles = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int vehicle_id = resultSet.getInt("vehicle_id");
                String vehicle_name = resultSet.getString("vehicle_name");
                int brand_id = resultSet.getInt("brand_id");
                int variant_id = resultSet.getInt("variant_id");
                double price = resultSet.getDouble("price");
                String status = resultSet.getString("status");
                vehicles.add(new Vehicle(vehicle_id, vehicle_name, brand_id, variant_id, price, status));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return vehicles;
    }

    @Override
    public boolean add(Vehicle vehicle) {
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(INSERT_VEHICLE);
            statement.setString(1, vehicle.getVehicle_name());
            statement.setInt(2, vehicle.getBrand_id());
            statement.setInt(3, vehicle.getVariant_id());
            statement.setDouble(4, vehicle.getPrice());
            statement.setString(5, vehicle.getStatus());
            boolean rowInserted = statement.executeUpdate() > 0;
            return rowInserted;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean edit(Vehicle vehicle) {
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(EDIT_VEHICLE);
            statement.setString(1, vehicle.getVehicle_name());
            statement.setInt(2, vehicle.getBrand_id());
            statement.setInt(3, vehicle.getVariant_id());
            statement.setDouble(4, vehicle.getPrice());
            statement.setString(5, vehicle.getStatus());
            statement.setInt(6, vehicle.getVehicle_id());
            int rowUpdated = statement.executeUpdate();
            return rowUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(int vehicle_id) {
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(REMOVE_VEHICLE);
            statement.setInt(1, vehicle_id);
            int rowRemoved = statement.executeUpdate();
            return rowRemoved > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Vehicle getVehicleById(int vehicle_id) {
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID);
            statement.setInt(1, vehicle_id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String vehicle_name = resultSet.getString("vehicle_name");
                int brand_id = resultSet.getInt("brand_id");
                int variant_id = resultSet.getInt("variant_id");
                double price = resultSet.getDouble("price");
                String status = resultSet.getString("status");
                return new Vehicle(vehicle_id, vehicle_name, brand_id, variant_id, price, status);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
