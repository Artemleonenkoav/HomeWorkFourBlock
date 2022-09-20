// 2. Напишіть свій клас MyException таким чином
// щоб у випадку помилки в консоль виводилось повідомлення Wrong number!

package Test2;

import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            printFilteredNumber(generateNumver());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static void printFilteredNumber(Integer number) throws MyException {
        Integer filtered = Optional.of(number)
                .filter(i -> i > 5)
                .orElseThrow(MyException::new );
        System.out.println(filtered);
    }
    private static Integer generateNumver (){
        return new Random().nextInt(10);
    }
}
