package com.example.rework.tainingPlan;

import com.alibaba.fastjson.JSONObject;
import dao.InstitutionDao;
import dao.TrainingPlanDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DeleteTrainingPlanServlet", value = "/DeleteTrainingPlanServlet")
public class DeleteTrainingPlanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String trainingPlanNo=request.getParameter("trainingPlanNo");
        int i= TrainingPlanDao.deletePlan(trainingPlanNo);
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
