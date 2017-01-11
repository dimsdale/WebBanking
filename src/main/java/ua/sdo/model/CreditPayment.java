package ua.sdo.model;

import ua.sdo.model.accounts.Account;

import javax.persistence.*;

@Entity
@Table(name = "credit_payments")
public class CreditPayment {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
