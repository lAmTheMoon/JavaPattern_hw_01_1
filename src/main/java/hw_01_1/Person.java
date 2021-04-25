package hw_01_1;

import hw_01_1.valueObgect.PersonAddress;
import hw_01_1.valueObgect.PersonAge;
import hw_01_1.valueObgect.PersonName;
import hw_01_1.valueObgect.PersonSurname;

import java.util.Objects;

public class Person {
    private final PersonName name;
    private final PersonSurname surname;
    private PersonAge age;
    private PersonAddress address;

    public Person(PersonName name, PersonSurname surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(PersonName name, PersonSurname surname, PersonAge age, PersonAddress address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return this.age == null;
    }

    public boolean hasAddress() {
        return this.address == null;
    }

    public PersonName getName() {
        return this.name;
    }

    public PersonSurname getSurname() {
        return this.surname;
    }

    public PersonAge getAge() {
        return this.age;
    }

    public PersonAddress getAddress() {
        return this.address;
    }

    public PersonAddress setAddress(String address) {
        this.address = new PersonAddress(address);
        return this.address;
    }



    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(this.surname.toString()).setAddress(this.address.toString());
    }

    @Override
    public String toString() {
        return ("Person(name: " + this.name + ", surname: " + this.surname +
                (", age: " + this.age) +
                (", address: " + this.address) + ")");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name)
                && Objects.equals(surname, person.surname) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}