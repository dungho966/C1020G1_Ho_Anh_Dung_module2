package _casestudy.task1.commons.exception;

public class BirthDayException extends Exception{
    public BirthDayException() {
        super("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm, đúng định dạng dd/mm/yyyy");
    }
}
