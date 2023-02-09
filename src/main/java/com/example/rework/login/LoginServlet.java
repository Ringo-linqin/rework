package com.example.rework.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        // 接收表单信息
        String userid = request.getParameter("userid");//获取用户类别
        String username = request.getParameter("user");
        String password = request.getParameter("password");
        System.out.println(username+" "+password);
        // 设置回显
        request.setAttribute("user", username);
        request.setAttribute("password", password);
//        if(userid.equals("root"))
//        {
//            Customer c=CustomerLoginDAO.customerLoginJudge(username,password);
//            if(c!=null)
//            {
//                response.getWriter()
//                        .write("<script> window.location = 'customerMenu.html'; window.sessionStorage.setItem('user','"+username+"');</script>");
//                response.getWriter().flush();
//
//                //request.getRequestDispatcher("customerMenu.html").forward(request, response);
//            }
//            else
//            {
//                response.getWriter()
//                        .write("<script>alert('登录失败，密码错误！'); window.location = 'login.html'; window.close();</script>");
//                response.getWriter().flush();
//            }
//        }
//        else
//        {
//            Manager m=ManagerDAO.searchManagerByIdAndPassword(username, password);
//            if(m!=null)
//            {
//                request.getRequestDispatcher("managerMenu.html").forward(request, response);
//            }
//            else
//            {
//                response.getWriter()
//                        .write("<script>alert('登录失败，密码错误！'); window.location = 'login.html'; window.close();</script>");
//                response.getWriter().flush();
//            }
    }
}
