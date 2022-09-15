// Через цикл нужно создать новый массив пользователей,возвраст которых больше 20 лет

package Task3;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        User users = new User("Artur", 29);
        User users2 = new User("Ruslan", 25);
        User users3 = new User("Artem", 39);
        User users4 = new User("Vlad", 15);
        User[] array = {users, users2, users3, users4};
        User[] allOlds = getAllOlds(array);


    }

    static User[] getAllOlds(User[] array) {
        int count = 0;
        List<User> userList = Arrays.stream(array).toList();

        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 18) {
                count++;
            }
        }
            User[] result = new User[count];
            for (int i = 0 , v = 0; i < array.length || result.length < v; i++) {
                if (array[i].getAge() > 18) {
                    result [v++] = array[i];
                }
            }
            return (User[]) userList.toArray();
        }
    }

class User {
    private String name;
    private int age;

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
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}