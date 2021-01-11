package _casestudy.task1.commons.converter;

import _casestudy.task1.model.Customer;

public class FormatCSVBookingTicket implements FormatCSV<Customer> {
    @Override
    public String objectToCSV(Customer customer) {
        return null;
    }

    @Override
    public Customer csvToObject(String string) {
        String[] arrString = string.split(",");
        return new Customer(
                arrString[0],
                arrString[1],
                arrString[2] ,
                Integer.parseInt(arrString[3]) ,
                Integer.parseInt(arrString[4]),
                arrString[5] ,
                arrString[6],
                arrString[7]
        );
    }
}
