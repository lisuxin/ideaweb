package com.wenapp.response;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "congdingxiang", value = "/congdingxiang")
public class CongDingXiang extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setHeader("content-type","text/html;charset=utf8");
        response.setContentType("text/html;charset=utf8");
        //设置状态码
//        response.setStatus(302);
//        //设置响应头
//        response.setHeader("location","/hello-servlet");


        //简单从重定向方法
        //response.sendRedirect("/hello-servlet");
        PrintWriter writer = response.getWriter();
        writer.write("你好");

        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write("4564".getBytes());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
