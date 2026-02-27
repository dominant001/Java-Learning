import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {

        List<Integer> lis = new ArrayList<Integer>();
        lis.add(33);
        lis.add(50);
        lis.add(70);
        lis.add(5);
        lis.add(33);

        lis.stream().filter(c -> c % 2 == 0).forEach(n -> System.out.print(n + " "));

        List<String> nameList = new ArrayList<String>();
        nameList.add("Ankit");
        nameList.add("abhishek");
        nameList.add("Sanjay");
        nameList.add("Ajit");

        nameList.stream().map(n -> Character.toUpperCase(n.charAt(0)) + n.substring(1))
                .filter(n -> n.startsWith("A")).sorted()
                .forEach(System.out::println);

        List<Integer> newLis = new ArrayList<Integer>();
        newLis = lis.stream().filter(e -> e > 10).distinct().map(e -> e).collect(Collectors.toList());
        System.out.println(newLis);

        // count
        long count = lis.stream().count();
        System.out.println("Count: " + count);

        // sorted
        Stream<Integer> sorted = lis.stream().sorted();
        sorted.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // sum
        int sum = lis.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);

        // double the value
        Stream<Integer> doubleValues = lis.stream().map(n -> n * 2);
        doubleValues.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // double the even value
        lis.stream().sorted().map(n -> n % 2 == 0 ? n * 2 : n).forEach(n -> System.out.println(n + " "));

        // double and print only the odd value
        lis.stream().filter(n -> n % 2 != 0).map(n -> n * 2).forEach(n -> System.out.println(n + " "));

        // filter even numbers, double them, and sum
        int res = lis.stream().sorted().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (a, b) -> a + b);
        System.out.println("Result: " + res);

        // filter even numbers, double them, and sum

        List<Double> lis1 = Arrays.asList(33.0, 50.0, 70.0, 5.0, 33.0);
        double res1 = lis1.stream().sorted().filter(n -> n % 2 == 0).map(n -> n * 2).mapToInt(Double::intValue).sum();
        System.out.println("Result 1 : " + res1);
    }

}
