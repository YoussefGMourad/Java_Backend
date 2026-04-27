package service.Implementations;

import model.Account;
import model.EWalletSystem;
import service.AccountService;

public class AccountServiceImplementation implements AccountService {

    private EWalletSystem eWalletSystem = new EWalletSystem();

    @Override
    public boolean createAccount(Account account) {
        /*
        this method checks is the account exist or no in the signup process
        Depends on Username only
        */
        boolean doesAccountExist = eWalletSystem.getAccounts().stream().anyMatch(acc -> acc.getUsername().equals(account.getUsername()));

        // need to ask a question here --> Youssef!

        if (doesAccountExist){
            return false;
        }

        eWalletSystem.getAccounts().add(account);
        return true;
    }


    @Override
    public boolean doesAccountExistWithUsernameAndPassword(Account account) {

        /*
        this method checks is the account exist or no in the login process
        Depends on username and password
        */

        boolean doesAccountExist = eWalletSystem.getAccounts().stream().anyMatch(acc -> acc.getUsername().equals(account.getUsername()) &&  acc.getPassword().equals(account.getPassword()));

        if (doesAccountExist){
            return true;
        }
        return false;
    }
}