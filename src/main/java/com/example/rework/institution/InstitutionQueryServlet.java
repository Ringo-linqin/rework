package com.example.rework.institution;

import com.alibaba.fastjson.JSONObject;
import dao.InstitutionDao;
import entity.Institution;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "InstitutionQueryServlet", value = "/InstitutionQueryServlet")
public class InstitutionQueryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        JSONObject json = new JSONObject();
        List<Institution> pt = InstitutionDao.findInstitution(key);
        json.put("institutions", pt);
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw;
        try {
            pw = response.getWriter();
            pw.print(json);
            pw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
