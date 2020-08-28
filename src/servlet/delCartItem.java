package servlet;

import service.CartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delCartItem")
public class delCartItem extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json; charset=utf-8");
        resp.setContentType("text/html; charset=utf-8");
        resp.setHeader("Content-type", "text/html;charset=UTF-8");

        CartService cartService=new CartService();

        int index=Integer.parseInt(req.getParameter("index"));
        String userName=req.getParameter("userName");


        cartService.delById(index,userName);
    }
}
