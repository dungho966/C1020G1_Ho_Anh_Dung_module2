import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalServlet" , urlPatterns = "/Calc")
public class ProductDiscountCalServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float  list_price = Float.parseFloat(request.getParameter("list_price"));
        float discount_percent = Float.parseFloat(request.getParameter("discount_percent"));

        float discount_amount = (float) (list_price * discount_percent * 0.01);

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>List Price: " + list_price+ "</h1>");
        printWriter.println("<h1>Discount Percent: " + discount_percent+ "</h1>");
        printWriter.println("<h1>Discount Amount " + discount_amount+ "</h1>");
        printWriter.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
