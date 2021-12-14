package com.amusemeu.employee.Employee.Editor.Model;


import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @SequenceGenerator(name = "employees", sequenceName = "employees")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employees")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phoneNumber")
    private int phoneNumber;

    @Column(name = "department_id")
    private Integer department_id;

    public Employee(){

    }

    public Employee(Long id, String name, String surname, int phoneNumber, Integer department_id) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.department_id = department_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

}