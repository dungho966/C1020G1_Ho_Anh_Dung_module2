package bai19_regex_string.baitap.bt1;

import java.util.Comparator;

public class CompareByNameByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        }else {
            return o1.getAge()- o2.getAge();
        }

    }
}

