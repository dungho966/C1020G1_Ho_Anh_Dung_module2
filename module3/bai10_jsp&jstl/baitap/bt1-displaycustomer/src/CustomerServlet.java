import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet" ,urlPatterns = {"", "/list"})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer("Hồ Anh Dũng" , "01/10/1996" , "Nghệ An" ,
                "144e054c414069a3d23c10e3f5a1805b.png"));
        customerList.add(new Customer("Trần Huỳnh Bảo Thịnh" , "02/08/2001" , "Quảng Nam",
                "chaien.jpg"));
        customerList.add(new Customer("Phạm Hồng Sơn" , "02/10/1997" , "Nghệ An",
                "Kaminari.jpg"));
        customerList.add(new Customer("Trần Hữu Kiên" , "01/07/1991" , "Nghệ An",
                "919407-doraemon-dorayaki.jpg"));
        customerList.add(new Customer("Lê Thanh Cao" , "09/12/1996" , "Nghệ An" ,
                "tsubasa-1_GRDE.jpg"));

        request.setAttribute("customerListFromServlet" , customerList);
        request.getRequestDispatcher("index.jsp").forward(request , response);


    }
}
