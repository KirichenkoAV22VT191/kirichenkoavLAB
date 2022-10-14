package tech.reliab.course.kirichenkoavlab.bank.entity;

import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class BankAtm {
    private String id;
    private String name;
    private String address;
    private Integer status;
    private Bank bankOwner;
    private BankOffice atmLocation;
    private Employee serviceEmployee;
    private Boolean issuingMoney;
    private Boolean depositMoney;
    private Integer moneyInside;
    private Integer serviceCost;

    /**
     *
     * @param name - название банкомата
     * @param atmLocation - местоположение банкомата
     * @param status - статус банкомата (-1 - нет денег, 0 - не работает, 1 - работает)
     * @param bankOwner - банк, которому принадлежит банкомат
     * @param serviceEmployee - сотрудник, который обслуживает банкомат
     * @param issuingMoney - работает ли на выдачу денег (false - нет, true - да)
     * @param depositMoney - можно ли внести деньги (false - нет, true - да)
     * @param serviceCost - стоимость обслуживания банкомата
     * @param moneyInside - кол-во денег в банкомате
     */
    public BankAtm (String name, BankOffice atmLocation, Integer status, Bank bankOwner, Employee serviceEmployee,
                    Boolean issuingMoney, Boolean depositMoney, Integer serviceCost, Integer moneyInside){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.atmLocation = atmLocation;
        this.status = status;
        this.bankOwner = bankOwner;
        this.address = atmLocation.getAddress();
        this.serviceEmployee = serviceEmployee;
        this.moneyInside = moneyInside;
        this.issuingMoney = issuingMoney;
        this.depositMoney = depositMoney;
        this.serviceCost = serviceCost;
        bankOwner.atmCounter += 1;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Bank getBankOwner() {
        return bankOwner;
    }

    public void setBankOwner(Bank bankOwner) {
        this.bankOwner = bankOwner;
    }

    public BankOffice getAtmLocation() {
        return atmLocation;
    }

    public void setAtmLocation(BankOffice atmLocation) {
        this.atmLocation = atmLocation;
    }

    public Employee getServiceEmployee() {
        return serviceEmployee;
    }

    public void setServiceEmployee(Employee serviceEmployee) {
        this.serviceEmployee = serviceEmployee;
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

    public Integer getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Integer serviceCost) {
        this.serviceCost = serviceCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankAtm bankAtm = (BankAtm) o;

        if (!Objects.equals(id, bankAtm.id)) return false;
        return Objects.equals(name, bankAtm.name);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BankAtm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", bankOwner=" + bankOwner +
                ", atmLocation=" + atmLocation +
                ", serviceEmployee=" + serviceEmployee +
                ", issuingMoney=" + issuingMoney +
                ", depositMoney=" + depositMoney +
                ", moneyInside=" + moneyInside +
                ", serviceCost=" + serviceCost +
                '}';
    }
}
