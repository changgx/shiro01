package com.changgx.servlet;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2016/8/25.
 */
@WebServlet("/formLogin")
public class FormLoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        String msg = null;
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            msg = "账号错误";
        } catch (IncorrectCredentialsException e) {
            msg = "密码错误";
        }
        if(msg!=null){
            req.setAttribute("msg",msg);
            req.getRequestDispatcher("/WEB-INF/pages/loginFailed.jsp").forward(req, resp);
        }else {
            req.getRequestDispatcher("WEB-INF/pages/loginSuccess.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
