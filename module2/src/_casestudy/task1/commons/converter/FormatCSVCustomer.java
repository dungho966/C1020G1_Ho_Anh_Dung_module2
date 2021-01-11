package _casestudy.task1.commons.converter;

import _casestudy.task1.model.Customer;
import _casestudy.task1.model.Villa;

public class FormatCSVCustomer implements FormatCSV<Customer> {
    @Override
    public String objectToCSV(Customer customer) {
        return customer.getName() + COMMA_DELIMITER
                + customer.getBirthday() + COMMA_DELIMITER
                + customer.getGender() + COMMA_DELIMITER
                + customer.getId() + COMMA_DELIMITER
                + customer.getPhoneNumber() + COMMA_DELIMITER
                + customer.getEmail() + COMMA_DELIMITER
                + customer.getTypeOfCustomer() + COMMA_DELIMITER
                + customer.getAddress();
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
    }}

