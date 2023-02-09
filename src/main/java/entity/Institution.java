package entity;

import java.io.Serializable;

/**
 * (Institution)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class Institution implements Serializable {
    private static final long serialVersionUID = 305671511756071056L;
    
    private String institutionNo;
    
    private String trainingInstitutionNo;
    
    private String institutionName;
    
    private String institutionIntroduce;

    public Institution(String institutionNo, String trainingInstitutionNo, String institutionName, String institutionIntroduce){
        this.institutionNo = institutionNo;
        this.trainingInstitutionNo = trainingInstitutionNo;
        this.institutionName = institutionName;
        this.institutionIntroduce = institutionIntroduce;
    }

    public Institution(String institutionNo) {
        this.institutionNo = institutionNo;
    }

    public String getInstitutionNo() {
        return institutionNo;
    }

    public void setInstitutionNo(String institutionNo) {
        this.institutionNo = institutionNo;
    }

    public String getTrainingInstitutionNo() {
        return trainingInstitutionNo;
    }

    public void setTrainingInstitutionNo(String trainingInstitutionNo) {
        this.trainingInstitutionNo = trainingInstitutionNo;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getInstitutionIntroduce() {
        return institutionIntroduce;
    }

    public void setInstitutionIntroduce(String institutionIntroduce) {
        this.institutionIntroduce = institutionIntroduce;
    }

}

