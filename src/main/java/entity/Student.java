package entity;

/**
 * @author ysr
 * @description TODO
 * @date 2022/11/29 21:06
 */
public class Student {

    String studentNo;
    String InstitutionNo;
    String studentName;
    String studentSex;
    int studentAge;
    String studentPhone;
    byte[] studentPhoto;
    String studentId;
    String studentKey;

    public Student(String studentNo, String institutionNo, String studentName, String studentSex, int studentAge, String studentPhone, byte[] studentPhoto, String studentId, String studentKey) {
        this.studentNo = studentNo;
        InstitutionNo = institutionNo;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentAge = studentAge;
        this.studentPhone = studentPhone;
        this.studentPhoto = studentPhoto;
        this.studentId = studentId;
        this.studentKey = studentKey;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getInstitutionNo() {
        return InstitutionNo;
    }

    public void setInstitutionNo(String institutionNo) {
        InstitutionNo = institutionNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public byte[] getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(byte[] studentPhoto) {
        this.studentPhoto = studentPhoto;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentKey() {
        return studentKey;
    }

    public void setStudentKey(String studentKey) {
        this.studentKey = studentKey;
    }
}
