package service.Implementations;

import model.Account;
import model.EWalletSystem;
import service.AccountService;

import java.util.Optional;
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

    private Account findByUsername(String username) {
        return eWalletSystem.getAccounts()
                .stream()
                .filter(acc -> acc.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean transfer( Account from ,String toUsername ,double amount) {
        Account to = findByUsername(toUsername);

        if (to == null){ // account exist
            System.out.println("One of the accounts is not found ! ");
            return false;
        }
        if (from.getUsername().equals(to.getUsername())){ // can't send money to the same account
            System.out.println("You can't send money to the sender account! ");
            return false;
        }
        if(from.getBalance()<amount){  // amount !> balance
            System.out.println("No enough money to withdraw");
            return false;
        }

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
        return true;
    }

    @Override
    public boolean changePassword(Account account, String newPassword) {

        int index = IntStream.range(0,eWalletSystem.getAccounts().size())
                .filter(i ->{
                    Account acc = eWalletSystem.getAccounts().get(i);
                    return acc.getUsername().equals(account.getUsername())
                            && acc.getPassword().equals(account.getPassword());
                } ).findFirst()
                .orElse(-1);

        if (index == -1){
            System.out.println("Account not found ! ");
        }

        String Password =newPassword;
                eWalletSystem.getAccounts().get(index).setPassword(Password);

                return true;
    }

    @Override
    public boolean removeAccount(Account account) {
        int index = IntStream.range(0,eWalletSystem.getAccounts().size())
                .filter(i ->{
                    Account acc = eWalletSystem.getAccounts().get(i);
                    return acc.getUsername().equals(account.getUsername())
                            && acc.getPassword().equals(account.getPassword());
                } ).findFirst()
                .orElse(-1);

        if (index == -1){
            System.out.println("Account not found ! ");
        }

        eWalletSystem.getAccounts().remove(account);

        return true;
    }

}