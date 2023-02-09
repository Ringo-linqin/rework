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
public class QuestionTypeDao extends DAO {


    public static int insert(QuestionType s) {
        Connection conn = getConn();
        try {
            String name = s.getQuestionTypeName();
            String no = s.getQuestionTypeNo();
            System.out.println(s);
            String sql = "insert into questionType(questionTypeNo,questionTypeName) values (?,?)";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, no);
            p.setString(2, name);
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


    public static QuestionType findQuestionTypeByNo(String questionTypeNo) {
        Connection conn = getConn();
        String sql = "select * from questionType where questionTypeNo=?";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, questionTypeNo);
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String No = set.getString("questionTypeNo");
                String name = set.getString("questionTypeName");
                QuestionType c = new QuestionType(No, name);
                return c;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public static List<QuestionType> allQuestionType() {
        Connection conn = getConn();
        List<QuestionType> results = new ArrayList<>();
        String sql = "select * from questionType ";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String No = set.getString("questionTypeNo");
                String name = set.getString("questionTypeName");
                QuestionType c = new QuestionType(No, name);
                results.add(c);
            }
            return results;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }


    public static int delete(String questionTypeNo) {
        Connection conn = getConn();
        try {
            String sql = "delete from questionType  where questionTypeNo=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, questionTypeNo);
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


    public static int update(QuestionType s) {
        Connection conn = getConn();
        try {
            String name = s.getQuestionTypeName();
            String no = s.getQuestionTypeNo();
            String sql = "update  questionType  set questionTypeName =? where questionTypeNo =?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, name);
            p.setString(2, no);
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
        /*QuestionType c =new  QuestionType ("11","选择题");
        insert(c);
       QuestionType b =new  QuestionType ("11","判断题");
        update(b);
        List<QuestionType> od =  allQuestionType();;
        for (QuestionType a : od) {
            System.out.println(a);
        }
         delete("11");
       */
    }

}

