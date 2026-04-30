package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        int num = 10;

        while (numbers.size() < 40) {
            if (num % 2 == 0) {
                numbers.add(num);
            }
            num++;
        }

        System.out.println(numbers);
    }
}
