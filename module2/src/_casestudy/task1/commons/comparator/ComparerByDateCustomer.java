package _casestudy.task1.commons.comparator;

import _casestudy.task1.model.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class ComparerByDateCustomer implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        }
        if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        }

        String date1 = o1.getBirthday();
        String date2 = o2.getBirthday();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        Date strDate1 = null;
        Date strDate2 = null;
        try {
            strDate1 = formatter.parse(date1);
            strDate2 = formatter.parse(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return strDate1.compareTo(strDate2);
    }
}

