package inheritance.baitap;

public abstract class HinhHoc {
    private String name ;

    public HinhHoc(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getArea(){

    }

    @Override
    public String toString() {
        return "HinhHoc{" +
                "name='" + name + '\'' +
                '}';
    }
}
