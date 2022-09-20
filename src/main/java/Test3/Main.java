package Test3;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String numbers = filterAndCollectByJoining("1", "a", "2", " b ", " 3 ", " c ");
        System.out.println(numbers);
    }
    private static String filterAndCollectByJoining(String...strings) {
//        return Arrays.stream(strings).filter(NumberUtils::isCreatable).collect(Collectors.joining());
        return Arrays.stream(strings).filter(NumberUtils::isCreatable).collect(Collectors.joining());

//        StringBuilder sb = new StringBuilder();
//
//        for (String s : strings) {
//            if (NumberUtils.isCreatable(s)) {
//                sb.append(s);
//            }
//        }
//        return sb.toString();
    }
}