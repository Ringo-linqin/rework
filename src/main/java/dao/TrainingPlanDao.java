package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import entity.*;

//培训计划DAO
public class TrainingPlanDao extends DAO{

    //增
    public static int insertPlan(TrainingPlan t) {
        Connection conn = getConn();
        try {
            String ino = t.getInstitutionNo();//业主计划编号
            String tno = t.getTrainingPlanNo();//培训计划编号
            String typeNo=t.getTrainingTypeNo();//培训计划类别编号
            String tName=t.getTrainingPlanName();//培训计划名称
            String period=t.getTrainingPeriod();//培训周期
//            Date startTime=t.getTrainingStartTime();//开始时间
            Timestamp  startTime=new Timestamp(t.getTrainingStartTime().getTime());
//            Date endTime=t.getTrainingEndTime();//结束时间
            Timestamp  endTime=new Timestamp(t.getTrainingEndTime().getTime());
            String sql = "insert into trainingPlan(InstitutionNo,trainingPlanNo,trainingTypeNo,trainingPlanName,trainingPeriod,trainingStartTime,trainingEndTime) values (?,?,?,?,?,?,?)";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, ino);
            p.setString(2, tno);
            p.setString(3, typeNo);
            p.setString(4, tName);
            p.setString(5, period);
            p.setTimestamp(6, startTime);
            p.setTimestamp(7, endTime);
            int i= p.executeUpdate();
            p.close();
            conn.close();
            return i;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("数据插入失败！");
            return 0;
        }
    }
    //删(通过培训计划编号)
    public static int deletePlan(String trainingPlanNo) {
        Connection conn = getConn();
        try {
            String sql = "delete from trainingPlan  where trainingPlanNo=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, trainingPlanNo);
            int i=p.executeUpdate();
            p.close();
            conn.close();
            return i;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("信息删除失败！");
            return 0;
        }
    }

    //改
    public static int updatePlan(TrainingPlan t) {
        Connection conn = getConn();
        try {
            String sql = "update trainingPlan set InstitutionNo =? ,trainingPlanNo=?,trainingTypeNo=?,trainingPlanName=?," +
                    "trainingPeriod=?,traingStartTime=?,traingEndtime=? where trainingPlanNo=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, t.getInstitutionNo());//业主计划编号
            p.setString(2,  t.getTrainingPlanNo());//培训计划编号
            p.setString(3, t.getTrainingTypeNo());//培训计划类别编号
            p.setString(4, t.getTrainingPlanName());//培训计划名称
            p.setString(5, t.getTrainingPeriod());//培训周期
            p.setDate(6, (java.sql.Date)t.getTrainingStartTime());//开始时间
            p.setDate(7, (java.sql.Date)t.getTrainingEndTime());//结束时间
            p.setString(8,t.getTrainingPlanNo());//培训计划编号
            int i=p.executeUpdate();
            p.close();
            conn.close();
            return i;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("更新失败！");
            return 0;
        }
    }
    //根据培训计划编号查询计划
    public static TrainingPlan findPlanByPlanNo(String trainingPlanNo){
        Connection conn = getConn();
        String sql = "select * from  trainingPlan where trainingPlanNo = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,  trainingPlanNo);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                String ino = result.getString("InstitutionNo");
                String tno = result.getString("trainingPlanNo");
                String typeNo = result.getString("trainingTypeNo");
                String tName = result.getString("trainingPlanName");
                String period = result.getString("trainingPeriod");
                Date start = result.getDate("trainingStartTime");
                Date end = result.getDate("trainingEndTime");
                TrainingPlan t = new TrainingPlan(ino, tno, typeNo, tName, period, start, end);
                return t;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    //模糊查询
    public static List<TrainingPlan> searchPlan(String key)
    {
        List<TrainingPlan> plans = new ArrayList<TrainingPlan>();
        Connection conn = getConn();
        String sql = "select * from trainingPlan where InstitutionNo like ? or trainingPlanNo like ? or trainingTypeNo like ? or trainingPlanName like ? or trainingPeriod like ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + key + "%");
            ps.setString(2, "%" + key + "%");
            ps.setString(3, "%" + key + "%");
            ps.setString(4, "%" + key + "%");
            ps.setString(5, "%" + key + "%");
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                String ino = result.getString("InstitutionNo");
                String tno = result.getString("trainingPlanNo");
                String typeNo = result.getString("trainingTypeNo");
                String tName = result.getString("trainingPlanName");
                String period = result.getString("trainingPeriod");
                Date start=result.getDate("trainingStartTime");
                Date end=result.getDate("trainingEndTime");
                TrainingPlan t=new TrainingPlan(ino,tno,typeNo,tName,period,start,end);
                plans.add(t);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return plans;
    }
}
