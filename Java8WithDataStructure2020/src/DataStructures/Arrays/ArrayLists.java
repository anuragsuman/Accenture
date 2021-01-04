package DataStructures.Arrays;

import DataStructures.Stack.Employee;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Aakash", "Badola", 12345));
        employeeList.add(new Employee("Shreyansh", "Dutt", 12346));
        employeeList.add(new Employee("Ajay", "Singh", 12347));
        employeeList.add(new Employee("Maninder", "Singh", 12348));

        employeeList.set(1, new Employee("Akhilesh", "Matura", 12349));
        //employeeList.forEach(employee -> System.out.println(employee));
        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("Shreyansh", "Dutt", 12350));
        //employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee emp : employeeArray){
            System.out.println(emp);
        }

        System.out.println(employeeList.contains(new Employee("Aakash", "Badola", 12345)));
        System.out.println(employeeList.indexOf(new Employee("Ajay", "Singh", 12347)));

        employeeList.remove(1);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
