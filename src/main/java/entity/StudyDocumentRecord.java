package entity;

import java.io.Serializable;

/**
 * (StudyDocumentRecord)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class StudyDocumentRecord{

    private String studentNo;
    
    private String documentNo;
    
    private String trainingPlanNo;
    
    private String trainingFileNo;
    
    private String isStudyOver;

    public StudyDocumentRecord(String studentNo, String documentNo, String trainingPlanNo, String trainingFileNo, String isStudyOver) {
        this.studentNo = studentNo;
        this.documentNo = documentNo;
        this.trainingPlanNo = trainingPlanNo;
        this.trainingFileNo = trainingFileNo;
        this.isStudyOver = isStudyOver;
    }
    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    public String getTrainingPlanNo() {
        return trainingPlanNo;
    }

    public void setTrainingPlanNo(String trainingPlanNo) {
        this.trainingPlanNo = trainingPlanNo;
    }

    public String getTrainingFileNo() {
        return trainingFileNo;
    }

    public void setTrainingFileNo(String trainingFileNo) {
        this.trainingFileNo = trainingFileNo;
    }

    public String getIsStudyOver() {
        return isStudyOver;
    }

    public void setIsStudyOver(String isStudyOver) {
        this.isStudyOver = isStudyOver;
    }

}

