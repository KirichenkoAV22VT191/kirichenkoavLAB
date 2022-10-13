package tech.reliab.course.kirichenkoavlab.bank.service;

import tech.reliab.course.kirichenkoavlab.bank.entity.BankAtm;
import tech.reliab.course.kirichenkoavlab.bank.entity.Employee;

public interface AtmService {
    BankAtm getAtm();
    void setAtm(BankAtm atm);
    Boolean updateAtm(BankAtm atm);
    Boolean deleteAtm(BankAtm atm);
    void updateIssuingMoneyStatus(BankAtm atm, Boolean status);
    void updateDepositMoneyStatus(BankAtm atm, Boolean status);
    void updateAtmStatus (BankAtm atm, Integer status);
    void updateMoneyInside(BankAtm atm, Integer moneyInside);
    void updateServiceEmployee(BankAtm atm, Employee serviceEmployee);

}
