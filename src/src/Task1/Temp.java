//Задержка потока.
// Необходимо создать 3 потока, каждых из этих потоков запустить (например: main, second, first)
// и когда эти потоки успешно отработают – вывести на экран сообщение (завершение потом first, second и main).
package Task1;

public class Temp {
    public static void main(String[] args) {
        Thread thread = new Thread();
        Thread thread2 = new Thread();
        Thread thread3 = new Thread();
        thread.start();
        thread2.start();
        thread3.start();
        System.out.println("Завершение " + thread + thread2 + thread2);
    }
}
