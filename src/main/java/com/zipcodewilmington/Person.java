package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String eyeColor;
    private final boolean zipCoder;


    public Person(String firstName,
                  String lastName,
                  int age,
                  String eyeColor,
                  boolean zipCoder) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.eyeColor = eyeColor;
        this.zipCoder = zipCoder;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("\nMy first name is " + firstName)
                .append("\nMy last name is " + lastName)
                .toString();
    }
}
