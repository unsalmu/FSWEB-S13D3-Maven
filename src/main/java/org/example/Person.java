package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    int birthDate;
    Boolean isMarried;
    String email;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, int birthDate, boolean isMarried, String email) {
        this(firstName, lastName, age);
        this.birthDate = birthDate;
        this.isMarried = isMarried;
        this.email = email;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public boolean isTeen() {
        if (this.age >= 13 && this.age < 19) {
            return true;
        }
        return false;
    }
}
