package Graphics;

import People.Person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auth {
//    public boolean UniqueID(String ID) {
//        for (Person person : people) {
//            if (person.ID.equals(ID))
//                return false;
//        }
//        return true;
//    }
//
//    public boolean UniqueEmail(String email) {
//        for (Person person : people) {
//            if (person.email.equals(email))
//                return false;
//        }
//        return true;
//    }
//
//    public boolean UniqueUserName(String UserName) {
//        for (Person person : people) {
//            if (person.UserName.equals(UserName))
//                return false;
//        }
//        return true;
//    }
//
//    public boolean UniquePhoneNumber(String phoneNumber) {
//        for (Person person : people) {
//            if (person.phoneNumber.equals(phoneNumber))
//                return false;
//        }
//        return true;
//    }

    protected boolean isUserNameValid(String UserName) {
        String regex = "^[a-zA-Z0-9]{3,20}$";
        Pattern patten = Pattern.compile(regex);
        Matcher matcher = patten.matcher(UserName);
        boolean matchFound = matcher.find();
        if (matchFound) {
            return true;
        }
        return false;
    }

    protected boolean isPasswordValid(String pass) {
        String regex = "^[a-zA-Z0-9]{1,12}$";
        Pattern patten = Pattern.compile(regex);
        Matcher matcher = patten.matcher(pass);
        boolean matchFound = matcher.find();
        if (matchFound) {
            return true;
        }
        return false;
    }

    protected boolean isInputValid(String string) {
        String regex = "^[a-zA-Z]{1,18}$";
        Pattern patten = Pattern.compile(regex);
        Matcher matcher = patten.matcher(string);
        boolean matchFound = matcher.find();
        if (matchFound) {
            return true;
        }
        return false;
    }

    protected boolean isEmailValid(String email) {
        String regex = "^[a-zA-Z0-9.]{1,18}@[a-z0-9.]{1,8}(.)[a-z]{1,4}$";
        Pattern patten = Pattern.compile(regex);
        Matcher matcher = patten.matcher(email);
        boolean matchFound = matcher.find();
        if (matchFound) {
            return true;
        }
        return false;
    }

//    public abstract boolean isIDValid(String ID);

    protected boolean isPhoneNumberValid(String phone) {
        String regex = "^09[0-9]{9}$";
        Pattern patten = Pattern.compile(regex);
        Matcher matcher = patten.matcher(phone);
        boolean matchFound = matcher.find();
        if (matchFound) {
            return true;
        }
        return false;
    }
}
