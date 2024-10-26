package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class Person {
    private String firstName ="";
    private String lastName ="";

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName =firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
