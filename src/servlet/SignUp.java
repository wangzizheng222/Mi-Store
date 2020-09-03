package servlet;

import com.google.gson.Gson;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sign_up")
public class SignUp extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json; charset=utf-8");

        String name=req.getParameter("name");
        String tel=req.getParameter("tel");
        String mail=req.getParameter("mail");
        String password=req.getParameter("password");

        UserService userService=new UserService();
        Gson gson=new Gson();

        String my_name=userService.sign_up(name,tel,mail,password);
        resp.getWriter().write(gson.toJson(my_name));
    }
}
