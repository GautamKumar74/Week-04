package mapinterface.groupobjectsbyproperty;

import java.util.*;

public class GroupByDepartment {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            departmentMap.putIfAbsent(emp.department, new ArrayList<>());
            departmentMap.get(emp.department).add(emp);
        }

        return departmentMap;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR"));

        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);
        System.out.println(groupedEmployees);
    }
}
