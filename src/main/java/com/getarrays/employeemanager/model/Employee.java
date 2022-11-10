package com.getarrays.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String department;
    private String jobTitle;
    private String location;
    private Boolean remoteStatus;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public Employee(){}

    public Employee(String firstName, String lastName, String email, String phone, String department, String jobTitle, String location, Boolean remoteStatus, String imageUrl, String employeeCode){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email= email;
        this.phone = phone;
        this.department = department;
        this.jobTitle = jobTitle;
        this.location = location;
        this.remoteStatus = remoteStatus;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }//end constructor

}//end class


