package com.vini.primeiroservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.Map.Entry;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "hello", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response, String metodo)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet InterpretarRequestServlet</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>Servlet InterpretarRequestServlet at " + request.getContextPath() + "</h1>");
      String requestURL = request.getRequestURL().toString();
      String protocol = request.getProtocol();
      int port = request.getLocalPort();
      String queryString = request.getQueryString();
      out.println("Requisição: " + requestURL + "<br/>");
      out.println("Protocolo: " + protocol + "<br/>");
      out.println("Porta: " + port + "<br/>");
      out.println("Método: " + metodo + "<br/>");
      out.println("Query: " + queryString + "<br/>");

      // Print all headers
      out.println("Parametros:");
      out.println("<ul>");
      Enumeration<String> params = request.getParameterNames();
      while(params.hasMoreElements()){
        String paramName = params.nextElement();
        out.println("<li>" + paramName+ ":" + request.getParameter(paramName) + "</li>");
      }
      out.println("</ul>");

      out.println("</body>");
      out.println("</html>");
    }
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response, "GET");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response, "POST");
  }
}