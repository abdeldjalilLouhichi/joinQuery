package com.bmx.joinquery.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpDepPojo {
    private String empName;
    private int empAge;
    private String depName;
}
