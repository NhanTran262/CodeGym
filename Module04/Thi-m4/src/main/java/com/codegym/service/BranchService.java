package com.codegym.service;

import com.codegym.model.Branch;

import java.util.List;
import java.util.Optional;

public interface BranchService {
    public List<Branch> getAllBranch();

    public void save(Branch branch);

    public void delete(Long id);

    public Optional<Branch> getBranchById(Long id);
}
