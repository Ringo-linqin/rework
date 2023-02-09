package dao;

import entity.AccountPasswordTable;
import entity.ManagerType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ysr
 * @description 管理员类型DAO
 * @date 2022/11/29 17:09
 */
public class ManagerTypeDAO extends DAO {


    public static int insert(ManagerType s) {
        Connection conn = getConn();
        try {
            String name = s.getManagerTypeName();
            String no = s.getManagerTypeNo();
            System.out.println(s);
            String sql = "insert into managerType(managerTypeNo,managerTypeName) values (?,?)";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, no);
            p.setString(2, name);
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
     * @param managerTypeNo
     * @return ManagerType
     * @description 通过唯一标识查询数据库
     * @date 2022/11/30
     */
    public static ManagerType findManagerTypeByNo(String managerTypeNo) {
        Connection conn = getConn();
        String sql = "select * from managerType where managerTypeNo=?";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, managerTypeNo);
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String name = set.getString("managerTypeName");
                ManagerType c = new ManagerType(managerTypeNo, name);
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
     * @return List<ManagerType>
     * @description 查找数据库所有管理员类型记录
     * @date 2022/11/30
     */
    public static List<ManagerType> allManagerType() {

        Connection conn = getConn();
        List<ManagerType> results = new ArrayList<>();
        String sql = "select * from managerType ";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String ManagerTypeNo = set.getString("managerTypeNo");
                String name = set.getString("managerTypeName");
                ManagerType c = new ManagerType(ManagerTypeNo, name);
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
     * @param managerTypeNo
     * @return int
     * @description 根据唯一标识删除
     * @date 2022/11/30
     */
    public static int delete(String managerTypeNo) {

        Connection conn = getConn();
        try {
            String sql = "delete from managerType  where managerTypeNo=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, managerTypeNo);
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
     * @description 根据唯一标识更新
     * @date 2022/11/30
     */
    public static int update(ManagerType s) {

        Connection conn = getConn();
        try {
            String no = s.getManagerTypeNo();
            String name = s.getManagerTypeName();
            String sql = "update managerType set managerTypeName=? where managerTypeNo =?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(2, no);
            p.setString(1, name);
            int n = p.executeUpdate();
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

//    public static void main(String[] args) {
//
//        ManagerType c = new ManagerType("3", "test");
//        insert(c);
//        ManagerType d = new ManagerType("4", "test2");
//        update(d);
//
//        List<ManagerType> od = allManagerType();
//        ;
//        for (ManagerType m : od) {
//            System.out.println(c);
//        }
//        delete("4");
//    }


}
