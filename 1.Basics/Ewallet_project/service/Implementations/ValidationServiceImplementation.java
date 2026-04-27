package service.Implementations;
import service.ValidationService;

public class ValidationServiceImplementation implements ValidationService {
    @Override
    public boolean isUsernameValid(String username) {
        if (username.isBlank()) {
            return false;
        }
        if (username.length() < 3) {
            return false;
        }
        if (!Character.isUpperCase(username.charAt(0))) {
            return false;
        }
        for (char c : username.toCharArray()) {
            if (Character.isDigit(c)) {
                return false; // can't contain digits
            }
        }
        return true;
    }
    @Override
    public boolean isAgeValid(int age) {
        return age >= 18 && age <= 100;

    }

    @Override
    public boolean isPasswordValid(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        if (password.isBlank()) {
            return false;
        }
        if (password.length()<8) {
            return false;
        }
        if (Character.isDigit(password.charAt(0))){
            return false; // can't start with a number
        }

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isDigit(c))     hasDigit = true;
        }

        return hasUpper && hasLower && hasDigit;
    }


    @Override
    public boolean isPhonenumberValid(String phonenumber) {
      if (phonenumber.length()!=11){
          return false;
      }
      if (!phonenumber.startsWith("01")){
          return false;
      }
      char secondChar = phonenumber.charAt(1);
        if (secondChar != '0' && secondChar != '1' && secondChar != '2' &&secondChar != '5' ){
            return false;
        }
        for (char c: phonenumber.toCharArray()){
            if (!Character.isDigit(c)){
                return false;
            };
        }
        return true;
    }
}