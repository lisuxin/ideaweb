package com.wenapp.request;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "Tongyong", value = "/Tongyong")
public class Tongyong extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //根据参数名称获取参数值
        String username = request.getParameter("username");
        System.out.println(username);
        System.out.println("-------------------------");
        //根据参数名称获取参数值的数组
        String[] hobbies = request.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
        System.out.println("-------------------------");
        //获取所有请求的参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            System.out.println(name);
            System.out.println(request.getParameter(name));
        }
        System.out.println("-------------------------");
        //获取所有参数的Map集合
        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<String> strings = parameterMap.keySet();
        for (String string : strings) {
            //获取键获取值
            String[] strings1 = parameterMap.get(string);
            System.out.println(strings1);
            for (String s : strings1) {
                System.out.println(s);
            }
        }
    }
}
