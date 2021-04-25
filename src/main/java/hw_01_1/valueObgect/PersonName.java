package hw_01_1.valueObgect;

public class PersonName {
    private String name;

    public PersonName(String name) {
        if (name == null) throw new IllegalArgumentException("Введите имя");
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
