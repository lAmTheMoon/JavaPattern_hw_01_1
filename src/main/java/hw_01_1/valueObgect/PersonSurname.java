package hw_01_1.valueObgect;

public class PersonSurname {
    private final String surname;


    public PersonSurname(String surname) {
        if (surname == null) throw new IllegalArgumentException("Введите фамилию");
        this.surname = surname;
    }



    @Override
    public String toString() {
        return surname;
    }
}
