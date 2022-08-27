package com.codewithexcel.application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

    private long getDepartmentId() {
        return departmentId;
    }
    private void setDepartmentId(long departmentId){
        this.departmentId = departmentId;
    }

    private String getDepartmentName(){
        return departmentName;
    }

    private void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress(){
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress){
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentCode(){
        return departmentCode;
    }
    public void setDepartmentCode(String departmentAddress){
        this.departmentCode = departmentCode;
    }

    public Department(long departmentId, String departmentName, String departmentAddress, String departmentCode){
        this.departmentId = departmentId;
        this.departmentAddress = departmentAddress;
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;

    }
    @Override
    public String toString(){
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentAddress'" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentCode'" + departmentCode + '\'' +
                '}';
    }
}

