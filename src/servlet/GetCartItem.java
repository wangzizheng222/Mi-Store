package servlet;

import com.google.gson.Gson;
import entity.Cart;
import service.CartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/getCartItem")
public class GetCartItem extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json; charset=utf-8");
        resp.setContentType("text/html; charset=utf-8");
        resp.setHeader("Content-type", "text/html;charset=UTF-8");

        CartService cartService=new CartService();
        Gson gson=new Gson();

        String name=req.getParameter("name");

        List<Cart> list=cartService.getByName(name);

        resp.getWriter().write(gson.toJson(list));
    }
}
