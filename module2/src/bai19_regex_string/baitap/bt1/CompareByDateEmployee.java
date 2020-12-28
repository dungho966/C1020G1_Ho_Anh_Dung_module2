package bai19_regex_string.baitap.bt1;

import bai11_DSA_Stack_queue.baitap.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class CompareByDateEmployee implements Comparator<Employee> {





    @Override
    public int compare(Employee o1, Employee o2) {


        String date1 =o1.getBirthday();
        String date2 =o2.getBirthday();
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
