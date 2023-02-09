package entity;

import java.io.Serializable;

/**
 * (File)实体类
 *
 * @author makejava
 * @since 2022-11-29 15:48:14
 */
public class File implements Serializable {
    private static final long serialVersionUID = 130410712417554230L;
    
    private String trainingFileNo;
    
    private String trainingPlanNo;
    
    private String trainingFileName;

    public File(String trainingFileNo, String trainingPlanNo, String trainingFileName) {
        this.trainingFileNo = trainingFileNo;
        this.trainingPlanNo = trainingPlanNo;
        this.trainingFileName = trainingFileName;
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

    public String getTrainingFileName() {
        return trainingFileName;
    }

    public void setTrainingFileName(String trainingFileName) {
        this.trainingFileName = trainingFileName;
    }

}

