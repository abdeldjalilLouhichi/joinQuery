package com.bmx.joinquery.service;

import com.bmx.joinquery.model.Department;
import com.bmx.joinquery.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo  departmentRepo;

    public List<Department> allDepartemnts (){
        return departmentRepo.findAll();
    }

    public void addDepartemnt (Department  dep){
         departmentRepo.save(dep);
    }
}
