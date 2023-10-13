import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Person> persons = new ArrayList<>();

        // Teacher teacher1 = new Teacher("Kalle", 45, "Matte");
        // Teacher teacher2 = new Teacher("Bengt", 55, "Svenska");
    
        // Student student1 = new Student("Erik", 12, 2023);
        // Student student2 = new Student("Anna", 13, 2022);

        // teacher1.sayHello();
        // teacher2.sayHello();
        // student1.sayHello();
        // student2.sayHello();

        persons.add(new Teacher("Kalle", 45, "Matte"));
        persons.add(new Teacher("Bengt", 55, "Svenska"));
        persons.add(new Student("Erik", 12, 2023));
        persons.add(new Student("Anna", 13, 2022));

        for (Person person : persons) {
            person.sayHello();

            if (person instanceof Student) {
                ((Student) person).startYear();
            }
        }
    }
}
