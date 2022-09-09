//Вывод на экран элементов List:
//Создать список, заполнить его на 4 элементов и вывести на экран содержимое используя iterator.

package Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMass {
    public static void main(String[] args) {
        List<String> values = new ArrayList<>();
        values.add("asd");
        values.add("qwe");
        values.add("zxc");
        values.add("yui");
        Iterator<String> it = values.iterator();
        System.out.println(values);
    }
}
