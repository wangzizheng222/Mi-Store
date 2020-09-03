package servlet;

import com.google.gson.Gson;
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
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("application/json; charset=utf-8");

        String name=request.getParameter("name");
        String password=request.getParameter("password");
        UserService my_user=new UserService();
        Gson gson = new Gson();

        String res = my_user.sign_in(name,password);
//        if ( res == 1){
//            request.getRequestDispatcher("index.html").forward(request,response);
//        } else if (res == 2){
//            request.getRequestDispatcher("1.html").forward(request,response);
//        } else if (res == 3) {
//            request.getRequestDispatcher("2.html").forward(request,response);
//        }
        response.getWriter().write(gson.toJson(res));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }
}
