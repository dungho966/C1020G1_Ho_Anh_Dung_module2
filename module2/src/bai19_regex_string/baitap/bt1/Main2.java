package bai19_regex_string.baitap.bt1;

import bai11_DSA_Stack_queue.baitap.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("A", "Male" , "1/10/1996");
        Employee employee2 = new Employee("B" , "Female " , "2/10/1995");
        Employee employee3 = new Employee("C" , "Female " , "3/10/1998");
        Employee employee4 = new Employee("D", "Male" ,"4/10/2000");

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);

        for (Employee employee: list) {
            System.out.println(employee);
        }

        Collections.sort(list , new CompareByDateEmployee());

        for (Employee employee: list) {
            System.out.println(employee);
        }

        System.out.println("----byGender---");
        Collections.sort(list , new CompareByGenderEmployee());
        for (Employee employee:list) {
            System.out.println(employee);
        }
    }
}
