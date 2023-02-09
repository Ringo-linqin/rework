package entity;

import java.io.Serializable;

/**
 * (FileInWhichPlan)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class FileInWhichPlan{

    
    private String trainingFileNo;
    
    private String trainingPlanNo;
    
    private String institutionNo;

    public FileInWhichPlan(String trainingFileNo, String trainingPlanNo, String institutionNo) {

        this.trainingFileNo = trainingFileNo;
        this.trainingPlanNo = trainingPlanNo;
        this.institutionNo = institutionNo;
    }
    public String getTrainingFileNo() {
        return trainingFileNo;
    }

    public void setTrainingFileNo(String trainingFileNo) {
        this.trainingFileNo = trainingFileNo;
    }

    public String getTrainingPlanNo() {
        return trainingPlanNo;
    }

    public void setTrainingPlanNo(String trainingPlanNo) {
        this.trainingPlanNo = trainingPlanNo;
    }

    public String getInstitutionNo() {
        return institutionNo;
    }

    public void setInstitutionNo(String institutionNo) {
        this.institutionNo = institutionNo;
    }

}

