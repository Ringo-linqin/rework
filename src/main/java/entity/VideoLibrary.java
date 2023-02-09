package entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (VideoLibrary)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class VideoLibrary implements Serializable {
    private static final long serialVersionUID = 671229581509487744L;
    
    private String videoNo;
    
    private String institutionNo;
    
    private String videoName;
    
    private Date uploadTime;
    
    private String process;

    public VideoLibrary(String videoNo, String institutionNo, String videoName, Date uploadTime, String process) {
        this.videoNo = videoNo;
        this.institutionNo = institutionNo;
        this.videoName = videoName;
        this.uploadTime = uploadTime;
        this.process = process;
    }

    public String getVideoNo() {
        return videoNo;
    }

    public void setVideoNo(String videoNo) {
        this.videoNo = videoNo;
    }

    public String getInstitutionNo() {
        return institutionNo;
    }

    public void setInstitutionNo(String institutionNo) {
        this.institutionNo = institutionNo;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public Date getUploadTime() {
        return uploadTime;
    }



    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

}

