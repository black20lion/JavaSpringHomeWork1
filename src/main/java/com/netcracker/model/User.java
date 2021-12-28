package com.netcracker.model;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;
import javax.validation.constraints.Email;

public class User {

    @NotNull
    @Size(min=2, max=30)
    private String secondName;

    @NotNull
    @Size(min=2, max=30)
    private String firstName;

    @NotNull
    @Size(min=2, max=30)
    private String patronymic;

    @NumberFormat
    @PositiveOrZero
    @Min(18)
    @Max(120)
    private int age;


    @NumberFormat
    @PositiveOrZero
    @Max(1000000000)
    private double salary;

    @NotEmpty
    @Email
    private String eMail;

    @NotEmpty
    private String workplace;

    public User() {}

    public User(String secondName, String firstName, String patronymic,
                int age, double salary, String eMail, String workplace) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.age = age;
        this.salary = salary;
        this.eMail = eMail;
        this.workplace = workplace;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String geteMail() {
        return eMail;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }
}
