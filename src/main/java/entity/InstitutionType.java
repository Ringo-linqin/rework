package entity;

import java.io.Serializable;

/**
 * (InstitutionType)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class InstitutionType{
    
    private String trainingInstitutionNo;
    
    private String trainingInstitutionName;


    public InstitutionType(String trainingInstitutionNo, String trainingInstitutionName){
        this.trainingInstitutionNo = trainingInstitutionNo;
        this.trainingInstitutionName = trainingInstitutionName;
    }
    public String getTrainingInstitutionNo() {
        return trainingInstitutionNo;
    }

    public void setTrainingInstitutionNo(String trainingInstitutionNo) {
        this.trainingInstitutionNo = trainingInstitutionNo;
    }



    public String getTrainingInstitutionName() {
        return trainingInstitutionName;
    }

    public void setTrainingInstitutionName(String trainingInstitutionName) {
        this.trainingInstitutionName = trainingInstitutionName;
    }

}

