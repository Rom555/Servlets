package com.my.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.my.servlet.User;
import com.my.servlet.UserDB;


@WebServlet("/")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(UserDB.select() == null){
            throw new IllegalStateException("BD connect error");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String u_login=request.getParameter("u_login");
        String u_password=request.getParameter("u_password");
        if(u_login != "" && u_password != "" && u_login!=null && u_login!=null){
            ArrayList<User> users = UserDB.select();
            if (UserCheck.isUserPasCorrect(users, u_login, u_password)){
                HttpSession session = request.getSession();
                session.setAttribute("u_login", u_login);
                response.addCookie(new Cookie("u_password", u_password));
                request.getRequestDispatcher("/hello.jsp").forward(request, response);
            } else {
                throw new IllegalStateException("Wrong Login or Password");
            }
        } else {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }

    }
}