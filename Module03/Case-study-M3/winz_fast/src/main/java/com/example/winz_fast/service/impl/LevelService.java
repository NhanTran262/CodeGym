package com.example.winz_fast.service.impl;

import com.example.winz_fast.dao.ILevelDAO;
import com.example.winz_fast.dao.impl.LevelDAO;
import com.example.winz_fast.model.person.Level;
import com.example.winz_fast.service.ILevelService;

import java.util.List;

public class LevelService implements ILevelService {
    ILevelDAO levelDAO = new LevelDAO();

    @Override
    public List<Level> getAllLevel() {
        return levelDAO.getAllLevel();
    }
}
