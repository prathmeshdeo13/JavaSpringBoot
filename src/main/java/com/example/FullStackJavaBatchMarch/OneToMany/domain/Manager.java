package com.example.FullStackJavaBatchMarch.OneToMany.domain;


import javax.persistence.*;
import java.util.List;

@Entity
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String address;

    private Integer contact;


    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<EmployeeM> employeeM;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public List<EmployeeM> getEmployee() {
        return employeeM;
    }

    public void setEmployee(List<EmployeeM> employeeM) {
        this.employeeM = employeeM;
    }
}
