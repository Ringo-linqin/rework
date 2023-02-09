package com.example.rework.trainingType;

import com.alibaba.fastjson.JSONObject;
import dao.TrainingTypeDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DeleteTrainTypeServlet", value = "/DeleteTrainTypeServlet")
public class DeleteTrainTypeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String trainTypeId=request.getParameter("trainTypeId");
        int i= TrainingTypeDao.deleteTrainType(trainTypeId);
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
