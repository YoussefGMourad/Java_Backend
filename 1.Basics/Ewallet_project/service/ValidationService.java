package service;

public interface ValidationService {
    boolean isUsernameValid (String username);
    boolean isPasswordValid (String password);
    boolean isAgeValid (int age);
    boolean isPhonenumberValid (String phonenumber);
}
