package hw_01_1;

import hw_01_1.valueObgect.PersonAddress;
import hw_01_1.valueObgect.PersonAge;
import hw_01_1.valueObgect.PersonName;
import hw_01_1.valueObgect.PersonSurname;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(new PersonName(name),
                new PersonSurname(surname),
                new PersonAge(age),
                new PersonAddress(address));
    }
}
