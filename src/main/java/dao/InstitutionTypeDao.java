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
public class InstitutionTypeDao extends DAO {

    public static int insert(InstitutionType s) {
        Connection conn = getConn();
        try {
            String name = s.getTrainingInstitutionName();
            String no = s.getTrainingInstitutionNo();
            System.out.println(s);
            String sql = "insert into institutionType(trainingInstitutionNo,trainingInstitutionName) values (?,?)";
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

    public static InstitutionType findInstitutionTypeByNo(String InstitutionTypeNo) {
        Connection conn = getConn();
        String sql = "select * from institutionType where trainingInstitutionNo=?";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, InstitutionTypeNo);
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String No = set.getString("trainingInstitutionNo");
                String name = set.getString("trainingInstitutionName");
                InstitutionType c = new InstitutionType(No, name);
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
    public static List<InstitutionType> findInstitution(String key){
        Connection conn = getConn();
        List<InstitutionType> types=new ArrayList<>();
        String sql = "select * from institutionType where trainingInstitutionNo like ? or trainingInstitutionName like ?";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, "%"+key+"%");
            p.setString(2, "%"+key+"%");
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String No = set.getString("trainingInstitutionNo");
                String name = set.getString("trainingInstitutionName");
                InstitutionType c = new InstitutionType(No, name);
                System.out.println(c.getTrainingInstitutionNo()+" "+c.getTrainingInstitutionName());
                types.add(c);
            }
            return types;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
    public static List<InstitutionType> allInstitutionType() {
        Connection conn = getConn();
        List<InstitutionType> results = new ArrayList<>();
        String sql = "select * from institutionType ";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String No = set.getString("trainingInstitutionNo");
                String name = set.getString("trainingInstitutionName");
                InstitutionType c = new InstitutionType(No, name);
                results.add(c);
            }
            return results;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }


    public static int delete(String InstitutionTypeNo) {
        Connection conn = getConn();
        try {
            String sql = "delete from institutionType  where trainingInstitutionNo=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, InstitutionTypeNo);
            int n= p.executeUpdate();
            p.close();
            conn.close();
            return n;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("信息删除失败！");

        }
        return 0;
    }

    public static int update(InstitutionType s) {
        Connection conn = getConn();
        try {
            String name = s.getTrainingInstitutionName();
            String no = s.getTrainingInstitutionNo();
            String sql = "update  institutionType  set trainingInstitutionName =? where trainingInstitutionNo =?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, name);
            p.setString(2, no);
            int n=p.executeUpdate();
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

}

