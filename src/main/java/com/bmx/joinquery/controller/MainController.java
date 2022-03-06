package com.bmx.joinquery.controller;

import com.bmx.joinquery.bean.EmpDepPojo;
import com.bmx.joinquery.model.Department;
import com.bmx.joinquery.model.Employee;
import com.bmx.joinquery.service.DepartmentService;
import com.bmx.joinquery.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class MainController {

    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("hello")
    public String test (){
        return "success";
    }

    @GetMapping("employees")
    public List<Employee> getEmployees (){
        return employeeService.allEmployees();
    }

    @PostMapping("employee")
    public void addEmployee (@RequestBody Employee emp){
        employeeService.addEmployee(emp);
    }

    @GetMapping("emp/dep")
    public List<EmpDepPojo> getJoinInfo (){
        return employeeService.getJoinInfo();
    }


    @GetMapping("departments")
    public List<Department> getDepartments (){
        return departmentService.allDepartemnts();
    }

    @PostMapping("department")
    public void addDepartment (@RequestBody Department dep){
        departmentService.addDepartemnt(dep);
    }
}
