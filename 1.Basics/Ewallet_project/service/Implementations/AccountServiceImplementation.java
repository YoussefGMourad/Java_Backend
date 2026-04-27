package service.Implementations;

import model.Account;
import model.EWalletSystem;
import service.AccountService;

import java.util.Optional;
import java.util.stream.Collectors;

public class AccountServiceImplementation implements AccountService {

    private EWalletSystem eWalletSystem = new EWalletSystem();

    @Override
    public Account createAccount(Account account) {
        /*
        this method checks is the account exist or no in the signup process
        Depends on Username only
        */
        Optional<Account> accountOptional = eWalletSystem.getAccounts()
                .stream()
                .filter(acc -> acc.getUsername()
                        .equals(account.getUsername()))
                .findFirst();
        // need to ask a question here --> Youssef!!!!!

        if (accountOptional.isPresent()) {
            return null;
        }

        eWalletSystem.getAccounts().add(account);
        return account;
    }


    @Override
    public Account doesAccountExistWithUsernameAndPassword(Account account) {

        /*
        this method checks is the account exist or no in the login process
        Depends on username and password
        */

        return eWalletSystem.getAccounts().stream()
                .filter(acc -> acc.getUsername().equals(account.getUsername()) &&
                        acc.getPassword().equals(account.getPassword())).findFirst().orElse(null);
    }

}