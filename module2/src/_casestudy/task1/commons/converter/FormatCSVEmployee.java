package _casestudy.task1.commons.converter;

import _casestudy.task1.model.Employee;

public class FormatCSVEmployee implements FormatCSV<Employee> {
    @Override
    public String objectToCSV(Employee employee) {
        return employee.getName() + COMMA_DELIMITER
                + employee.getAge() + COMMA_DELIMITER
                + employee.getAddress();
    }

    @Override
    public Employee csvToObject(String string) {
        return null;
    }
}
