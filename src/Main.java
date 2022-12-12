import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Person> persons = new TreeSet<>((o1, o2) -> {

            if (o1.getSurname().split(" ").length == (o2.getSurname().split(" ").length)) {

                return o1.getAge() - o2.getAge();

            }

            return o1.getSurname().split(" ").length - o2.getSurname().split(" ").length;

        });

        persons.add(new Person("Антон","Датский Норвежский",14));

        persons.add(new Person("Евгений","Нюрнбергский колбасныйпринц",22));

        persons.add(new Person("Иван","Гроз ный",22));

        persons.add(new Person("Борис","Ельцин Годунов",14));

       // System.out.println(persons);

       // persons.removeIf(person -> person.getAge() >= 18);

        System.out.println(persons);

    }

}
