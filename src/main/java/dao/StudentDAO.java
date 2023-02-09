package dao;

import entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ysr
 * @description 学员DAO类
 * @date 2022/11/29 19:29
 */
public class StudentDAO extends DAO {

    public static int insert(Student s) {
        Connection conn = getConn();
        try {
            String no = s.getStudentNo();
            String institutionNo = s.getInstitutionNo();
            String name = s.getStudentName();
            String sex = s.getStudentSex();
            int age = s.getStudentAge();
            String phone = s.getStudentPhone();
            byte[] photo = s.getStudentPhoto();
            String id = s.getStudentId();
            String key = s.getStudentKey();
            System.out.println(s);
            String sql =
                    "insert into student(studentNo,InstitutionNo,studentName,studentSex,studentAge,studentPhone,studentPhoto,studentId,studentKey) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, no);
            p.setString(2, institutionNo);
            p.setString(3, name);
            p.setString(4, sex);
            p.setInt(5, age);
            p.setString(6, phone);
            p.setBytes(7, photo);
            p.setString(8, id);
            p.setString(9, key);
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
     * @param no
     * @return Student
     * @description 通过唯一标识studentNo精准查找某学员记录
     * @date 2022/11/30
     */
    public static Student findStudentByNo(String no) {

        Connection conn = getConn();
        String sql = "select * from student where studentNo=?";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, no);
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String institutionNo = set.getString("InstitutionNo");
                String name = set.getString("studentName");
                String sex = set.getString("studentSex");
                int age = set.getInt("studentAge");
                String phone = set.getString("studentPhone");
                byte[] photo = set.getBytes("studentPhoto");
                String id = set.getString("studentId");
                String key = set.getString("studentKey");

                Student c = new Student(no, institutionNo, name, sex, age, phone, photo, id, key);
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
     * @return List<Student>
     * @description 通过机构精准查找多条学员记录
     * @date 2022/11/30
     */
    public static List<Student> findStudentByInsNo(String institutionNo) {
        Connection conn = getConn();
        List<Student> results = new ArrayList<>();
        String sql = "select * from student where InstitutionNo=?";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, institutionNo);
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String no = set.getString("no");
                String name = set.getString("studentName");
                String sex = set.getString("studentSex");
                int age = set.getInt("studentAge");
                String phone = set.getString("studentPhone");
                byte[] photo = set.getBytes("studentPhoto");
                String id = set.getString("studentId");
                String key = set.getString("studentKey");
                Student c = new Student(no, institutionNo, name, sex, age, phone, photo, id, key);
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
     * @param name
     * @return List<Student>
     * @description 通过姓名精准查找多条学员记录
     * @date 2022/11/30
     */
    public static List<Student> findStudentByName(String name) {
        Connection conn = getConn();
        List<Student> results = new ArrayList<>();
        String sql = "select * from student where studentName=?";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, name);
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String no = set.getString("no");
                String institutionNo = set.getString("InstitutionNo");
                String sex = set.getString("studentSex");
                int age = set.getInt("studentAge");
                String phone = set.getString("studentPhone");
                byte[] photo = set.getBytes("studentPhoto");
                String id = set.getString("studentId");
                String key = set.getString("studentKey");
                Student c = new Student(no, institutionNo, name, sex, age, phone, photo, id, key);
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
     * @return List<Student>
     * @description 查询所有学员记录
     * @date 2022/11/30
     */
    public static List<Student> AllStudent() {

        Connection conn = getConn();
        List<Student> results = new ArrayList<>();
        String sql = "select * from student ";
        try {
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet set = p.executeQuery();
            while (set.next()) {
                String no = set.getString("no");
                String institutionNo = set.getString("InstitutionNo");
                String name = set.getString("studentName");
                String sex = set.getString("studentSex");
                int age = set.getInt("studentAge");
                String phone = set.getString("studentPhone");
                byte[] photo = set.getBytes("studentPhoto");
                String id = set.getString("studentId");
                String key = set.getString("studentKey");
                Student c = new Student(no, institutionNo, name, sex, age, phone, photo, id, key);
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
            String sql = "delete from student where studentNo=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, no);
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

    public static int update(Student s) {
        Connection conn = getConn();
        try {
            String no = s.getStudentNo();
            String institutionNo = s.getInstitutionNo();
            String name = s.getStudentName();
            String sex = s.getStudentSex();
            int age = s.getStudentAge();
            String phone = s.getStudentPhone();
            byte[] photo = s.getStudentPhoto();
            String id = s.getStudentId();
            String key = s.getStudentKey();
            String sql = "update student set InstitutionNo=?,studentName=?,studentSex=?,studentAge=?,studentPhone=?,studentPhoto=?,studentId=?,studentKey=? where studentNo=?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(9, no);
            p.setString(1, institutionNo);
            p.setString(2, name);
            p.setString(3, sex);
            p.setInt(4, age);
            p.setString(5, phone);
            p.setBytes(6, photo);
            p.setString(7, id);
            p.setString(8, key);
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
//        Student c = new Student("11", "0","",
//                "",20,"",null,
//                "1111","2222");
//        insert(c);
//        Student d = new Student("11", "0","",
//                "",100,"",null,
//                "1111","2222");
//        update(d);
//
//        List<Student> od = AllStudent();
//        for (Student m : od) {
//            System.out.println(c);
//        }
//        delete("11");
//    }


}
