package dao;

import entity.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * @author swh
 */
public class QuestionOptionsDao extends DAO{
    public static int insert(QuestionOptions s) {
        Connection conn = getConn();
        try {
            String questionNo = s.getQuestionNo();
            String questionContent = s.getQuestionContent();
            String questionOption = s.getQuestionOption();
            String sql = "insert into questionOptions(questionNo,questionOption,questionContent) values (?,?,?)";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, questionNo);

            p.setString(2, questionOption);
            p.setString(3, questionContent);
            int n=p.executeUpdate();
            p.close();
            conn.close();
            return n;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("数据插入失败！");
        }
        return 0;
    }

    public static List<QuestionOptions> findQuestionOptionsByNo(String questionNo) {
        Connection conn = getConn();
        List<QuestionOptions> results = new ArrayList<>();
        String sql = "select * from questionOptions where questionNo=?";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1,questionNo);
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String option = set.getString("questionOption");
                String Content = set.getString("questionContent");
                QuestionOptions c = new QuestionOptions(questionNo,option,Content);
                results.add(c);
            }
            return results;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }


    public static int delete(String questionNo) {
        Connection conn = getConn();
        try {
            String sql = "delete from questionOptions  where questionNo=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, questionNo);
            int n=p.executeUpdate();
            p.close();
            conn.close();
            return n;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("信息删除失败！");
        }
        return 0;
    }

    public static int update(QuestionOptions s) {
        Connection conn = getConn();
        try {
            String questionNo = s.getQuestionNo();
            String questionContent = s.getQuestionContent();
            String questionOption = s.getQuestionOption();
            String sql = "update  questionOptions  set questionContent =? where questionNo =? and questionOption=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, questionContent);
            p.setString(2, questionNo);
            p.setString(3, questionOption);
            int n= p.executeUpdate();
            p.close();
            conn.close();
            return n;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("更新失败！");
        }
        return 0;
    }
    public static void main(String[] args) {
      /*  QuestionOptions c =new  QuestionOptions("1","B","你是傻冒啊");
        insert(c);*/
       /* QuestionOptions c =new  QuestionOptions("1","B","我是傻冒啊");
        update(c);*/
     /*  List<QuestionOptions> od =  findQuestionOptionsByNo(’1‘);
        for (QuestionType a : od) {
            System.out.println(a);
        }
         delete("11");
       */
    }
}
