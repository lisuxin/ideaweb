package com.wenapp.servletcontext;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "context", value = "/context")
public class ServletContextDome extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = request.getServletContext();
        String filename = "a.jpg";
        String mimeType = servletContext.getMimeType(filename);

        servletContext.setAttribute("name","123");
        servletContext.getAttribute("name");
        servletContext.removeAttribute("name");

    }
}
