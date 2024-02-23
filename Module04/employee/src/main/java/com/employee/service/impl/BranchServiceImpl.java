package com.employee.service.impl;

import com.employee.entity.Branch;
import com.employee.repository.BranchRepository;
import com.employee.service.BranchService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BranchServiceImpl implements BranchService {

    private final BranchRepository branchRepository;

    @Override
    public List<Branch> getBranchs() {
        return branchRepository.findAll();
    }

    @Override
    public void save(Branch branch) {
        branchRepository.save(branch);
    }

    @Override
    public void deleteById(Long id) {
        branchRepository.deleteById(id);
    }

    @Override
    public Optional<Branch> getBranchById(Long id) {
        return branchRepository.findById(id);
    }
}
