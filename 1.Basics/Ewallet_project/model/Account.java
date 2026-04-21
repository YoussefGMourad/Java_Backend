package model;

import java.util.InputMismatchException;

public class Account {
    private String username;
    private String password;
    private float age;
    private String phonenumber;
    private double balance;
    private boolean isAdmin;

    public Account(String username, String password, float age, String phonenumber) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.phonenumber = phonenumber;
        this.balance = 0;
        this.isAdmin = false;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public float getAge() {
        return age;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        if (age < 18) {

            throw new InputMismatchException("You must be older than 17 years ");

        } else {
            this.age = age;

        }
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}