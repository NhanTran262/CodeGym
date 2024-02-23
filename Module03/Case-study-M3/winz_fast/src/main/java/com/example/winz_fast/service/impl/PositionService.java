package com.example.winz_fast.service.impl;

import com.example.winz_fast.dao.IPositionDAO;
import com.example.winz_fast.dao.impl.PositionDAO;
import com.example.winz_fast.model.person.Position;
import com.example.winz_fast.service.IPositionService;

import java.util.List;

public class PositionService implements IPositionService {
    IPositionDAO positionDAO = new PositionDAO();

    @Override
    public List<Position> getAllPosition() {
        return positionDAO.getAllPosition();
    }
}
