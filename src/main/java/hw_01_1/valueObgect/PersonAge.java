package hw_01_1.valueObgect;

public class PersonAge {
    private int age;

    public PersonAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Возраст должен быть больше нуля");
        if (age > 130) throw new IllegalArgumentException("Столько не живут");
        this.age = age;
    }

    @Override
    public String toString() {
        return String.valueOf(age);
    }

    public void happyBirthday() {
        ++this.age;
    }
}
