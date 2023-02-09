package com.example.rework.institution;

import com.alibaba.fastjson.JSONObject;
import dao.InstitutionDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DeleteInstitutionServlet", value = "/DeleteInstitutionServlet")
public class DeleteInstitutionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String institutionId=request.getParameter("institutionId");
        int i= InstitutionDao.delete(institutionId);
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
