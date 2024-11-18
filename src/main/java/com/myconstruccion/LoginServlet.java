package com.myconstruccion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Aquí puedes agregar la lógica de autenticación
        if ("admin".equals(username) && "password".equals(password)) {
            response.getWriter().println("Login exitoso");
        } else {
            response.getWriter().println("Login fallido");
        }
    }
}
