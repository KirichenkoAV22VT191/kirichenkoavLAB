package tech.reliab.course.kirichenkoavlab.bank.service.impl;

import tech.reliab.course.kirichenkoavlab.bank.entity.CreditAccount;
import tech.reliab.course.kirichenkoavlab.bank.service.CreditAccountService;

public class CreditAccountServiceImpl implements CreditAccountService {
    private CreditAccount creditAccount = null;

    /**
     *
     * @return возвращает объект банка
     */
    @Override
    public CreditAccount getCreditAccount() {
        return creditAccount;
    }

    /**
     *
     * @param creditAccount - новый объект кредитного аккаунта
     */
    @Override
    public void setCreditAccount(CreditAccount creditAccount) {
        this.creditAccount = creditAccount;
    }

    /**
     *
     * @param creditAccount - кредитный аккаунт для обновления
     * @return возвращает true если был введен корректный кредитный аккаунт, иначе false
     */
    @Override
    public Boolean updateCreditAccount(CreditAccount creditAccount) {
        if (this.creditAccount == creditAccount){
            setCreditAccount(creditAccount);
            return true;
        } else{
            return false;
        }
    }

    /**
     *
     * @param creditAccount - кредитный аккаунт для удаления
     * @return возвращает true если был введен корректный кредитный аккаунт, иначе false
     */
    @Override
    public Boolean deleteCreditAccount(CreditAccount creditAccount) {
        if (this.creditAccount == creditAccount){
            this.creditAccount = null;
            return true;
        } else{
            return false;
        }
    }
}
