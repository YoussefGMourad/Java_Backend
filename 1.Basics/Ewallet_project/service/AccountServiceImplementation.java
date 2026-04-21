package service;

import model.Account;
import model.EWalletSystem;

public class AccountServiceImplementation implements AccountService {

    private EWalletSystem eWalletSystem = new EWalletSystem();

    @Override
    public boolean createAccount(Account account) {

        boolean doesAccountExist = eWalletSystem.getAccounts().stream().anyMatch(acc -> acc.getUsername().equals(account.getUsername()));

        // need to ask a question here --> Youssef!

        if (doesAccountExist){
            return false;
        }

        eWalletSystem.getAccounts().add(account);
        return true;
    }
}