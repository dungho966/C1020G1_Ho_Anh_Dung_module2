package home;

import bai7_abstractclass.baitap.Circle1;
import inheritance.baitap.Circle;

public class test {
    public static void main(String[] args) {
        Cat tom = new Cat("tom" , 6);

        tom.setAge(6);

        System.out.println(" ten cua meo la: " +tom.getName());
        System.out.println(" tuoi cua " +  tom.getName()  +  " la "  + tom.getAge());
        tom.eat();

        Cat meow = new Cat();
        meow.setName("lucky");
        meow.setAge(8) ;
        System.out.println(  meow.getName()   +   meow.getAge()  +  " tuoi ");
        meow.sleep();

        Student mai = new Student("mai" , "Pham huyen mai" );
        System.out.println("ID cua mai la: " +mai.getID() + "ten cua mai la: " +mai.getName());

        Circle1 circle1 = new Circle1(2);
        System.out.println("Radius la: "+circle1.getRadius() + "dien tich hinh tron la: " +circle1.getArea());
        System.out.println("color is" + circle1.getColor());
    }
}
