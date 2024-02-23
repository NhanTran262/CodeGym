package com.example.winz_fast.service.impl;

import com.example.winz_fast.dao.IBrandDAO;
import com.example.winz_fast.dao.impl.BrandDAO;
import com.example.winz_fast.model.product.Brand;
import com.example.winz_fast.service.IBrandService;

import java.util.List;

public class BrandService implements IBrandService {
    IBrandDAO brandDAO = new BrandDAO();

    @Override
    public List<Brand> getAllBrand() {
        return brandDAO.getAllBrand();
    }
}
