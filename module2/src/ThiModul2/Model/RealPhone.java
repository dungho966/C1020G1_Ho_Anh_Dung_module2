package ThiModul2.Model;

public class RealPhone extends Phone {
    private int timeTest; //thoi gian bao hanh
    private String areaTest ; //pham vi bao hanh

    public RealPhone() {
    }
    public RealPhone(int timeTest) {
        this.timeTest = timeTest;
    }


    public RealPhone(int timeTest, String areaTest) {
        this.timeTest = timeTest;
        this.areaTest = areaTest;
    }

    public RealPhone(String id, String phoneName, int price, int destNumber, String production, int timeTest, String areaTest) {
        super(id, phoneName, price, destNumber, production);
        this.timeTest = timeTest;
        this.areaTest = areaTest;
    }

    public int getTimeTest() {
        return timeTest;
    }

    public void setTimeTest(int timeTest) {
        this.timeTest = timeTest;
    }

    public String getAreaTest() {
        return areaTest;
    }

    public void setAreaTest(String areaTest) {
        this.areaTest = areaTest;
    }

    public String toString() {
        return  super.toString() + "RealPhone{" +
                "timeTest=" + timeTest +
                ", areaTest='" + areaTest + '\'' +
                '}';
    }
}
