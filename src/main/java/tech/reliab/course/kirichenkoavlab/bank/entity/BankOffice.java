package tech.reliab.course.kirichenkoavlab.bank.entity;

import java.util.UUID;

public class BankOffice {
    private String id;
    private String name;
    private String address;
    private Boolean status;
    private Boolean placement;
    private Integer atmCounter;
    private Boolean creditPossibility;
    private Boolean issuingMoney;
    private Boolean depositMoney;
    private Integer moneyInside;
    private Integer rentPrice;

    public BankOffice(String name, String address, Boolean status, Boolean placement,
                      Boolean creditPossibility, Boolean issuingMoney, Boolean depositMoney, Integer moneyInside,
                      Integer rentPrice, Bank bank){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
        this.status = status;
        this.placement = placement;
        this.atmCounter = 0;
        this.creditPossibility = creditPossibility;
        this.issuingMoney = issuingMoney;
        this.depositMoney = depositMoney;
        this.moneyInside = moneyInside;
        this.rentPrice = rentPrice;
        bank.officeCounter += 1;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getPlacement() {
        return placement;
    }

    public void setPlacement(Boolean placement) {
        this.placement = placement;
    }

    public Integer getAtmCounter() {
        return atmCounter;
    }

    public void setAtmCounter(Integer atmCounter) {
        this.atmCounter = atmCounter;
    }

    public Boolean getCreditPossibility() {
        return creditPossibility;
    }

    public void setCreditPossibility(Boolean creditPossibility) {
        this.creditPossibility = creditPossibility;
    }

    public Boolean getIssuingMoney() {
        return issuingMoney;
    }

    public void setIssuingMoney(Boolean issuingMoney) {
        this.issuingMoney = issuingMoney;
    }

    public Boolean getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(Boolean depositMoney) {
        this.depositMoney = depositMoney;
    }

    public Integer getMoneyInside() {
        return moneyInside;
    }

    public void setMoneyInside(Integer moneyInside) {
        this.moneyInside = moneyInside;
    }

    public Integer getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Integer rentPrice) {
        this.rentPrice = rentPrice;
    }
}
