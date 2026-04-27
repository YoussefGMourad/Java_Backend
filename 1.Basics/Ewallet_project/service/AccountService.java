package service;

import model.Account;

public interface AccountService {
    Account createAccount(Account account);

    Account doesAccountExistWithUsernameAndPassword(Account account);

}
