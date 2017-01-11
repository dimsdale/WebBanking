package ua.sdo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.sdo.model.accounts.Account;
import ua.sdo.model.accounts.enums.AccountStatus;

import java.util.Date;
import java.util.List;


public interface AccountRepository extends JpaRepository<Account, Integer> {

    @Query("select c from Account c where c.user.login = :login")
    List<Account> findByLogin(@Param("login") String login);

    @Modifying
    @Query("update Account a set a.sum = :money where a.id = :id")
    void updateSumAccount(@Param("sum") double sum, @Param("id") int id);

    @Modifying
    @Query("update Account a set a.date_of_close = :date_of_close, a.accountStatus = :accountStatus where a.id = :id")
    void closeAccount(@Param("date_of_close")Date date_of_close, @Param("accountStatus") AccountStatus accountStatus, @Param("id") int id);
}
