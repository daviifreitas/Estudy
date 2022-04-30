import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Laboratory {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(45);
        l.add(32);
        l.add(47);
        l.add(3);
        l.add(22);

        Collections.sort(l);

        for (Integer integer : l) {
            System.out.println(integer);
        }

    }
}