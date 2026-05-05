package service.Implementations;

import model.Account;
import model.EWalletSystem;
import service.AccountService;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    @Override
    public boolean deposit(Account account, double amount) {

       int index = IntStream.range(0,eWalletSystem.getAccounts().size())
               .filter(i ->{
                   Account acc = eWalletSystem.getAccounts().get(i);
                   return acc.getUsername().equals(account.getUsername())
                           && acc.getPassword().equals(account.getPassword());
               } ).findFirst().orElse(-1);

        if (index == -1){
            return false;
        }
        if(amount<100){
            System.out.println("Minimum amount to deposit is 100 EGP");
            return false;
        }
        double totalBalance  = eWalletSystem.getAccounts().get(index).getBalance()+ amount;
        eWalletSystem.getAccounts().get(index).setBalance(totalBalance);
            return true;
    }

    @Override
    public boolean withdraw(Account account, double amount) {
        int index = IntStream.range(0,eWalletSystem.getAccounts().size())
                .filter(i ->{
                    Account acc = eWalletSystem.getAccounts().get(i);
                    return acc.getUsername().equals(account.getUsername())
                            && acc.getPassword().equals(account.getPassword());
                } ).findFirst().orElse(-1);

        if (index == -1){
            return false;
        }
        if(amount>account.getBalance()){
            System.out.println("No enough money to withdraw");
            return false;
        }
        double totalBalance  = eWalletSystem.getAccounts().get(index).getBalance() - amount;
        eWalletSystem.getAccounts().get(index).setBalance(totalBalance);
        return true;
    }

    @Override
    public boolean transfer(Account from, String toUsername, double amount) {
        return false;
    }

    @Override
    public void changePassword(Account account, String newPassword) {
        boolean doesAccountExist = eWalletSystem.getAccounts().stream()
                .anyMatch(acc -> acc.getUsername().equals(account.getUsername()) &&
                        acc.getPassword().equals(account.getPassword()));
        if (doesAccountExist){

        }
    }

    @Override
    public boolean removeAccount(Account account) {
        boolean doesAccountExist = eWalletSystem.getAccounts().stream()
                .anyMatch(acc -> acc.getUsername().equals(account.getUsername()) &&
                        acc.getPassword().equals(account.getPassword()));
        if (doesAccountExist){

        }
        return false;
    }

}