package tech.reliab.course.kirichenkoavlab.bank.service;

import tech.reliab.course.kirichenkoavlab.bank.entity.PaymentAccount;

public interface PaymentAccountService {
    PaymentAccount getPaymentAccount();
    void setPaymentAccount(PaymentAccount paymentAccount);
    Boolean updatePaymentAccount(PaymentAccount paymentAccount);
    Boolean deletePaymentAccount(PaymentAccount paymentAccount);
}
