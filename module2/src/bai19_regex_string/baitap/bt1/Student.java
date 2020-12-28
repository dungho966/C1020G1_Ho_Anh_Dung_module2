package bai19_regex_string.baitap.bt1;

public class Student {
    private String name ;
    private int age;
    private String birthday;

    public Student() {
    }

    public Student(String name, int age, String birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                '}';
    }
//
//    @Override
//    public int compareTo(Student o) {
//        return this.age - o.age;
//    }


}
