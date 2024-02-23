package com.example.winz_fast.service.impl;

import com.example.winz_fast.dao.IVariantDAO;
import com.example.winz_fast.dao.impl.VariantDAO;
import com.example.winz_fast.model.product.Variant;
import com.example.winz_fast.service.IVariantService;

import java.util.List;

public class VariantService implements IVariantService {
    IVariantDAO variantDAO = new VariantDAO();

    @Override
    public List<Variant> getAllVariant() {
        return variantDAO.getAllVariant();
    }
}
