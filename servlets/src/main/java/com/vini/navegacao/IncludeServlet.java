package com.vini.navegacao;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;

@WebServlet(name = "IncludeServlet", value = "/includeServlet")
public class IncludeServlet extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet IncludeServlet</title>");
      out.println("</head>");
      out.println("<body>");
      request.getRequestDispatcher("cabecalho.html").include(request, response);
      out.println("<h2>Servlet IncludeServlet at " + request.getContextPath() + "</h2>");
      request.getRequestDispatcher("rodape.html").include(request, response);
      out.println("</body>");
      out.println("</html>");
    }
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }
}