//6.	2. Дан массив чисел.
//7.	ТОЛЬКО через стрим, пропустить несколько элементов

package Task2;

import java.util.Arrays;

public class Stream2 {
    public static void main(String[] args) {
        int[] array = {5, 5, 4, 4, 55, 8};
        int sum = 0;
        sum = Arrays.stream(array).skip(3).sum();
        System.out.println(sum);
    }
}
