package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee implements Comparable<Employee>{
    String name;
    int salary;
    int age;

    public Employee(String name, int salary, int age){
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public int compareTo(Employee e) {
        if(age == e.age){
            return salary - e.salary;
        }
        return age - e.age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
public class CompareCustomObject {
    public static void main(String[] args) {
        Employee[]employees = new Employee[3];
        employees[0] = new Employee("Suresh",10000,24);
        employees[1] = new Employee("Sudesh",9000, 24);
        employees[2] = new Employee("Dinesh",14000,25);

        Arrays.sort(employees);
        System.out.println("After Sorting: "+Arrays.toString(employees));
    }
}
