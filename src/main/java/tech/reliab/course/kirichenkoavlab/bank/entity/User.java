package tech.reliab.course.kirichenkoavlab.bank.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class User {
    private String id;
    private String fullName;
    private LocalDate birthday;
    private String jobPlace;
    private Integer salary;
    private String banks;
    private String creditCheck;
    private String payCheck;
    private Integer creditRate;

    private Integer searchCreditRate(Integer salary){
        if (salary < 1000)
            return 100;
        else if (salary > 1000 && salary < 2000)
            return 200;
        else if (salary > 2000 && salary < 3000)
            return 300;
        else if (salary > 3000 && salary < 4000)
            return 400;
        else if (salary > 4000 && salary < 5000)
            return 500;
        else if (salary > 5000 && salary < 6000)
            return 600;
        else if (salary > 6000 && salary < 7000)
            return 700;
        else if (salary > 7000 && salary < 8000)
            return 800;
        else if (salary > 8000 && salary < 9000)
            return 900;
        else if (salary > 9000 && salary < 10000)
            return 1000;

        return -1;
    }
    public User(String fullName, String birthday, String jobPlace, String  banks,
                String creditCheck, String payCheck, Bank bank){
        this.id = UUID.randomUUID().toString();
        Random random = new Random();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        this.birthday = LocalDate.parse(birthday, formatter);
        this.fullName = fullName;
        this.jobPlace = jobPlace;
        this.salary = random.nextInt(10000);
        this.banks = banks;
        this.creditCheck = creditCheck;
        this.payCheck = payCheck;
        this.creditRate = searchCreditRate(this.salary);
        bank.clientCounter += 1;


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

    public String getJobPlace() {
        return jobPlace;
    }

    public void setJobPlace(String jobPlace) {
        this.jobPlace = jobPlace;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getBanks() {
        return banks;
    }

    public void setBanks(String banks) {
        this.banks = banks;
    }

    public String getCreditCheck() {
        return creditCheck;
    }

    public void setCreditCheck(String creditCheck) {
        this.creditCheck = creditCheck;
    }

    public String getPayCheck() {
        return payCheck;
    }

    public void setPayCheck(String payCheck) {
        this.payCheck = payCheck;
    }

    public Integer getCreditRate() {
        return creditRate;
    }

    public void setCreditRate(Integer creditRate) {
        this.creditRate = creditRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!Objects.equals(id, user.id)) return false;
        return Objects.equals(fullName, user.fullName);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", jobPlace='" + jobPlace + '\'' +
                ", salary=" + salary +
                ", banks='" + banks + '\'' +
                ", creditCheck='" + creditCheck + '\'' +
                ", payCheck='" + payCheck + '\'' +
                ", creditRate=" + creditRate +
                '}';
    }
}
