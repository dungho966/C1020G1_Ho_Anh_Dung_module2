import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleCalculatorServlet" , urlPatterns = "/Calcu")
public class SimpleCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        float first_operand = Integer.parseInt(request.getParameter("firstOperand"));
        char operator = request.getParameter("operator").charAt(0);
        float second_operand = Integer.parseInt(request.getParameter("secondOperand"));

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>Result</h1>");

        try {
            float result = Calculator.calculate(first_operand , second_operand , operator);
            printWriter.println(String.valueOf(first_operand) + operator+ second_operand+ "=" + result);
        } catch (Exception E){
            printWriter.println("Error " +E.getMessage());
        }
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
