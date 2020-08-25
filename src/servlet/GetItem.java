package servlet;

import com.google.gson.Gson;
import entity.Item;
import service.ItemService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/load")
public class GetItem extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.doPost(request, response);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setCharacterEncoding("UTF-8");
//        request.setCharacterEncoding("utf-8");
//        response.setContentType("application/json; charset=utf-8");
//        ItemService itemService=new ItemService();
//
//        Gson gson=new Gson();
//
//        List<Item> list=itemService.getAll();
//        String res=gson.toJson(list);
//
//        request.setAttribute("list",res);
//        response.getWriter().println(res);
//        request.getRequestDispatcher("1.html").forward(request,response);
//    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json; charset=utf-8");
        ItemService itemService=new ItemService();

        String type=req.getParameter("type");
        List<Item> list=null;

        if (type.equals("all")){
            list=itemService.getAll();
        } else {
            list=itemService.getByType(type);
        }

        Gson gson=new Gson();
        String res=gson.toJson(list);


//        System.out.println(res);
//        req.setAttribute("list",res);
        resp.getWriter().write(res);
//        resp.getWriter().println(res);
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setCharacterEncoding("UTF-8");
//        req.setCharacterEncoding("utf-8");
//        resp.setContentType("application/json; charset=utf-8");
//        ItemService itemService=new ItemService();
//
//        Gson gson=new Gson();
//        List<Item> list=itemService.getAll();
//        String res=gson.toJson(list);
//
//
//
//        System.out.println(res);
//        req.setAttribute("list",res);
//        resp.getWriter().write(res);
//        resp.getWriter().println(res);
//    }
}
