package com.sky.servletsdemo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorlds extends HttpServlet {

    private String message;

    public void init() throws ServletException {
        message = "HelloWorlds";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Set response content type.
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>HelloWorlds Demo</title></head>");
            out.println("<body>");
            out.println("<h3> "+ message + request.getContextPath() + "</h3>");
            out.println("</body>");
            out.println("</html>");

        }

    }

}
