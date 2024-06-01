package Authorizaztion;

import People.Person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auth {
   private boolean uniqueUsername(String username) {
       for (Person person : Person.getPeople()) {
           if (person.getUsername().equals(username))
               return false;
       }
       return true;
   }

   private boolean uniqueEmail(String email) {
       for (Person person : Person.getPeople()) {
           if (person.getEmail().equals(email))
               return false;
       }
       return true;
   }

   private boolean uniquePhoneNumber(String phoneNumber) {
       for (Person person : Person.getPeople()) {
           if (person.getPhoneNumber().equals(phoneNumber))
               return false;
       }
       return true;
   }

    private boolean isUserNameValid(String UserName) {
        if (!uniqueUsername(UserName)) {
            return false;
        }
        String regex = "^[a-zA-Z0-9]{3,20}$";
        Pattern patten = Pattern.compile(regex);
        Matcher matcher = patten.matcher(UserName);
        boolean matchFound = matcher.find();
        if (matchFound) {
            return true;
        }
        return false;
    }

    private boolean isPasswordValid(String pass) {
        String regex = "^[a-zA-Z0-9]{1,12}$";
        Pattern patten = Pattern.compile(regex);
        Matcher matcher = patten.matcher(pass);
        boolean matchFound = matcher.find();
        if (matchFound) {
            return true;
        }
        return false;
    }

    
    // TODO: What is this for
    // private boolean isInputValid(String string) {
    //     String regex = "^[a-zA-Z]{1,18}$";
    //     Pattern patten = Pattern.compile(regex);
    //     Matcher matcher = patten.matcher(string);
    //     boolean matchFound = matcher.find();
    //     if (matchFound) {
    //         return true;
    //     }
    //     return false;
    // }

    private boolean isEmailValid(String email) {
        if (!uniqueEmail(email)) {
            return false;
        }
        String regex = "^[a-zA-Z0-9.]{1,18}@[a-z0-9.]{1,8}(.)[a-z]{1,4}$";
        Pattern patten = Pattern.compile(regex);
        Matcher matcher = patten.matcher(email);
        boolean matchFound = matcher.find();
        if (matchFound) {
            return true;
        }
        return false;
    }

//    public abstract boolean isgetUsername()ValgetUsername()(String getUsername());

    private boolean isPhoneNumberValid(String phone) {
        if (!uniquePhoneNumber(phone)) {
            return false;
        }
        String regex = "^09[0-9]{9}$";
        Pattern patten = Pattern.compile(regex);
        Matcher matcher = patten.matcher(phone);
        boolean matchFound = matcher.find();
        if (matchFound) {
            return true;
        }
        return false;
    }

    public boolean isInfoValid(String username, String password, String email, String phoneNumber) {
        if (!isUserNameValid(username)) {
            return false;
        }
        if (!isPasswordValid(password)) {
            return false;
        }
        if (!isEmailValid(email)) {
            return false;
        }
        if (!isPhoneNumberValid(phoneNumber)) {
            return false;
        }

        return true;
    }
}
