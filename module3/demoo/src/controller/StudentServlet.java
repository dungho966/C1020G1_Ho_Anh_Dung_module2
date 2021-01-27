package controller;

import bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentServlet" , urlPatterns = {"" , "/list"})
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1 , "Ho Anh Dung" , "01/10/1996" , 1 , 10));
        studentList.add(new Student(2 , "Tran Huynh Bao Thinh" , "02/10/2000" , 1 , 5));
        studentList.add(new Student(3 , "Ho Thanh Van" , "21/12/1990" , 2 , 15));

        request.setAttribute("studentListFromServlet" , studentList);
        request.setAttribute("tmp" , "<p style ='color: red' >Hello C1020</p>");
        request.getRequestDispatcher("list_student.jsp").forward(request, response);
    }
}
