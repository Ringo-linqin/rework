package entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TrainingPlan)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class TrainingPlan{
    private String institutionNo;
    
    private String trainingPlanNo;
    
    private String trainingTypeNo;
    
    private String trainingPlanName;
    
    private String trainingPeriod;
    
    private Date trainingStartTime;
    
    private Date trainingEndTime;

    public TrainingPlan(String institutionNo, String trainingPlanNo, String trainingTypeNo, String trainingPlanName, String trainingPeriod, Date trainingStartTime, Date trainingEndTime) {
        this.institutionNo = institutionNo;
        this.trainingPlanNo = trainingPlanNo;
        this.trainingTypeNo = trainingTypeNo;
        this.trainingPlanName = trainingPlanName;
        this.trainingPeriod = trainingPeriod;
        this.trainingStartTime = trainingStartTime;
        this.trainingEndTime = trainingEndTime;
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

    public String getTrainingTypeNo() {
        return trainingTypeNo;
    }

    public void setTrainingTypeNo(String trainingTypeNo) {
        this.trainingTypeNo = trainingTypeNo;
    }

    public String getTrainingPlanName() {
        return trainingPlanName;
    }

    public void setTrainingPlanName(String trainingPlanName) {
        this.trainingPlanName = trainingPlanName;
    }

    public String getTrainingPeriod() {
        return trainingPeriod;
    }

    public void setTrainingPeriod(String trainingPeriod) {
        this.trainingPeriod = trainingPeriod;
    }

    public Date getTrainingStartTime() {
        return trainingStartTime;
    }

    public void setTrainingStartTime(Date trainingStartTime) {
        this.trainingStartTime = trainingStartTime;
    }

    public Date getTrainingEndTime() {
        return trainingEndTime;
    }

    public void setTrainingEndTime(Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
    }

}

