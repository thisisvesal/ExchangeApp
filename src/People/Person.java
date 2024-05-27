package People;

import Properties.Wallet;

import java.util.ArrayList;

public class Person {
    // Auth info:
    protected  String username;
    protected String password;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    protected static ArrayList<Person> people = new ArrayList<>();
    protected Wallet wallet;

    public static ArrayList<Person> getPeople() {
        return people;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
