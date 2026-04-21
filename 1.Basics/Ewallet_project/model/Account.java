package model;

public class Account {
    private String username;
    private String password;
    private int age;
    private String phonenumber;
    private double balance;
    private boolean isAdmin;

    public Account( String username,String password,int age,String phonenumber,double balance,boolean isAdmin){
        this.username= username;
        this.password=password;
        this.age =age;
        this.phonenumber = phonenumber;
        this.balance = balance;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
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
        this.age = age;
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