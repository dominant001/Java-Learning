package Concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComperatorComparableEx {
    public static void main(String[] args) {

        // Ex 1
        List<ComparableEx> obj = new ArrayList<ComparableEx>();
        obj.add(new ComparableEx(2, "Ankit"));
        obj.add(new ComparableEx(1, "Rohit"));
        obj.add(new ComparableEx(3, "Suresh"));

        Collections.sort(obj);

        obj.forEach(e -> System.out.println(e.id + " " + e.name));

        // Syntax 1
        Collections.sort(obj, new ComparatorEx());

        obj.forEach(e -> System.out.println(e.id + " " + e.name));

        // Syntax 2
        Collections.sort(obj, new Comparator<ComparableEx>() {
            public int compare(ComparableEx i, ComparableEx j) {
                return i.name.compareTo(j.name);
            }
        });

        obj.forEach(e -> System.out.println(e.id + " " + e.name));

        // Ex 2
        String[] arr = { "Ankit", "Rohita", "sur" };
        List<String> arrList = Arrays.asList(arr);

        // syntax 1
        Collections.sort(arrList, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        });

        arrList.forEach(s -> System.out.println(s));

        // syntax 2
        Collections.sort(arrList, (a, b) -> a.length() - b.length());

        arrList.forEach(s -> System.out.println(s));

    }

}

class ComparableEx implements Comparable<ComparableEx> {

    public int id;
    public String name;

    public ComparableEx(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(ComparableEx o) {
        return this.id - o.id;
    }
}

class ComparatorEx implements Comparator<ComparableEx> {

    @Override
    public int compare(ComparableEx obj1, ComparableEx obj2) {
        return obj1.name.compareTo(obj2.name);
    }

}