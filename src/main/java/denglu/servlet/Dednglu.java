package denglu.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import denglu.dao.User;
import denglu.jdbc.UserDao;

import java.io.IOException;

@WebServlet(name = "dednglu", value = "/dednglu")
public class Dednglu extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码
        request.setCharacterEncoding("utf-8");
        //获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //封装user对象
        User loginusers = new User();
        loginusers.setUsername(username);
        loginusers.setPassword(password);
        //调用UserDao的login方法
        UserDao dao =new UserDao();
        User user = dao.login(loginusers);
        if (user == null){
            request.getRequestDispatcher("/shibai").forward(request,response);
        }else {
            //存储数据
            request.setAttribute("user",user);
            //转发
            request.getRequestDispatcher("/chenggong").forward(request,response);
        }
    }
}
