package com.example.xiazai;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.FileInputStream;
import java.io.IOException;

@WebServlet(name = "xiazai", value = "/xiazai")
public class XiaZai extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求参数，文件名称
        String filename = request.getParameter("filename");
        //使用字节输入流加载文件进内存
        //找到文件服务器路径
        ServletContext servletContext = request.getServletContext();
        String realPath = servletContext.getRealPath("/txt/" + "servletContext.txt");
        //使用字节流关联
        FileInputStream fileInputStream = new FileInputStream(realPath);
        //设置response的响应头
        //设置响应头类型：content-type
        String mimeType = servletContext.getMimeType(filename);
        response.setHeader("content-type",mimeType);
        //设置响应头打开方式：content-disposition
        response.setHeader("content-disposition","attachment;filename="+"servletContext.txt");
        //将输入流的数据写出到输出流中
        ServletOutputStream outputStream = response.getOutputStream();
        byte[] bytes = new byte[1024*8];
        int len = 0;
        while ((len = fileInputStream.read(bytes))!= -1){
            outputStream.write(bytes,0,len);
        }
    }
}
