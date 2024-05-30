package denglu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import denglu.dao.User;

import java.io.IOException;

@WebServlet("/chenggong")
public class Chenggong extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user= (User) request.getAttribute("user");
        if (user!=null) {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("成功"+user.getUsername()+"了");
        }
    }
}
