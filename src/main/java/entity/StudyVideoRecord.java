package entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (StudyVideoRecord)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class StudyVideoRecord {


    private String videoNo;
    
    private String trainingPlanNo;
    
    private String studentNo;
    
    private String trainingFileNo;
    
    private String isFinish;
    
    private Date viewingDuration;

    public StudyVideoRecord(String videoNo, String trainingPlanNo, String studentNo, String trainingFileNo, String isFinish, Date viewingDuration) {
        this.videoNo = videoNo;
        this.trainingPlanNo = trainingPlanNo;
        this.studentNo = studentNo;
        this.trainingFileNo = trainingFileNo;
        this.isFinish = isFinish;
        this.viewingDuration = viewingDuration;
    }
    public String getVideoNo() {
        return videoNo;
    }

    public void setVideoNo(String videoNo) {
        this.videoNo = videoNo;
    }

    public String getTrainingPlanNo() {
        return trainingPlanNo;
    }

    public void setTrainingPlanNo(String trainingPlanNo) {
        this.trainingPlanNo = trainingPlanNo;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getTrainingFileNo() {
        return trainingFileNo;
    }

    public void setTrainingFileNo(String trainingFileNo) {
        this.trainingFileNo = trainingFileNo;
    }

    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish;
    }

    public Date getViewingDuration() {
        return viewingDuration;
    }

    public void setViewingDuration(Date viewingDuration) {
        this.viewingDuration = viewingDuration;
    }

}

