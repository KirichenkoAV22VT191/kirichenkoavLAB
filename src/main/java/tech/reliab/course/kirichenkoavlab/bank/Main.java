package tech.reliab.course.kirichenkoavlab.bank;

import tech.reliab.course.kirichenkoavlab.bank.entity.*;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Bank 1");

        BankOffice bankOffice = new BankOffice(
                "bank 1",
                "1, Belgorod, Chentr 13",
                true,
                true,
                true,
                true,
                true,
                10_000,
                100_000,
                bank


        );

        Employee employee = new Employee(
                "Vasiliev Vasilii Vasilievich",
                "11.06.2001",
                "job",
                true,
                bankOffice,
                true,
                10
        );

        BankAtm bankAtm = new BankAtm(
                "bnakomat 1",
                bankOffice,
                1,
                bank,
                employee,
                true,
                true,
                20,
                100
        );

        User user = new User(
                "VALEEERAA VALEEERAAA VALEEERAA",
                "11.01.1953",
                "OXPAHIK",
                "BANGS",
                "CHEKAAAAI",
                "PLAAAATIIIIII",
                bank
        );

        PaymentAccount paymentAccount = new PaymentAccount(
                user,
                bank,
                1_000
        );

        CreditAccount creditAccount = new CreditAccount(
                user,
                bank,
                "14.10.2022",
                "17.10.2022",
                100_000,
                (float)50_000,
                employee,
                paymentAccount
        );


        System.out.println(bank + "\n");
        System.out.println(bankAtm + "\n");
        System.out.println(bankOffice + "\n");
        System.out.println(creditAccount + "\n");
        System.out.println(employee + "\n");
        System.out.println(paymentAccount + "\n");
        System.out.println(user + "\n");
    }
}
