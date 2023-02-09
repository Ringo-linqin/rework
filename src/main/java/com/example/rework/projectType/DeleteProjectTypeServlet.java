package com.example.rework.projectType;

import com.alibaba.fastjson.JSONObject;
import dao.InstitutionTypeDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DeleteProjectTypeServlet", value = "/DeleteProjectTypeServlet")
public class DeleteProjectTypeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String projectTypeId=request.getParameter("projectTypeId");
        int i= InstitutionTypeDao.delete(projectTypeId);
        JSONObject json=new JSONObject();
        json.put("code", i);
        try {
            PrintWriter pw=response.getWriter();
            pw.print(json);
            pw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
