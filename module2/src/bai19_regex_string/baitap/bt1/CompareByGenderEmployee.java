package bai19_regex_string.baitap.bt1;

import bai11_DSA_Stack_queue.baitap.Employee;

import java.util.Comparator;

public class CompareByGenderEmployee implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getGender().compareTo(o2.getGender());
    }
}
