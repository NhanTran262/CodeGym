package com.codegym.service.impl;

import com.codegym.model.Branch;
import com.codegym.repository.BranchRepository;
import com.codegym.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BranchServiceImpl implements BranchService {
    @Autowired
    private BranchRepository branchRepository;
    @Override
    public List<Branch> getAllBranch() {
        return branchRepository.findAll();
    }

    @Override
    public void save(Branch branch) {
branchRepository.save(branch);
    }

    @Override
    public void delete(Long id) {
branchRepository.deleteById(id);
    }

    @Override
    public Optional<Branch> getBranchById(Long id) {
        return branchRepository.findById(id);
    }
}
