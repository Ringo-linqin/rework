package entity;

import java.io.Serializable;

/**
 * (TrainingType)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class TrainingType {
    
    private String trainingTypeNo;


    private String trainingTypeName;
    public TrainingType(String trainingTypeNo, String trainingTypeName) {
        this.trainingTypeNo = trainingTypeNo;
        this.trainingTypeName = trainingTypeName;
    }


    public String getTrainingTypeNo() {
        return trainingTypeNo;
    }

    public void setTrainingTypeNo(String trainingTypeNo) {
        this.trainingTypeNo = trainingTypeNo;
    }

    public String getTrainingTypeName() {
        return trainingTypeName;
    }

    public void setTrainingTypeName(String trainingTypeName) {
        this.trainingTypeName = trainingTypeName;
    }

}

