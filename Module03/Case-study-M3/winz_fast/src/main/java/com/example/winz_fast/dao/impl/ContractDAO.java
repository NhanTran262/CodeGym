package com.example.winz_fast.dao.impl;

import com.example.winz_fast.dao.IContractDAO;
import com.example.winz_fast.model.Contract;
import com.example.winz_fast.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDAO implements IContractDAO {
    private static final String SELECT_ALL = "SELECT * FROM contracts WHERE is_delete = 0";

    @Override
    public List<Contract> getAllContract() {
        List<Contract> contracts = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("contract_id");
                String contractDate = resultSet.getString("contract_date");
                double deposits = resultSet.getDouble("deposits");
                int employeeId = resultSet.getInt("employee_id");
                int customerId = resultSet.getInt("customer_id");
                int vehicleId = resultSet.getInt("vehicle_id");
                contracts.add(new Contract(id, contractDate, deposits, employeeId, customerId, vehicleId));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return contracts;
    }

    @Override
    public boolean add(Contract contract) {
        return false;
    }

    @Override
    public boolean edit(Contract contract) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public boolean getContractById(int id) {
        return false;
    }
}
