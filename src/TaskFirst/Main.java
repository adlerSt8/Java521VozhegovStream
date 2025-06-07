package TaskFirst;

import java.util.ArrayList;
import java.util.List;

//TODO: Фильтрация и сборка:
//	Создайте список объектов Person с полями name, age и gender.
//	Используя Stream, отфильтруйте только женщин старше 18 лет.
//	Соберите их имена в новый список.

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Александр", 25, Gender.MALE));
        personList.add(new Person("Виктория", 17, Gender.FEMALE));
        personList.add(new Person("Николай", 32, Gender.MALE));
        personList.add(new Person("Мария", 21, Gender.FEMALE));
        personList.add(new Person("Сергей", 14, Gender.MALE));
        personList.add(new Person("Светлана", 30, Gender.FEMALE));

        List<Person> persons = personList.stream()
                .filter(p -> p.getGender().equals(Gender.FEMALE))
                .filter(p -> p.getAge() > 18)
                .toList();

        System.out.println(persons);
    }
}