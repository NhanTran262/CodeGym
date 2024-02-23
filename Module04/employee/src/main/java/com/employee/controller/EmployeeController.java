package com.employee.controller;

import com.employee.dto.EmployeeDTO;
import com.employee.entity.Employee;
import com.employee.service.BranchService;
import com.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;


@Controller
@AllArgsConstructor
public class EmployeeController {
    private final BranchService branchService;


    private final EmployeeService employeeService;


    @GetMapping("/employees/add")
    public String getFormNewEmployee(Model model) {
        model.addAttribute("employeeDTO", new EmployeeDTO());
        model.addAttribute("branchs", branchService.getBranchs());
        return "create";
    }

    @PostMapping("/employees/add")
    public String newEmployee(
            @ModelAttribute("employeeDTO") EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        employee.setEmployeeCode(employeeDTO.getEmployeeCode());
        employee.setBranch(branchService.getBranchById(employeeDTO.getBranch()).get());
        employee.setName(employeeDTO.getName());
        employee.setAge(employeeDTO.getAge());
        employee.setSalary(employeeDTO.getSalary());

        employeeService.save(employee);
        return "redirect:/employees";
    }

    @GetMapping("/employees/update/{id}")
    public String updateEmployeeById(@PathVariable Long id, Model model) {
        Optional<Employee> employeeOptional = employeeService.getEmployeeById(id);
        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setId(employee.getId());
            employeeDTO.setEmployeeCode(employee.getEmployeeCode());
            employeeDTO.setBranch(employee.getBranch().getId());
            employeeDTO.setName(employee.getName());
            employeeDTO.setAge(employee.getAge());
            employeeDTO.setSalary(employee.getSalary());

            model.addAttribute("employeeDTO", employeeDTO);
            model.addAttribute("branchs", branchService.getBranchs());
            return "update";
        } else {
            return null;
        }
    }

    @GetMapping("/employees/delete/{id}")
    public String deleteEmployeeById(@PathVariable long id) {
        employeeService.deleteById(id);
        return "redirect:/employees";
    }

    @GetMapping("/employees")
    public String getAllEmployee(Model model) {
        List<Employee> employees = employeeService.getEmployees();
        employees.sort(Comparator.comparingLong(Employee::getAge));
        model.addAttribute("employees", employees);
        return "list";
    }
}
