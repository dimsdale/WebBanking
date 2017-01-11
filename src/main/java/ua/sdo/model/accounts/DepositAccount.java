package ua.sdo.model.accounts;

import ua.sdo.model.users.User;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("DepositAccount")
public class DepositAccount {


}
