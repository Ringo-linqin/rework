package dao;

import entity.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InstitutionDao extends DAO{


        public static int insert(Institution s) {
            Connection conn = getConn();
            try {
                String name = s.getInstitutionName();
                String no = s.getInstitutionNo();
                String introduce=s.getInstitutionIntroduce();
                String No=s.getTrainingInstitutionNo();
                System.out.println(s);
                String sql = "insert into Institution(InstitutionNo,trainingInstitutionNo,InstitutionName,InstitutionIntroduce) values (?,?,?,?)";
                PreparedStatement p = conn.prepareStatement(sql);
                p.setString(1, no);
                p.setString(2, No);
                p.setString(3, name);
                p.setString(4, introduce);
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

        // 通过No查询
        public static Institution findInstitutionByNo (String InstitutionNo) {
            Connection conn = getConn();
            String sql = "select * from Institution where InstitutionNo=?";
            try {
                PreparedStatement p = conn.prepareStatement(sql);
                p.setString(1, InstitutionNo);
                ResultSet set = p.executeQuery();
                while (set.next()) {
                    String name = set.getString("InstitutionName");
                    String No = set.getString("trainingInstitutionNo");
                    String introduce = set.getString("InstitutionIntroduce");
                    Institution c =new Institution (InstitutionNo,No,name,introduce);
                    return c;
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }
            return null;
        }
        //模糊查询
        public static List<Institution> findInstitution(String key) {
            Connection conn = getConn();
            List<Institution> results = new ArrayList<>();
            String sql = "select * from Institution where InstitutionNo like ? or InstitutionName like ? or trainingInstitutionNo like ? or InstitutionIntroduce like ?";
            try {
                PreparedStatement p = conn.prepareStatement(sql);
                p.setString(1, "%" + key + "%");
                p.setString(2, "%" + key + "%");
                p.setString(3, "%" + key + "%");
                p.setString(4, "%" + key + "%");
                ResultSet set = p.executeQuery();
                while (set.next()) {
                    String InstitutionNo = set.getString("InstitutionNo");
                    String name = set.getString("InstitutionName");
                    String No = set.getString("trainingInstitutionNo");
                    String introduce = set.getString("InstitutionIntroduce");
                    Institution c =new Institution (InstitutionNo,No,name,introduce);
                    results.add(c);
                }
                return results;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }
        }

        public static List<Institution> allInstitution() {
            Connection conn = getConn();
            List<Institution> results = new ArrayList<>();
            String sql = "select * from Institution ";
            try {
                PreparedStatement p = conn.prepareStatement(sql);
                ResultSet set = p.executeQuery();
                while (set.next()) {
                    String InstitutionNo = set.getString("InstitutionNo");
                    String name = set.getString("InstitutionName");
                    String No = set.getString("trainingInstitutionNo");
                    String introduce = set.getString("InstitutionIntroduce");
                    Institution c =new Institution (InstitutionNo,No,name,introduce);
                    results.add(c);
                }
                return results;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }
        }

        // 根据No删除
        public static int delete(String InstitutionNo) {
            Connection conn = getConn();
            try {
                String sql = "delete from Institution  where InstitutionNo=?";
                PreparedStatement p = conn.prepareStatement(sql);
                p.setString(1, InstitutionNo);
                int n = p.executeUpdate();
                p.close();
                conn.close();
                return n;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                System.out.println("信息删除失败！");
            }
            return 0;
        }


    public static int update(Institution s) {
            Connection conn = getConn();
            try {
                String no = s.getInstitutionNo();
                String name = s.getInstitutionName();
                String introduce=s.getInstitutionIntroduce();
                String No=s.getTrainingInstitutionNo();//业主机构类型编码
                String sql = "update Institution set trainingInstitutionNo =? ,InstitutionName=?,InstitutionIntroduce=? where InstitutionNo=?";
                PreparedStatement p = conn.prepareStatement(sql);
                p.setString(1, No);
                p.setString(2, name);
                p.setString(3, introduce);
                p.setString(4, no);
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

        //Institution c =new Institution ("11","22","机构名","机构机构");
         //   insert(c);
        /*Institution d =new Institution ("11","11","黑马","计算机培训机构");
        update(d);*/
        /*
        List<Institution> od =  allInstitution();;
        for (Institution c : od) {
            System.out.println(c);
        }*/
        //delete("11");
    }

}
