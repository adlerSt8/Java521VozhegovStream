package TaskSixth;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }

        long startTime1 = System.nanoTime();
        int sum1 = numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        long endTime1 = System.nanoTime();
        System.out.println("Сумма квадратов через stream: " + sum1);
        System.out.println("Время stream: " + (endTime1 - startTime1) / 1_000_000 + " мс");

        long startTime2 = System.nanoTime();
        int sum2 = numbers.parallelStream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        long endTime2 = System.nanoTime();
        System.out.println("Сумма квадратов через parallelStream: " + sum2);
        System.out.println("Время parallelStream: " + (endTime2 - startTime2) / 1_000_000 + " мс");
    }
}
