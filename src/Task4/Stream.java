// Через цикл нужно создать новый массив пользователей,возвраст которых больше 20 лет

package Task4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Stream {
    public static void main(String[] args) {
        User users = new User("Artur", 29);
        User users2 = new User("Ruslan", 15);
        User users3 = new User("Artem", 24);
        User users4 = new User("Vlad", 25);
        users4.setPayForVip(true);
        users3.setPayForVip(true);
        User[] array = {users, users2, users3, users4};
        Function<User , vipUser> function = user -> {
            vipUser vipUser = new vipUser(user.getName(), user.getAge());
            vipUser.setPayForVip(true);
            return vipUser;
        };

//                Решение через    Lumda
//        System.out.println(Arrays.stream(array)
//                .filter(userSrteam -> userSrteam.getAge() > 18).toList());

// Для Vip пользователей
        System.out.println(Arrays.stream(array)
                .filter(userSrteam -> userSrteam.getAge() > 18)
                .filter(User::isPayForVip)
                .map(function)

                .toList());


// Решение через    Stream
//        Predicate<User> predicate = new Predicate<User>() {
//            @Override
//            public boolean test(User user) {
//                return user.getAge() > 18;
//            }
//        };
//        System.out.println(Arrays.stream(array).filter(predicate).toList());
    }
}

class User {
    private String name;
    private int age;
    private boolean payForVip;

    public boolean isPayForVip() {
        return payForVip;
    }

    public void setPayForVip(boolean payForVip) {
        this.payForVip = payForVip;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}

class  vipUser extends User{

    public vipUser(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "vipUser{" +
                "value='" + super.toString() + '\'' +
                '}';
    }
}