//import Test1.Cat;
//import Test1.Dog;
//import Test1.HasSound;
//
//public class Testone {
//    // 1. Коротко опишіть, які принципи ООП порушуються в наступному коді?
//// Які правки ви внесли би у код, щоб принципи ООП не порушувались?
//// Правки описувати у вигляді <номер строки> <ваш варіант>;
//
//// Нарушается принцип Полиморфизма
////
//
//
//package Test1;
//
//    public class Dog implements HasSound {
//        @Override
//        public void makeSound() {
//            System.out.println("Woof");
//        }
//
//    }
//
//    class Cat implements HasSound {
//        @Override
//        public void makeSound() {
//            System.out.println("meow");
//        }
//    }
//
//    class Main {
//        public static void main(String[] args) {
//            Test1.Dog dog = new Test1.Dog();
//            Test1.Cat cat = new Test1.Cat();
//            dog.makeSound();
//            cat.makeSound();
//        }
//    }
//
//}
