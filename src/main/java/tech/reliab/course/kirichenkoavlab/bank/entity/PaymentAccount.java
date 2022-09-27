package tech.reliab.course.kirichenkoavlab.bank.entity;

import java.util.UUID;

public class PaymentAccount {
    private String id;
    private User owner;
    private Bank bankWithCheck;
    private Integer sum;

    public PaymentAccount(User owner, Bank bankWithCheck, Integer sum){
        this.id = UUID.randomUUID().toString();
        this.owner = owner;
        this.bankWithCheck = bankWithCheck;
        this.sum = 0;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Bank getBankWithCheck() {
        return bankWithCheck;
    }

    public void setBankWithCheck(Bank bankWithCheck) {
        this.bankWithCheck = bankWithCheck;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }
}
