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
public class QuestionDao extends DAO{

    public static int insert(Question s) {
        Connection conn = getConn();
        try {
            String no = s.getQuestionNo();
            String institutionNo = s.getInstitutionNo();
            String answer = s.getQuestionCorrectAnswer();
            float score = s.getQuestionScore();
            String difficulty = s.getQuestionDifficulty();
            String questionContent = s.getQuestionContent();
            String typeNo = s.getQuestionTypeNo();
            System.out.println(s);
            String sql = "insert into question(questionNo,InstitutionNo,questionTypeNo,questionContent,questionCorrectAnswer,questionScore,questionDifficulty) values (?,?,?,?,?,?,?)";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, no);
            p.setString(2, institutionNo);
            p.setString(3, answer);
            p.setFloat(4, score);
            p.setString(5, difficulty);
            p.setString(6, questionContent);
            p.setString(7, typeNo);
            int n = p.executeUpdate();
            p.close();
            conn.close();
            return n;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("数据插入失败！");
        }
        return 0;
    }

        public static Question findQuestionByNo(String no) {
            Connection conn = getConn();
            String sql = "select * from question where questionNo=?";
            try {
                PreparedStatement p = conn.prepareStatement(sql);
                p.setString(1, no);
                ResultSet set = p.executeQuery();
                while (set.next()) {
                    String institutionNo = set.getString("InstitutionNo");
                    String questionTypeNo = set.getString("questionTypeNo");
                    String questionContent = set.getString("questionContent");
                    String questionCorrectAnswer = set.getString("questionCorrectAnswer");
                    float questionScore = set.getFloat("questionScore");
                    String questionDifficulty = set.getString("questionDifficulty");
                    Question c = new Question(no, institutionNo, questionCorrectAnswer, questionScore, questionDifficulty, questionContent, questionTypeNo);
                    return c;
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }
            return null;
        }

    public static List<Question> findTypeQuestion(String type) {
        Connection conn = getConn();
        List<Question> results = new ArrayList<>();
        String sql = "select * from question where questionTypeNo=?";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, type);
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String no= set.getString("questionNo");
                String institutionNo = set.getString("InstitutionNo");
                String questionTypeNo = set.getString("questionTypeNo");
                String questionContent = set.getString("questionContent");
                String questionCorrectAnswer = set.getString("questionCorrectAnswer");
                float questionScore = set.getFloat("questionScore");
                String questionDifficulty = set.getString("questionDifficulty");
                Question c = new Question(no, institutionNo, questionCorrectAnswer, questionScore, questionDifficulty, questionContent, questionTypeNo);
                results.add(c);
            }
            return results;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }

        public static List<Question> findAllQuestion() {
            Connection conn = getConn();
            List<Question> results = new ArrayList<>();
            String sql = "select * from question ";
            try {
                PreparedStatement p = conn.prepareStatement(sql);
                ResultSet set = p.executeQuery();
                while (set.next()) {
                    String no= set.getString("questionNo");
                    String institutionNo = set.getString("InstitutionNo");
                    String questionTypeNo = set.getString("questionTypeNo");
                    String questionContent = set.getString("questionContent");
                    String questionCorrectAnswer = set.getString("questionCorrectAnswer");
                    float questionScore = set.getFloat("questionScore");
                    String questionDifficulty = set.getString("questionDifficulty");
                    Question c = new Question(no, institutionNo, questionCorrectAnswer, questionScore, questionDifficulty, questionContent, questionTypeNo);
                    results.add(c);
                }
                return results;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }

        }

        public static int delete(String no) {
            Connection conn = getConn();
            try {
                String sql = "delete from question where questionNo=?";
                PreparedStatement p = conn.prepareStatement(sql);
                p.setString(1, no);
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

        public static int update(Question s) {
            Connection conn = getConn();
            try {
                String no = s.getQuestionNo();
                String institutionNo = s.getInstitutionNo();
                String answer = s.getQuestionCorrectAnswer();
                float score = s.getQuestionScore();
                String difficulty = s.getQuestionDifficulty();
                String questionContent = s.getQuestionContent();
                String typeNo = s.getQuestionTypeNo();
                String sql = "update question set InstitutionNo=?,questionTypeNo=?,questionContent=?,questionCorrectAnswer=?,questionScore=?,questionDifficulty=? where questionNo=?";
                PreparedStatement p = conn.prepareStatement(sql);
                p.setString(1, institutionNo);
                p.setString(2, typeNo);
                p.setString(3, questionContent);
                p.setString(4, answer );
                p.setFloat(5, score);
                p.setString(6,difficulty);
                p.setString(7, no);
                int n= p.executeUpdate();
                p.close();
                conn.close();
                return n;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println("信息更新失败！");
            }
            return 0;
        }
    public static void main(String[] args) {
        /*Question c =new  Question ("11","22","3","1","");
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
