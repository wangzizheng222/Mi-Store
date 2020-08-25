package servlet;

import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        UserService my_user=new UserService();

        int res = my_user.sign_in(name,password);
        if ( res == 1){
            request.getRequestDispatcher("index.html").forward(request,response);
        } else if (res == 2){
            request.getRequestDispatcher("1.html").forward(request,response);
        } else if (res == 3) {
            request.getRequestDispatcher("2.html").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }
}
