package tech.reliab.course.kirichenkoavlab.bank.service;

import tech.reliab.course.kirichenkoavlab.bank.entity.BankOffice;

public interface BankOfficeService {
    BankOffice getBankOffice();

    void setBankOffice(BankOffice bankOffice);

    boolean updateBankOffice(BankOffice bankOffice);
    boolean deleteBankOffice(BankOffice bankOffice);
}
