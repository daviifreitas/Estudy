package Laboratory.Lab02.Classes;

import java.util.Comparator;

public class PersonCompareCpf implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getCpf().compareTo(o2.getCpf());
    }
}
