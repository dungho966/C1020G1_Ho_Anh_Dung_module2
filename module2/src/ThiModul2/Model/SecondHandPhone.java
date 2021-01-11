package ThiModul2.Model;

public class SecondHandPhone extends Phone {
    private String countryGetPhone ; //quoc gia xach tay
    private String standardPhone ; //trang thai dien thoai

    public SecondHandPhone() {
    }

    public SecondHandPhone(String countryGetPhone, String standardPhone) {
        this.countryGetPhone = countryGetPhone;
        this.standardPhone = standardPhone;
    }

    public SecondHandPhone(String id, String phoneName, int price, int destNumber, String production, String countryGetPhone, String standardPhone) {
        super(id, phoneName, price, destNumber, production);
        this.countryGetPhone = countryGetPhone;
        this.standardPhone = standardPhone;
    }

    public String getCountryGetPhone() {
        return countryGetPhone;
    }

    public void setCountryGetPhone(String countryGetPhone) {
        this.countryGetPhone = countryGetPhone;
    }

    public String getStandardPhone() {
        return standardPhone;
    }

    public void setStandardPhone(String standardPhone) {
        this.standardPhone = standardPhone;
    }

    @Override
    public String toString() {
        return super.toString() + "SecondHandPhone{" +
                "countryGetPhone='" + countryGetPhone + '\'' +
                ", standardPhone='" + standardPhone + '\'' +
                '}' ;
    }
}
