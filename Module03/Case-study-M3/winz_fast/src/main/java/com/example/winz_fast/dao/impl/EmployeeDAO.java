package com.example.winz_fast.dao.impl;

import com.example.winz_fast.dao.IEmployeeDAO;
import com.example.winz_fast.model.person.Employee;
import com.example.winz_fast.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements IEmployeeDAO {
    private static final String SELECT_ALL = "SELECT * FROM employees WHERE is_delete = 0";
    private static final String SELECT_BY_ID = "SELECT * FROM employees WHERE employee_id = ? AND is_delete = 0";
    private static final String  INSERT_EMPLOYEE =
            "INSERT INTO employees (employee_name, date_of_birth, id_card, phone_number, email, address," +
                    "level_id, position_id, department_id, salary, user_name)" +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_EMPLOYEE =
            "UPDATE employees SET employee_name = ?, date_of_birth = ?, id_card = ?, phone_number = ?," +
                    "email = ?, address = ?, level_id = ?, position_id = ?, department_id = ?, salary = ? " +
                    "WHERE employee_id = ?";
    private static final String REMOVE_EMPLOYEE = "UPDATE employees SET is_delete = 1 WHERE employee_id = ?";

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("employee_id");
                String name = resultSet.getString("employee_name");
                String dateOfBirth = resultSet.getString("date_of_birth");
                String idCard = resultSet.getString("id_card");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String employeeAddress = resultSet.getString("address");
                int levelId = resultSet.getInt("level_id");
                int positionId = resultSet.getInt("position_id");
                int departmentId = resultSet.getInt("department_id");
                double salary = resultSet.getDouble("salary");
                String username = resultSet.getString("user_name");
                employees.add(new Employee(id, name, dateOfBirth, idCard, phoneNumber, email, employeeAddress,
                        levelId, positionId, departmentId, salary, username));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

    @Override
    public boolean add(Employee employee) {
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(INSERT_EMPLOYEE);
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getDateOfBirth());
            statement.setString(3, employee.getIdCard());
            statement.setString(4, employee.getPhoneNumber());
            statement.setString(5, employee.getEmail());
            statement.setString(6, employee.getEmployeeAddress());
            statement.setInt(7, employee.getLevelId());
            statement.setInt(8, employee.getPositionId());
            statement.setInt(9, employee.getDepartmentId());
            statement.setDouble(10, employee.getSalary());
            statement.setString(11, employee.getUsername());
            boolean rowInserted = statement.executeUpdate() > 0;
            return rowInserted;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean edit(Employee employee) {
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE_EMPLOYEE);
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getDateOfBirth());
            statement.setString(3, employee.getIdCard());
            statement.setString(4, employee.getPhoneNumber());
            statement.setString(5, employee.getEmail());
            statement.setString(6, employee.getEmployeeAddress());
            statement.setInt(7, employee.getLevelId());
            statement.setInt(8, employee.getPositionId());
            statement.setInt(9, employee.getDepartmentId());
            statement.setDouble(10, employee.getSalary());
            statement.setInt(11, employee.getId());
            boolean rowUpdated = statement.executeUpdate() > 0;
            return rowUpdated;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(int id) {
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(REMOVE_EMPLOYEE);
            statement.setInt(1, id);
            boolean rowRemoved = statement.executeUpdate() > 0;
            return rowRemoved;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Employee getEmployeeById(int id) {
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("employee_name");
                String dateOfBirth = resultSet.getString("date_of_birth");
                String idCard = resultSet.getString("id_card");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String employeeAddress = resultSet.getString("address");
                int levelId = resultSet.getInt("level_id");
                int positionId = resultSet.getInt("position_id");
                int departmentId = resultSet.getInt("department_id");
                double salary = resultSet.getDouble("salary");
                String username = resultSet.getString("user_name");
                return new Employee(id, name, dateOfBirth, idCard, phoneNumber, email, employeeAddress,
                        levelId, positionId, departmentId, salary, username);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
