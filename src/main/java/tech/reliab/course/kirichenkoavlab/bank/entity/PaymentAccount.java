package tech.reliab.course.kirichenkoavlab.bank.entity;

import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaymentAccount that = (PaymentAccount) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "PaymentAccount{" +
                "id='" + id + '\'' +
                ", owner=" + owner +
                ", bankWithCheck=" + bankWithCheck +
                ", sum=" + sum +
                '}';
    }
}
