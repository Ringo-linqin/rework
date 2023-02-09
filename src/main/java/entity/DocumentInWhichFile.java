package entity;

import java.io.Serializable;

/**
 * (DocumentInWhichFile)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class DocumentInWhichFile{
    
    private String documentNo;
    
    private String trainingFileNo;
    
    private String trainingPlanNo;

    public DocumentInWhichFile(String documentNo, String trainingFileNo, String trainingPlanNo) {

        this.documentNo = documentNo;
        this.trainingFileNo = trainingFileNo;
        this.trainingPlanNo = trainingPlanNo;
    }

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
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

}

