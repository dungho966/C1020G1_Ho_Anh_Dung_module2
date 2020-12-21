package home;

public class Cat {
    private String name ;
    private int age ;
    private float weight ;
    private String color ;
    private String eysColor ;

    public Cat(){
    }

    public Cat(String name , int age){
        this.name = name;
        this.age = age ;
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEysColor() {
        return eysColor;
    }

    public void setEysColor(String eysColor) {
        this.eysColor = eysColor;
    }

    public void speak() {
        System.out.println(name + "is speaking");
    }

    public void move() {
        System.out.println(name + "is running");
    }

    public void sleep() {
        System.out.println(name + " is sleeping in the bed");
    }

    public void eat() {
        System.out.println(name + " is eating mouse");
    }

}

