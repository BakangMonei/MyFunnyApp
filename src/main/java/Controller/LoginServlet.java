package Controller;

import Database.SwiftIQDatabase;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Tuesday June 2023
 * @Time: 1:05 PM
 */

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    public LoginServlet() {
        super();
    }

    SwiftIQDatabase DB = new SwiftIQDatabase();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try{
            if(DB.verifyAdminLogin(email, password).next()){
                Cookie loginCk = new Cookie("email", email);
                loginCk.setMaxAge(60*5);
                response.addCookie(loginCk);
                response.sendRedirect(request.getContextPath() + "/admin_dashboard.jsp");

                System.out.println("Successfully read from the database");
            }
            else if(email.equals("admin@gmail.com") && password.equals("admin1234")){
                Cookie loginCk = new Cookie("email", email);
                loginCk.setMaxAge(60*5);
                response.addCookie(loginCk);
                response.sendRedirect(request.getContextPath() + "/admin_dashboard.jsp");
                System.out.println("Embedded database in the code");
            }

            else{
                response.sendRedirect(request.getContextPath() + "/try.jsp");
                System.out.println("Error at the LoginServlet.java");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}