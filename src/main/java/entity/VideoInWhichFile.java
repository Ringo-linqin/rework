package entity;

import java.io.Serializable;

/**
 * (VideoInWhichFile)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class VideoInWhichFile {
    
    private String videoNo;
    
    private String trainingFileNo;
    
    private String trainingPlanNo;

    public VideoInWhichFile(String videoNo, String trainingFileNo, String trainingPlanNo) {
        this.videoNo = videoNo;
        this.trainingFileNo = trainingFileNo;
        this.trainingPlanNo = trainingPlanNo;
    }

    public String getVideoNo() {
        return videoNo;
    }

    public void setVideoNo(String videoNo) {
        this.videoNo = videoNo;
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

