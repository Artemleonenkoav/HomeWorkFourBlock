// 1. Коротко опишіть, які принципи ООП порушуються в наступному коді?
// Які правки ви внесли би у код, щоб принципи ООП не порушувались?
// Правки описувати у вигляді <номер строки> <ваш варіант>;


package Test1;

public class Dog implements HasSound {
    @Override
    public void makeSound() {bark();}

    void bark() {
        System.out.println("Woof");
    }
}
class Cat implements HasSound {
    @Override
    public void makeSound() {
        meow();
    }

    void meow() {
        System.out.println("meow");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
