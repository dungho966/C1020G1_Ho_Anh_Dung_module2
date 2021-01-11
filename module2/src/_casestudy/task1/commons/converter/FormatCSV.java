package _casestudy.task1.commons.converter;

public interface FormatCSV<E> {
    String COMMA_DELIMITER =",";

    String objectToCSV(E e);
    E csvToObject(String string);
}
