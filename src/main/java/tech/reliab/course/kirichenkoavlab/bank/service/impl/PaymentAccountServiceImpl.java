package tech.reliab.course.kirichenkoavlab.bank.service.impl;

import tech.reliab.course.kirichenkoavlab.bank.entity.PaymentAccount;
import tech.reliab.course.kirichenkoavlab.bank.service.PaymentAccountService;

public class PaymentAccountServiceImpl implements PaymentAccountService {
    private PaymentAccount paymentAccount = null;

    /**
     *
     * @return возвращает платежный счет
     */
    @Override
    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    /**
     *
     * @param paymentAccount - новый объект платежного счета
     */
    @Override
    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    /**
     *
     * @param paymentAccount - объект платежного счета для обновления
     * @return возвращает true, если передан правильный объект платежного счета, иначе false
     */
    @Override
    public Boolean updatePaymentAccount(PaymentAccount paymentAccount) {
        if (this.paymentAccount == paymentAccount){
            setPaymentAccount(paymentAccount);
            return true;
        } else{
            return false;
        }
    }

    /**
     *
     * @param paymentAccount - объект платежного счета для удаления
     * @return возвращает true, если передан правильный объект платежного счета, иначе false
     */
    @Override
    public Boolean deletePaymentAccount(PaymentAccount paymentAccount) {
        if (this.paymentAccount == paymentAccount){
            this.paymentAccount = null;
            return true;
        } else{
            return false;
        }
    }
}
