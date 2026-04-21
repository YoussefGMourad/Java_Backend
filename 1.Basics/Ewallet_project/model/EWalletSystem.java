package model;

import java.util.ArrayList;
import java.util.List;

public class EWalletSystem {
    private final String walletname ="Eraa soft Wallet";
    private List<Account> accounts = new ArrayList<>();

    public String getWalletname() {
        return walletname;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}