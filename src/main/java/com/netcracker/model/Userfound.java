package com.netcracker.model;

import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;

public class Userfound {

    @NotNull
    @Size(min=2, max=30)
    private String secondNameFound;

    @NotNull
    @Size(min=2, max=30)
    private String firstNameFound;

    private String patronymic;

    private String age;

    private String salary;

    private String eMail;

    private String workplace;

    private String currentDate;

    private String userAgent;

    public Userfound() {}

    public void setEverything(String... args) {
        secondNameFound = args[0];
        firstNameFound = args[1];
        patronymic = args[2];
        age = args[3];
        salary = args[4];
        eMail = args[5];
        workplace = args[6];
    }


    public String getSecondNameFound() {
        return secondNameFound;
    }

    public String getFirstNameFound() {
        return firstNameFound;
    }

    public Userfound setSecondNameFound(String secondNameFound) {
        this.secondNameFound = secondNameFound;
        return this;
    }

    public Userfound setFirstNameFound(String firstNameFound) {
        this.firstNameFound = firstNameFound;
        return this;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Userfound setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Userfound setAge(String age) {
        this.age = age;
        return this;
    }

    public String getSalary() {
        return salary;
    }

    public Userfound setSalary(String salary) {
        this.salary = salary;
        return this;
    }

    public String geteMail() {
        return eMail;
    }

    public Userfound seteMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

    public String getWorkplace() {
        return workplace;
    }

    public Userfound setWorkplace(String workplace) {
        this.workplace = workplace;
        return this;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public Userfound setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
        return this;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public Userfound setUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }
}
