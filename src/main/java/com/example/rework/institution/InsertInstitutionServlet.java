package com.example.rework.institution;

import com.alibaba.fastjson.JSONObject;
import dao.InstitutionDao;
import entity.Institution;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InsertInstitutionServlet", value = "/InsertInstitutionServlet")
public class InsertInstitutionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String institutionId=request.getParameter("institutionId");
        String institutionName=request.getParameter("institutionName");
        String institutionTypeId=request.getParameter("trainingInstitutionTypeId");
        String institutionIntroduction=request.getParameter("institutionIntroduction");
        System.out.println(institutionId+"  "+institutionName+" "+institutionTypeId+" "+institutionIntroduction);
        int i=0;
        Institution  ins= InstitutionDao.findInstitutionByNo(institutionId);
        if(ins==null)//如果存在，说明是编辑；没有就是添加新的信息
        {
            Institution in=new Institution(institutionId,institutionTypeId,institutionName,institutionIntroduction);
            i=InstitutionDao.insert(in);
            System.out.println("添加成功");
        }
        else
        {
            Institution in=new Institution(institutionId,institutionTypeId,institutionName,institutionIntroduction);
            i=InstitutionDao.update(in);
            System.out.println("更新成功！");
        }
        JSONObject json=new JSONObject();
        json.put("code", i);
        PrintWriter pw=response.getWriter();
        pw.print(json);
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
