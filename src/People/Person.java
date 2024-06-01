package People;

import Properties.Wallet;

import java.util.ArrayList;

import Exceptions.UserNotFoundException;

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

    private static boolean personExists(String username, String password) {
        for (Person person : people) {
            if (person.password.equals(password) && person.username.equals(username)) {
                return true;
            }
        }

        return false;
    }

    public static Person findPerson(String username, String password) throws UserNotFoundException {
        if(people == null) throw new Exceptions.UserNotFoundException();
        for (Person person : people) {
            if (person.password.equals(password) && person.username.equals(username)) {
                return person;
            }
        }
        throw new Exceptions.UserNotFoundException();
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

    public static void addPerson(Person person) {
        people.add(person);
    }

}
