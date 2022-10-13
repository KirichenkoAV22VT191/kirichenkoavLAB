package tech.reliab.course.kirichenkoavlab.bank.entity;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.UUID;

public class CreditAccount {
    private String id;
    private User accountHolder;
    private String bankName;
    private LocalDate startDate;
    private LocalDate stopDate;
    private Integer duration;
    private Integer sum;
    private Float monthlyPayment;
    private Float interestRate;
    private Employee employee;
    private PaymentAccount paymentAccount;

    public CreditAccount(User accountHolder, Bank bank, String startDate, String stopDate,
                         Integer sum, Float monthlyPayment, Employee employee,
                         PaymentAccount paymentAccount){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        this.id = UUID.randomUUID().toString();
        this.accountHolder = accountHolder;
        this.bankName = bank.getName();
        this.startDate = LocalDate.parse(startDate, formatter);
        this.stopDate = LocalDate.parse(stopDate, formatter);
        Period period = Period.between(this.startDate, this.stopDate);
        this.duration = period.getMonths();
        this.sum = sum;
        this.monthlyPayment = monthlyPayment;
        this.interestRate = bank.getInterestRate();
        this.employee = employee;
        this.paymentAccount = paymentAccount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(User accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getStopDate() {
        return stopDate;
    }

    public void setStopDate(LocalDate stopDate) {
        this.stopDate = stopDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Float getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(Float monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditAccount that = (CreditAccount) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(accountHolder, that.accountHolder))
            return false;
        return Objects.equals(bankName, that.bankName);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (accountHolder != null ? accountHolder.hashCode() : 0);
        result = 31 * result + (bankName != null ? bankName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "id='" + id + '\'' +
                ", accountHolder=" + accountHolder +
                ", bankName='" + bankName + '\'' +
                ", startDate=" + startDate +
                ", stopDate=" + stopDate +
                ", duration=" + duration +
                ", sum=" + sum +
                ", monthlyPayment=" + monthlyPayment +
                ", interestRate=" + interestRate +
                ", employee=" + employee +
                ", paymentAccount=" + paymentAccount +
                '}';
    }
}
