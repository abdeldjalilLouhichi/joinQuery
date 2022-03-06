package com.bmx.joinquery.service;


import com.bmx.joinquery.bean.EmpDepPojo;
import com.bmx.joinquery.model.Employee;
import com.bmx.joinquery.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;


    public List<Employee> allEmployees(){
        return employeeRepo.findAll();
    }

    public void addEmployee(Employee employee){
        employeeRepo.save(employee);
    }

    public List<EmpDepPojo> getJoinInfo(){
        return employeeRepo.getJoinInfo();
    }
}
