package Authorizaztion;

import People.Person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Exceptions.InvalidEmailException;
import Exceptions.InvalidInfoException;
import Exceptions.InvalidPasswordException;
import Exceptions.InvalidPhoneNumberException;
import Exceptions.InvalidUsernameException;

public class Auth {
   private static boolean uniqueUsername(String username) {
       for (Person person : Person.getPeople()) {
           if (person.getUsername().equals(username))
               return false;
       }
       return true;
   }

   private static boolean uniqueEmail(String email) {
       for (Person person : Person.getPeople()) {
           if (person.getEmail().equals(email))
               return false;
       }
       return true;
   }

   private static boolean uniquePhoneNumber(String phoneNumber) {
       for (Person person : Person.getPeople()) {
           if (person.getPhoneNumber().equals(phoneNumber))
               return false;
       }
       return true;
   }

    private static boolean isUserNameValid(String UserName) {
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

    private static boolean isPasswordValid(String pass) {
        String regex = "^[a-zA-Z0-9]{1,12}$";
        Pattern patten = Pattern.compile(regex);
        Matcher matcher = patten.matcher(pass);
        boolean matchFound = matcher.find();
        if (matchFound) {
            return true;
        }
        return false;
    }

    private static boolean doPasswordAndRepeatMatch(String password, String repeat) {
        if (password.compareTo(repeat) == 0) {
            return true;
        }
        return false;
    }

    
    // TODO: What is this for
    // private static boolean isInputValid(String string) {
    //     String regex = "^[a-zA-Z]{1,18}$";
    //     Pattern patten = Pattern.compile(regex);
    //     Matcher matcher = patten.matcher(string);
    //     boolean matchFound = matcher.find();
    //     if (matchFound) {
    //         return true;
    //     }
    //     return false;
    // }

    private static boolean isEmailValid(String email) {
        if (!uniqueEmail(email)) {
            return false;
        }
        String regex = "^[a-zA-Z0-9.]{1,30}@[a-z0-9.]{1,8}(.)[a-z]{1,4}$";
        Pattern patten = Pattern.compile(regex);
        Matcher matcher = patten.matcher(email);
        boolean matchFound = matcher.find();
        if (matchFound) {
            return true;
        }
        return false;
    }

    private static boolean isPhoneNumberValid(String phone) {
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

    // Weird design here.
    // I don't know if using exceptions to determine the type of invalid info is a good idea at all
    public static boolean isInfoValid(String username, String password, String repeatPassword, String email, String phoneNumber) throws InvalidInfoException {
        if (!isPhoneNumberValid(phoneNumber)) {
            throw new InvalidPhoneNumberException();
        }
        if (!isEmailValid(email)) {
            throw new InvalidEmailException();
        }
        if (!isUserNameValid(username)) {
            throw new InvalidUsernameException();
        }
        if (!isPasswordValid(password)) {
            throw new InvalidPasswordException();
        }
        if (!doPasswordAndRepeatMatch(password, repeatPassword)) {
            throw new InvalidPasswordException();
        }

        return true;
    }
}
