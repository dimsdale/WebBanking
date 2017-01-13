package ua.sdo.model.accounts;

import ua.sdo.model.CreditPayment;

import javax.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue("CreditAccount")
public class CreditAccount extends Account {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
    private Set<CreditPayment> creditPayments;

    public CreditAccount() {
        this.percentage = 7;
    }

    public Set<CreditPayment> getCreditPayments() {
        return creditPayments;
    }

    public void setCreditPayments(Set<CreditPayment> creditPayments) {
        this.creditPayments = creditPayments;
    }

}
