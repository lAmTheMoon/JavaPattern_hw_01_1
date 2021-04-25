package hw_01_1;

public class Main {
    public static void main(String[] args) {
        try {
            Person mom = new PersonBuilder()
                    .setName("Анна").setSurname("Вольф")
                    .setAge(31).setAddress("Сидней").build();

            System.out.println(mom);

            mom.setAddress("Аляска");
            System.out.println(mom);

            Person son = mom.newChildBuilder().setName("Антошка")
                    .setAge(1).build();

            son.getAge().happyBirthday();

            System.out.println("У " + mom + " есть сын, " + son);

        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            Person vanya = new PersonBuilder()
                    .setName("Иван").setSurname("Петров")
                    .setAge(-100).setAddress("Уфа").build();
            System.out.println(vanya);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
