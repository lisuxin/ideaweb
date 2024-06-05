package com.example.huihua;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@WebServlet(name = "huihua", value = "/huihua")
public class HuiHua extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie name = new Cookie("name", "123");
        name.setMaxAge(60);
        response.addCookie(name);
    }
}
