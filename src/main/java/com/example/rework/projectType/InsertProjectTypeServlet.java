package com.example.rework.projectType;

import com.alibaba.fastjson.JSONObject;
import dao.InstitutionTypeDao;
import entity.InstitutionType;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InsertProjectTypeServlet", value = "/InsertProjectTypeServlet")
public class InsertProjectTypeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String projectTypeId=request.getParameter("projectTypeId");
        String projectTypeName=request.getParameter("projectTypeName");
        int i=0;
        InstitutionType type= InstitutionTypeDao.findInstitutionTypeByNo(projectTypeId);
        if(type==null)//如果存在，说明是编辑；没有就是添加新的机构类型信息
        {
            InstitutionType t=new InstitutionType(projectTypeId,projectTypeName);
            i=InstitutionTypeDao.insert(t);
            System.out.println(t.getTrainingInstitutionNo()+" "+t.getTrainingInstitutionName());
        }
        else
        {
            InstitutionType t=new InstitutionType(projectTypeId,projectTypeName);
            i=InstitutionTypeDao.update(t);
            System.out.println(t.getTrainingInstitutionNo()+" "+t.getTrainingInstitutionName());
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
