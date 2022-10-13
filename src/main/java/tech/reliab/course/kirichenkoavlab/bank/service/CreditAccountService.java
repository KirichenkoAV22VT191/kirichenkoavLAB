package tech.reliab.course.kirichenkoavlab.bank.service;

import tech.reliab.course.kirichenkoavlab.bank.entity.CreditAccount;

import java.util.function.BiPredicate;

public interface CreditAccountService {
    CreditAccount getCreditAccount();
    void setCreditAccount(CreditAccount creditAccount);
    Boolean updateCreditAccount(CreditAccount creditAccount);
    Boolean deleteCreditAccount(CreditAccount creditAccount);
}
