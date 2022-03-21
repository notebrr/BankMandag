package com.example.banken;

import DomæneObjekter.Konto;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    Map<String, Konto> konti = new HashMap<>();

     public void init() {
        Konto konto = new Konto("nicolai", "i", 150);
        Konto konto1 = new Konto("denis", "i", 150);
        Konto konto2 = new Konto("betul", "i", 150);
        Konto konto3 = new Konto("kristoffer", "i", 1500);
        Konto konto4 = new Konto("søren", "i", 2750);

        konti.put(konto.getNavn(), konto);
        konti.put(konto1.getNavn(), konto1);
        konti.put(konto2.getNavn(), konto2);
        konti.put(konto3.getNavn(), konto3);
        konti.put(konto4.getNavn(), konto4);

     }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ServletContext servletContext = getServletContext();

        servletContext.setAttribute("konti", konti);

        String msg = "her er en oversigt over kontierne";

        request.setAttribute("msg", msg);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void destroy() {
    }
}