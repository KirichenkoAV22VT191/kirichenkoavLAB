package tech.reliab.course.kirichenkoavlab.bank.service.impl;

import tech.reliab.course.kirichenkoavlab.bank.entity.Bank;
import tech.reliab.course.kirichenkoavlab.bank.service.BankService;

final public class BankServiceImpl implements BankService {
    private Bank bank = null;

    /**
     *
     * @return возвращает объект банка
     */
    @Override
    public Bank getBank() {
        return bank;
    }

    /**
     *
     * @param bank - новый объект банка
     */
    @Override
    public void setBank(Bank bank) {
            this.bank = bank;
    }

    /**
     *
     * @param bank - банк для обновления
     * @return возвращает true, если передан правильный объект банка, иначе false
     */
    @Override
    public Boolean updateBank(Bank bank) {
        if (this.bank == bank){
            setBank(bank);
            return true;
        } else{
            return false;
        }
    }

    /**
     *
     * @param bank - банк для удаления
     * @return возвращает true, если передан правильный объект банка, иначе false
     */

    @Override
    public Boolean deleteBank(Bank bank) {
        if (this.bank == bank){
            this.bank = null;
            return true;
        } else{
            return false;
        }
    }

    @Override
    public void addAtm(Bank bank) {
        var bankAtmCount = bank.getAtmCounter();
        bank.setAtmCounter(bankAtmCount++);
        this.updateBank(bank);
    }

    @Override
    public void addOffice(Bank bank) {
        var bankOfficeCounter = bank.getOfficeCounter();
        bank.setOfficeCounter(bankOfficeCounter++);
        this.updateBank(bank);
    }

    @Override
    public void addEmployee(Bank bank) {
        var bankEmployeeCounter = bank.getEmployeeCounter();
        bank.setEmployeeCounter(bankEmployeeCounter++);
        this.updateBank(bank);
    }

    @Override
    public void addClient(Bank bank) {
        var bankClientCounter = bank.getClientCounter();
        bank.setClientCounter(bankClientCounter++);
        this.updateBank(bank);
    }

    @Override
    public void deleteAtm(Bank bank) {
        var bankAtmCount = bank.getAtmCounter();
        bank.setAtmCounter(bankAtmCount--);
        this.updateBank(bank);
    }

    @Override
    public void deleteOffice(Bank bank) {
        var bankOfficeCounter = bank.getOfficeCounter();
        bank.setOfficeCounter(bankOfficeCounter--);
        this.updateBank(bank);
    }

    @Override
    public void deleteEmployee(Bank bank) {
        var bankEmployeeCounter = bank.getEmployeeCounter();
        bank.setEmployeeCounter(bankEmployeeCounter--);
        this.updateBank(bank);
    }

    @Override
    public void deleteClient(Bank bank) {
        var bankClientCounter = bank.getClientCounter();
        bank.setClientCounter(bankClientCounter--);
        this.updateBank(bank);
    }
}
