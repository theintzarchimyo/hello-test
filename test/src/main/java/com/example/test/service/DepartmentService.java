package com.example.test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.mapper.DepartmentMapper;
import com.example.test.model.Department;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartment();
    }

    public Department getDepartmentById(Long id) {
        return departmentMapper.getDepartmentById(id);
    }

    public Department getDepartmentByName(String departmentName) {
        return departmentMapper.getDepartmentByName(departmentName);
    }

    public Department createDepartment(Department department) {
    	departmentMapper.insertDepartment(department);
        return department;
    }

    public Department updateDepartment(Department department) {
    	departmentMapper.updateDepartment(department);
        return department;
    }

    public boolean deleteDepartment(Long id) {
        return departmentMapper.deleteDepartment(id) > 0;
    }
}