public class Calculator {
    public static float calculate (float first_operand , float second_operand , char operator){
        switch (operator) {
            case '+':
                return first_operand + second_operand ;
            case '-':
                return first_operand - second_operand ;
            case '*':
                return first_operand * second_operand ;
            case '/':
                if (second_operand != 0 ){
                    return first_operand / second_operand;
                } else {
                    throw new RuntimeException("Không thể chia cho 0");

                } default:
                    throw new RuntimeException("Hoạt động không hợp lệ");
        }
    }
}
