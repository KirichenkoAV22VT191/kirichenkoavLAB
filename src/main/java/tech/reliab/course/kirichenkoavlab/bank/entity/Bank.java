package tech.reliab.course.kirichenkoavlab.bank.entity;

import java.util.Random;
import java.util.UUID;

public class Bank {
    private String id;
    private String name;
    protected Integer officeCounter;
    protected Integer atmCounter;
    protected Integer employeeCounter;
    protected Integer clientCounter;
    private Integer rating;
    private Integer totalMoney;
    private Float interestRate;

    private Integer calculateInterestRateCoeff(Integer raiting){
        double k = 0;
        if (rating == 0){
            k = 20;
        }
        else {
            k = Math.floor((float)20/(float)rating);
        }
        return (int)k;
    }

    public Bank(String name){
        Random random = new Random();
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.officeCounter = 0;
        this.atmCounter = 0;
        this.employeeCounter = 0;
        this.clientCounter = 0;

        this.rating = random.nextInt(100);
        this.totalMoney = random.nextInt(1_000_000);


        this.interestRate = random.nextFloat(calculateInterestRateCoeff(rating), 20);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOfficeCounter() {
        return officeCounter;
    }

    public void setOfficeCounter(Integer officeCounter) {
        this.officeCounter = officeCounter;
    }

    public Integer getAtmCounter() {
        return atmCounter;
    }

    public void setAtmCounter(Integer atmCounter) {
        this.atmCounter = atmCounter;
    }

    public Integer getEmployeeCounter() {
        return employeeCounter;
    }

    public void setEmployeeCounter(Integer employeeCounter) {
        this.employeeCounter = employeeCounter;
    }

    public Integer getClientCounter() {
        return clientCounter;
    }

    public void setClientCounter(Integer clientCounter) {
        this.clientCounter = clientCounter;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Integer totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }
}
