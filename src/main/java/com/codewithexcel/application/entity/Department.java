package com.codewithexcel.application.entity;

public class Department {
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

    private String getDepartmentAddress(){
        return departmentAddress;
    }

    private void setDepartmentAddress(String departmentAddress){
        this.departmentAddress = departmentAddress;
    }

    private String getDepartmentCode(){
        return departmentCode;
    }
    private void setDepartmentCode(String departmentAddress){
        this.departmentCode = departmentCode;
    }
}

