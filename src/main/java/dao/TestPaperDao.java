package dao;

import entity.TestPaper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//试卷DAO
public class TestPaperDao extends DAO{
    //增
    public static int insertPaper(TestPaper t) {
        Connection conn = getConn();
        try {
            String sql = "insert into testPaper(testPaperNo,InstitutionNo,trainingPlanNo,testPaperName,testPaperTime,testLength) values (?,?,?,?,?,?)";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, t.getTestPaperNo());//试卷号
            p.setString(2, t.getInstitutionNo());//业主计划编号
            p.setString(3, t.getTrainingPlanNo());//培训计划编号
            p.setString(4, t.getTestPaperName());//试卷名称
            p.setDate(5, (java.sql.Date) t.getTestPaperTime());//考试时间
            p.setDate(6, (java.sql.Date) t.getTestLength());//考试时长
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
    //根据业主机构编号和试卷号删除
    public static int deletePaper(String testPaperNo,String InstitutionNo) {
        Connection conn = getConn();
        try {
            String sql = "delete from testPaper  where testPaperNo=? and InstitutionNo=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1,  testPaperNo);
            p.setString(2,  InstitutionNo);
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
    //改(修改除试卷号和业主机构编号以外的）
    public static int updatePaper(TestPaper t) {
        Connection conn = getConn();
        try {
            String sql = "update testPaper set trainingPlanNo=?,testPaperName=?,testPaperTime=?," +
                    "testLength=? where testPaperNo=? and InstitutionNo=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1,t.getTrainingPlanNo());
            p.setString(2, t.getTestPaperName());
            p.setDate(3, (Date) t.getTestPaperTime());
            p.setDate(4, (Date) t.getTestLength());
            p.setString(5,t.getTestPaperNo());
            p.setString(6,t.getInstitutionNo());
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

    //模糊查询
    public static List<TestPaper> searchPaper(String key)
    {
        List<TestPaper> papers = new ArrayList<TestPaper>();
        Connection conn = getConn();
        String sql = "select * from testPaper where testPaperNo like ? or InstitutionNo like ? or trainingPlanNo like ? or testPaperName like ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + key + "%");
            ps.setString(2, "%" + key + "%");
            ps.setString(3, "%" + key + "%");
            ps.setString(4, "%" + key + "%");
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                String no = result.getString("testPaperNo");
                String ino = result.getString("InstitutionNo");
                String  pno = result.getString("trainingPlanNo");
                String  name = result.getString("testPaperName");
                Date paperTime=result.getDate("testPaperTime");
                Date testLength=result.getDate("testLength");
                TestPaper t=new TestPaper(no,ino,pno,name,paperTime,testLength);
                papers.add(t);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return papers;
    }

}
