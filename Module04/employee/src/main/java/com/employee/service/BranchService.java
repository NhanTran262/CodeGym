package com.employee.service;

import com.employee.entity.Branch;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface BranchService {
    public List<Branch> getBranchs();

    public void save(Branch branch);

    public void deleteById(Long id);

    public Optional<Branch> getBranchById(Long id);
}
