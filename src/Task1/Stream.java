//1.	1. Дан массив чисел.
//2.	ТОЛЬКО через стрим найти способ найти сумму их всех.
//3.	Способов минимум 2, но достаточно 1.
package Task1;

import java.util.Arrays;

public class Stream {
    public static void main(String[] args) {
        int[] array = {5, 5, 4, 4, 55, 8};
        int sum = 0;
        sum = Arrays.stream(array).sum();
        System.out.println(sum);
    }
}
