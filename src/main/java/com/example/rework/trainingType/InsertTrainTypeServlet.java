package com.example.rework.trainingType;

import com.alibaba.fastjson.JSONObject;
import dao.InstitutionTypeDao;
import dao.TrainingTypeDao;
import entity.InstitutionType;
import entity.TrainingType;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InsertTrainTypeServlet", value = "/InsertTrainTypeServlet")
public class InsertTrainTypeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String trainTypeId=request.getParameter("trainTypeId");
        String trainTypeName=request.getParameter("trainTypeName");
        int i=0;
        TrainingType type= TrainingTypeDao.findTrainingTypeByNo(trainTypeId);
        if(type==null)//如果存在，说明是编辑；没有就是添加新的培训类型信息
        {
            TrainingType t=new TrainingType(trainTypeId,trainTypeName);
            i=TrainingTypeDao.insertTrainType(t);
        }
        else
        {
            TrainingType t=new TrainingType(trainTypeId,trainTypeName);
            i=TrainingTypeDao.updateTrainType(t);
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
