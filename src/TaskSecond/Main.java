package TaskSecond;

import java.util.List;
import java.util.stream.Collectors;

//TODO: 2.	Трансформация данных:
//	Создайте список строк, представляющих числа в виде строк.
//	Преобразуйте этот список в список целых чисел.
//	Отфильтруйте только четные числа.
//	Преобразуйте их в строковое представление.
//	Соберите их в строку, разделенную запятыми.

public class Main {
    public static void main(String[] args) {
        List<String> numbersString = List.of("1", "5", "26", "17", "24", "32", "75", "86");

        String string = numbersString.stream()
                .map(Integer::parseInt)
                .filter(n -> n % 2 ==0 )
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(string);
    }
}
