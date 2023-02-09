package com.example.rework.tainingPlan;

import com.alibaba.fastjson.JSONObject;
import dao.TrainingPlanDao;
import entity.TrainingPlan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "InsertTrainingPlanServlet", value = "/InsertTrainingPlanServlet")
public class InsertTrainingPlanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String institutionNo=request.getParameter("institutionNo");
        String trainingPlanNo=request.getParameter("trainingPlanNo");
        String trainingTypeNo=request.getParameter("trainingTypeNo");
        String trainingPlanName=request.getParameter("trainingPlanName");
        String  StartTime=request.getParameter("trainingStartTime");
        String EndTime=request.getParameter("trainingEndTime");
        StartTime = StartTime.replaceAll("T"," ");
        EndTime = EndTime.replaceAll("T"," ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(StartTime);
        System.out.println(EndTime);
        int i=0;
        try {
            Date trainingStartTime = simpleDateFormat.parse(StartTime);
            Date trainingEndTime = simpleDateFormat.parse(EndTime);
            long from1 = trainingStartTime.getTime();
            long to1 = trainingEndTime.getTime();
            int days = (int) ((to1 - from1) / (1000 * 60 * 60 * 24));
            String period=days+"天";//培训周期
            TrainingPlan tp= new TrainingPlan(institutionNo,trainingPlanNo,trainingTypeNo,trainingPlanName,period,trainingStartTime,trainingEndTime);
            i=TrainingPlanDao.insertPlan(tp);
            System.out.println("添加成功！");
        } catch (ParseException e) {
            throw new RuntimeException(e);
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
