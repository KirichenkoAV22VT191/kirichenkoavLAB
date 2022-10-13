package tech.reliab.course.kirichenkoavlab.bank.service.impl;

import tech.reliab.course.kirichenkoavlab.bank.entity.BankOffice;
import tech.reliab.course.kirichenkoavlab.bank.service.BankOfficeService;
import tech.reliab.course.kirichenkoavlab.bank.service.BankService;

public class BankOfficeServiceImpl implements BankOfficeService {
    private BankOffice bankOffice = null;
    @Override
    public BankOffice getBankOffice() {
        return bankOffice;
    }

    @Override
    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }

    @Override
    public boolean updateBankOffice(BankOffice bankOffice) {
        if (this.bankOffice == bankOffice){
            setBankOffice(bankOffice);
            return true;
        } else{
            return false;
        }
    }

    @Override
    public boolean deleteBankOffice(BankOffice bankOffice) {
        if (this.bankOffice == bankOffice){
            this.bankOffice = null;
            return true;
        } else{
            return false;
        }
    }
}
