package Authorizaztion;

import People.Person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static boolean isPasswordValid(String pass) {
        String regex = "^[a-zA-Z0-9]{1,12}$";
        Pattern patten = Pattern.compile(regex);
        Matcher matcher = patten.matcher(pass);
        boolean matchFound = matcher.find();
        if (matchFound) {
            return true;
        }
        return false;
    }

    public static boolean doPasswordAndRepeatMatch(String password, String repeat) {
        return password.compareTo(repeat) == 0;
    }

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
        String regex = "^09\\d{9}$";
        Pattern patten = Pattern.compile(regex);
        Matcher matcher = patten.matcher(phone);
        boolean matchFound = matcher.find();
        if (matchFound) {
            return true;
        }
        return false;
    }


    public static boolean[] isInfoValid(String username, String password, String repeatPassword, String email, String phoneNumber)  {
        //sw={phoneNumber,email,username,password}
        boolean[] invalid={false,false,false,false};

        if (!isPhoneNumberValid(phoneNumber)) {
            invalid[0]=true;
        }
        if (!isEmailValid(email)) {
            invalid[1]=true;
        }
        if (!isUserNameValid(username)) {
            invalid[2]=true;
        }
        if (!isPasswordValid(password)) {
            invalid[3]=true;
        }else {
            if (!doPasswordAndRepeatMatch(password, repeatPassword)) {
                invalid[3]=true;
            }
        }
        return invalid;

    }
}

