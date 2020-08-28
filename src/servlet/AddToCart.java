package servlet;

import service.CartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addToCart")
public class AddToCart extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json; charset=utf-8");

        String userName=req.getParameter("userName");
        String version=req.getParameter("version");
        String color=req.getParameter("color");
        String name=req.getParameter("name");
        int num=Integer.parseInt(req.getParameter("num"));
        String itemId=req.getParameter("itemId");
        String price=req.getParameter("price");

        CartService cartService=new CartService();

        cartService.addItem(userName,version,color,name,num,itemId,price);
    }
}
