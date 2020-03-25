package com.my.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        session.removeAttribute("u_login");
        session.invalidate();
        Cookie ckp = new Cookie("u_password","");
        ckp.setMaxAge(0);
        response.addCookie(ckp);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
