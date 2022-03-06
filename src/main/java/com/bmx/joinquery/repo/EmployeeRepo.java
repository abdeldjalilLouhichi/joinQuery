package com.bmx.joinquery.repo;

import com.bmx.joinquery.bean.EmpDepPojo;
import com.bmx.joinquery.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    @Query("select new com.bmx.joinquery.bean.EmpDepPojo ( e.name , e.age , d.name ) from Employee e JOIN e.department d")
    public List<EmpDepPojo> getJoinInfo();
}
