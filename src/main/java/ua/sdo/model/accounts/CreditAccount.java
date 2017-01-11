package ua.sdo.model.accounts;

import ua.sdo.model.CreditPayment;

import javax.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue("CreditAccount")
public class CreditAccount extends Account {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
    private Set<CreditPayment> creditPayments;

    @Column(name = "percentage", nullable = false)
    private int percentage;
}
