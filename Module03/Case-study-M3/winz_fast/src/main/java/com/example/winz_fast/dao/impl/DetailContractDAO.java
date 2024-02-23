package com.example.winz_fast.dao.impl;

import com.example.winz_fast.dao.IDetailContractDAO;
import com.example.winz_fast.model.DetailContract;
import com.example.winz_fast.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DetailContractDAO implements IDetailContractDAO {
    private static final String SELECT_ALL = "SELECT * FROM detail_contracts WHERE is_delete = 0";
    @Override
    public List<DetailContract> getAllDetailContract() {
        List<DetailContract> detailContracts = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt("detail_contract_id");
                int contractId =resultSet.getInt("contract_id");
                int quantity=resultSet.getInt("quantity");
                detailContracts.add(new DetailContract(id,contractId,quantity));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return detailContracts;
    }
}
