package tech.reliab.course.kirichenkoavlab.bank.service.impl;

import tech.reliab.course.kirichenkoavlab.bank.entity.BankAtm;
import tech.reliab.course.kirichenkoavlab.bank.entity.Employee;
import tech.reliab.course.kirichenkoavlab.bank.service.AtmService;

public class AtmServiceImpl implements AtmService {
    private BankAtm atm = null;

    /**
     *
     * @return возвращает объект банкомата
     */
    @Override
    public BankAtm getAtm() {
        return atm;
    }

    /**
     *
     * @param atm - объект банкомата
     */
    @Override
    public void setAtm(BankAtm atm) {
        this.atm = atm;
    }

    /**
     *
     * @param atm - объект банкомата для обновления
     * @return true если был введен корректный объект банкомата, иначе false
     */
    @Override
    public Boolean updateAtm(BankAtm atm) {
        if (this.atm == atm){
            setAtm(atm);
            return true;
        } else{
            return false;
        }
    }

    /**
     *
     * @param atm - объект банкомата для удаления
     * @return true если был введен корректный объект банкомата, иначе false
     */
    @Override
    public Boolean deleteAtm(BankAtm atm) {
        if (this.atm == atm){
            this.atm = null;
            return true;
        } else{
            return false;
        }
    }

    /**
     *
     * @param atm - банкомат, в котором необходимо обновить статус
     * @param status - статус операции по выдаче денег
     */
    @Override
    public void updateIssuingMoneyStatus(BankAtm atm, Boolean status) {
        atm.setIssuingMoney(status);
    }

    /**
     *
     * @param atm - банкомат, в котором необходимо обновить статус
     * @param status - статус операции по внесению наличных
     */
    @Override
    public void updateDepositMoneyStatus(BankAtm atm, Boolean status) {
        atm.setDepositMoney(status);
    }

    /**
     *
     * @param atm - банкомат, в котором необходимо обновить статус
     * @param status - состояние банкомата
     */
    @Override
    public void updateAtmStatus(BankAtm atm, Integer status) {
        atm.setStatus(status);
    }

    /**
     *
     * @param atm - банкомат, в котором необходимо проверить наличие денег
     * @param moneyInside - кол-во денег в банкомате
     */
    @Override
    public void updateMoneyInside(BankAtm atm, Integer moneyInside) {
        atm.setMoneyInside(moneyInside);
    }

    /**
     *
     * @param atm - банкомат, в котором необходимо обновить обслуживающего рабочего
     * @param serviceEmployee - работник, который будет обслуживать банкомат
     */
    @Override
    public void updateServiceEmployee(BankAtm atm, Employee serviceEmployee) {
        atm.setServiceEmployee(serviceEmployee);
    }
}
