package dao;

import entity.TrainingType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//培训类型DAO
public class TrainingTypeDao extends DAO{
    //增
    public static int insertTrainType(TrainingType t) {
        Connection conn = getConn();
        try {
            String no = t.getTrainingTypeNo();/*编号*/
            String name = t.getTrainingTypeName();/*培训类型名称*/
            String sql = "insert into trainingType(trainingTypeNo,trainingTypeName) values (?,?)";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, no);
            p.setString(2, name);
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
    //删(根据培训类型名称）
    public static int deleteTrainType(String trainingTypeNo) {
        Connection conn = getConn();
        try {
            String sql = "delete from trainingType  where trainingTypeNo=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1,  trainingTypeNo);
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
    public static int updateTrainType(TrainingType t) {
        Connection conn = getConn();
        try {
            String sql = "update trainingType set trainingTypeName=? where trainingTypeNo=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, t.getTrainingTypeName());//培训类型名称
            p.setString(2, t.getTrainingTypeNo());//编号
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
    //根据编号查
    public static TrainingType findTrainingTypeByNo(String trainingTypeNo){
        Connection conn = getConn();
        String sql = "select * from trainingType where trainingTypeNo=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, trainingTypeNo);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                String no = result.getString("trainingTypeNo");
                String name = result.getString("trainingTypeName");
                TrainingType t=new TrainingType(no,name);
                return t;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    //模糊查询
    public static List<TrainingType> searchTrainType(String key)
    {
        List<TrainingType> types = new ArrayList<TrainingType>();
        Connection conn = getConn();
        String sql = "select * from trainingType where trainingTypeNo like ? or trainingTypeName like ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + key + "%");
            ps.setString(2, "%" + key + "%");
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                String no = result.getString("trainingTypeNo");
                String name = result.getString("trainingTypeName");
                TrainingType t=new TrainingType(no,name);
                types.add(t);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return types;
    }

}
