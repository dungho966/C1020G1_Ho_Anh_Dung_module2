package bai5_AccessModifier.thuchanh;

public class TH3_StaticProperty {
    private String name;

    private String engine;



    public static int numberOfCars;



    public TH3_StaticProperty(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }

}
