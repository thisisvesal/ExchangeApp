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
    protected Wallet wallet = new Wallet();
    private static Person current;
    // TODO: Implement the methods needed for current person, keep access modifiers as private as possible

    protected Person() {
        
    }

    public Person(String username, String password, String firstName, String lastName, String email, String phoneNumber) {
        setUsername(username);
        setPassword(password);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        addPerson(this);
    }

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
    public static Person findPersonNoPassword(String username, String email) throws UserNotFoundException {
        if(people == null) throw new Exceptions.UserNotFoundException();
        for (Person person : people) {
            if (person.username.equals(username)) {
                if (person.email.equals(email)){
                    return person;
                }
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private static void addPerson(Person person) {
        people.add(person);
    }

    // This is used to keep track of app users
    public static void setCurrentPerson(Person current) {
        Person.current = current;
    }

    public static Person getCurrentPerson() {
        return current;
    }

}
