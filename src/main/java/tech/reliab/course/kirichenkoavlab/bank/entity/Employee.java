package tech.reliab.course.kirichenkoavlab.bank.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Employee {
    private String id;
    private String fullName;
    private LocalDate birthday;
    private String jobTitle;
    private Boolean distanceWork;
    private String workPlace;
    private Boolean accessToCredit;
    private Integer salary;

    public Employee(String fullName, String birthday, String jobTitle, Boolean distanceWork, BankOffice workOffice,
                    Boolean accessToCredit, Integer salary) {
        this.id = UUID.randomUUID().toString();
        this.fullName = fullName;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        this.birthday = LocalDate.parse(birthday, formatter);
        this.jobTitle = jobTitle;
        this.distanceWork = distanceWork;
        this.workPlace = workOffice.getName();
        this.accessToCredit = accessToCredit;
        this.salary = salary;



    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Boolean getDistanceWork() {
        return distanceWork;
    }

    public void setDistanceWork(Boolean distanceWork) {
        this.distanceWork = distanceWork;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public Boolean getAccessToCredit() {
        return accessToCredit;
    }

    public void setAccessToCredit(Boolean accessToCredit) {
        this.accessToCredit = accessToCredit;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
