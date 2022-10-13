package tech.reliab.course.kirichenkoavlab.bank.service;

import tech.reliab.course.kirichenkoavlab.bank.entity.Bank;

public interface BankService {
    Bank getBank();
    void setBank(Bank bank);
    Boolean updateBank(Bank bank);
    Boolean deleteBank(Bank bank);

    public void addAtm(Bank bank);
    public void addOffice(Bank bank);
    public void addEmployee(Bank bank);
    public void addClient(Bank bank);
    public void deleteAtm(Bank bank);
    public void deleteOffice(Bank bank);
    public void deleteEmployee(Bank bank);
    public void deleteClient(Bank bank);
}
