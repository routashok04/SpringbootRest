package com.example.springbootrest.service;

import com.example.springbootrest.model.Employee;
import com.example.springbootrest.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }
}
