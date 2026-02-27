import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        // Filter
        List<Integer> lis = new ArrayList<Integer>();
        lis.add(1);
        lis.add(3);
        lis.add(7);
        lis.add(5);
        lis.add(2);

        lis.stream().filter(c -> c > 3).forEach(System.out::println);

        // Transform
        List<String> names = List.of("RAM", "SHyaM");

        List res = names.stream().map(c -> c.toLowerCase()).toList();
        System.out.println(res);

        // sorted
        lis.stream().sorted().map(n -> n * 10).forEach(System.out::println);

        List resp = lis.stream().sorted(Comparator.reverseOrder()).filter(n -> n > 2).toList();
        System.out.println(resp);

        // flatMap
        List<List<String>> list = List.of(
                List.of("A", "C"),
                List.of("C", "D"));

        list.stream().flatMap(l -> l.stream()).distinct().forEach(System.out::println);

        List<List<Integer>> nums = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8));

        List<Integer> respo = nums.stream().flatMap(l -> l.stream().filter(n -> n % 2 == 0).map(n -> n * 10)).toList();
        System.out.println(respo);

        Employee emp1 = new Employee();
        emp1.name = "Ankit";
        emp1.dept = "IT";
        emp1.salary = 1000;

        Employee emp2 = new Employee();
        emp2.name = "Sanjay";
        emp2.dept = "HR";
        emp2.salary = 2000;

        Employee emp3 = new Employee();
        emp3.name = "Ajit";
        emp3.dept = "IT";
        emp3.salary = 3000;

        List<Employee> emps;

        emps = List.of(emp1, emp2, emp3);

        Map<String, List<Employee>> empDt = emps.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(empDt);

        String emp = emps.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))).get().name;
        System.out.println(emp);

        List<String> applicableSwifts = List.of("760", "767", "761", "767", "760", "762", "763", "764", "765", "766",
                "768", "769");

        Map<String, Long> swiftCount = applicableSwifts.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(swiftCount);
    }

}

class Employee {
    String name;
    String dept;
    int salary;

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

}