package TaskFour;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TODO: 4.	Сортировка и поиск:
//	Создайте список целых чисел.
//	Отсортируйте его по убыванию.
//	Найдите первые 3 элемента после сортировки.

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 56, 6, 3, 86, 324, 55, 34, 26);

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
    }
}
