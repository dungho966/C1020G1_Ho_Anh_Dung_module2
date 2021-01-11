package _casestudy.task1.commons.validate;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerValidate {
    public static final String ServicesRegex = "SV[VL|HO|RO]-[0-9]{4}";
    public static final String ServicesNameRegex = "[A-Z][a-z]*";
    private static Pattern pattern;
    private static Matcher matcher;

    public static boolean isValidService(String input, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);

        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Input Not Matching With" + regex);
        }

        return flag;
    }

    public static boolean checkPool(double number, double destNumber) {
        boolean flag = number > destNumber;
        if (!flag) {
            System.out.println("Input Not More Than" + destNumber);
        }
        return flag;
    }

    public static boolean checkPool(double number, double startNumber, double endNumber) {
        boolean flag = number > startNumber && number < endNumber;
        if (!flag) {
            System.out.println(" nhap sai dien tich");
        }
        return flag;
    }

    public static boolean checkNameServiceMassage(String input) {
        String[] list = {"massage", "karaoke"};
        boolean flag = Arrays.asList(list).contains(input);

        if (!flag) {
            System.out.println("ko nam trong danh sach dich vu");
        }
        return flag;
    }


}
