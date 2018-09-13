package com.miracle.javademo.servlet.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class MyServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        HttpSession session = req.getSession(false);
        if(session == null){
            System.out.println("doesn't have a session,create it");
            session = req.getSession(true);
            session.setAttribute("user","miracle");
            Cookie cookie = new Cookie("testKey","testValue");
            resp.addCookie(cookie);
        }else{
            System.out.println("Session,user="+session.getAttribute("user"));
        }
        System.out.println("SessionId="+session.getId());
        resp.sendRedirect(resp.encodeRedirectURL("/teacher"));

    }
}
