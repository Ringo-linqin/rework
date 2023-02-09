package dao;

import entity.AccountPasswordTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ysr
 * @description 账户密码表DAO
 * @date 2022/11/29 19:28
 */
public class AccountPasswordTableDAO extends DAO {

    public static int insert(AccountPasswordTable s) {
        Connection conn = getConn();
        try {
            String id = s.getId();
            String institutionNo = s.getInstitutionNo();
            String managerTypeNo = s.getManagerTypeNo();
            String password = s.getPassword();
            String name = s.getName();
            System.out.println(s);
            String sql = "insert into accountPasswordTable(id,InstitutionNo,managerTypeNo,password,name) values (?,?,?,?,?)";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, id);
            p.setString(2, institutionNo);
            p.setString(3, managerTypeNo);
            p.setString(4, password);
            p.setString(5, name);
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


    /**
     * @param id
     * @return AccountPasswordTable
     * @description
     * @date 2022/11/30
     */
    public static AccountPasswordTable findAccountPasswordTableById(String id) {

        Connection conn = getConn();
        String sql = "select * from accountPasswordTable where id=?";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, id);
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String institutionNo = set.getString("InstitutionNo");
                String managerTypeNo = set.getString("managerTypeNo");
                String password = set.getString("password");
                String name = set.getString("name");
                AccountPasswordTable c = new AccountPasswordTable(id, institutionNo, managerTypeNo, password, name);
                return c;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
        return null;
    }

    /**
     * @param institutionNo
     * @return List<entity.AccountPasswordTable>
     * @description 通过机构标识查找数据库
     * @date 2022/11/30
     */
    public static List<AccountPasswordTable> findAccountPasswordTableByInsNo(String institutionNo) {

        Connection conn = getConn();
        List<AccountPasswordTable> results = new ArrayList<>();
        String sql = "select * from accountPasswordTable where InstitutionNo=?";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, institutionNo);
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String id = set.getString("id");
                String managerTypeNo = set.getString("managerTypeNo");
                String password = set.getString("password");
                String name = set.getString("name");
                AccountPasswordTable c = new AccountPasswordTable(id, institutionNo, managerTypeNo, password, name);
                results.add(c);
            }
            return results;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }

    /**
     * @param
     * @return List<AccountPasswordTable>
     * @description 查找数据库所有账户密码记录
     * @date 2022/11/30
     */
    public static List<AccountPasswordTable> allAccountPasswordTable() {

        Connection conn = getConn();
        List<AccountPasswordTable> results = new ArrayList<>();
        String sql = "select * from accountPasswordTable ";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String id = set.getString("id");
                String institutionNo = set.getString("InstitutionNo");
                String managerTypeNo = set.getString("managerTypeNo");
                String password = set.getString("password");
                String name = set.getString("name");
                AccountPasswordTable c = new AccountPasswordTable(id, institutionNo, managerTypeNo, password, name);
                results.add(c);
            }
            return results;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }

    public static int delete(String id) {
        Connection conn = getConn();
        try {
            String sql = "delete from accountPasswordTable where id=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, id);
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

    /**
     * @param s
     * @return int
     * @description 更新数据库
     * @date 2022/11/30
     */
    public static int update(AccountPasswordTable s) {

        Connection conn = getConn();
        try {
            String id = s.getId();
            String institutionNo = s.getInstitutionNo();
            String managerTypeNo = s.getManagerTypeNo();
            String password = s.getPassword();
            String name = s.getName();
            String sql = "update accountPasswordTable set InstitutionNo=?,managerTypeNo=?,password=?,name=? where id=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(5, id);
            p.setString(1, institutionNo);
            p.setString(2, managerTypeNo);
            p.setString(3, password);
            p.setString(4, name);
            int n = p.executeUpdate();
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

//    public static void main(String[] args) {
//        // 测试
//        AccountPasswordTable c = new AccountPasswordTable("11", "0", "0", "1234", "null");
//        insert(c);
//        AccountPasswordTable b = new AccountPasswordTable("11", "1", "0", "1234", "null");
//        update(b);
//        List<AccountPasswordTable> od = allAccountPasswordTable();
//        ;
//        for (AccountPasswordTable a : od) {
//            System.out.println(a);
//        }
//        delete("11");
//    }

}
