package _casestudy.task1.commons.validate;

public class ServiceValidate {
    public static boolean checkId(String input, String symbol) {
        String regex = "^SV" + symbol + "-[0-9]{4}$";
        return input.matches(regex);
    }

    public static boolean checkFirstWord(String input) {
        String regex = "^[A-Z].*$";
        return input.matches(regex);
    }

    public static boolean checkPoolArea(String input) {
        int poolArea;
        try {
            poolArea = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        if (poolArea > 30) return true;
        return false;
    }

    public static boolean checkPrice(String input) {
        int price;
        try {
            price = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        if (price >= 0) return true;
        return false;
    }

    public static boolean checkMaximumHuman(String input) {
        int maxhuman;
        try {
            maxhuman = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        if (maxhuman > 0 && maxhuman < 20) return true;
        return false;
    }

    public static void checkServices(String input) {
        String regex = "massage| karaoke | food | drink |car";
        input.matches(regex);


    }

    public static boolean checkFloors(String input) {
        int floor;
        try {
            floor = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        if (floor >= 0) return true;
        return false;
    }

    public static boolean checkRentalType(String input) {
        String regex = "^[A-Z].*$";
        return input.matches(regex);
    }
}




