package bai19_regex_string.baitap.bt1;

import java.util.Comparator;

public class CopareByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}
