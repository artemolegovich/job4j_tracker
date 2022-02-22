package ru.job4j.lambda;

import java.util.function.Function;

public class ScopeInside {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int rsl = sumEl(number,
                n -> {
                    int sum = 0;
                    for (int el : n) {
                        sum += el;
                    }
                    return sum;
                });
        System.out.println(rsl);
    }

    private static Integer sumEl(int[] array, Function<int[], Integer> calc) {
        return calc.apply(array);
    }
}
