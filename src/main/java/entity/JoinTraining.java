package entity;

import java.io.Serializable;

/**
 * (JoinTraining)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class JoinTraining {

    private String studentNo;
    
    private String institutionNo;
    
    private String trainingPlanNo;


    public JoinTraining(String studentNo, String institutionNo, String trainingPlanNo) {
        this.studentNo = studentNo;
        this.institutionNo = institutionNo;
        this.trainingPlanNo = trainingPlanNo;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getInstitutionNo() {
        return institutionNo;
    }

    public void setInstitutionNo(String institutionNo) {
        this.institutionNo = institutionNo;
    }

    public String getTrainingPlanNo() {
        return trainingPlanNo;
    }

    public void setTrainingPlanNo(String trainingPlanNo) {
        this.trainingPlanNo = trainingPlanNo;
    }

}

