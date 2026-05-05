package service;

import model.Account;

public interface AccountService {

    Account createAccount(Account account);
    Account doesAccountExistWithUsernameAndPassword(Account account);

    boolean deposit(Account account, double amount);
    boolean withdraw(Account account, double amount);
    boolean transfer(Account senderAccount,String username, double amount);
    boolean changePassword(Account account, String newPassword);
    boolean removeAccount(Account account);
}
