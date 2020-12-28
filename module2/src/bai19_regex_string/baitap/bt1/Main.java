package bai19_regex_string.baitap.bt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Dung1" , 18 , "12/02/2000");
        Student student2 = new Student("Dung1" , 16 , "11/02/2000");
        Student student3 = new Student("CKn" , 17 , "12/02/1998");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        for (Student student: studentList) {
            System.out.println(student);
        }
        System.out.println("-------sao sanh theo tuoi---------------");
        Collections.sort(studentList, new CopareByAge());

        for (Student student: studentList) {
            System.out.println(student);
        }


        System.out.println("---sap xep theo ten-----");
        Collections.sort(studentList, new CompareByNameEmployee());

        for (Student student: studentList) {
            System.out.println(student);
        }

        System.out.println("---");
        Collections.sort(studentList , new CompareByNameByAge());

        for (Student student: studentList) {
            System.out.println(student);
        }
        System.out.println("--date-");
        Collections.sort(studentList , new CompaByDate());

        for (Student student: studentList) {
            System.out.println(student);
        }
    }
}
