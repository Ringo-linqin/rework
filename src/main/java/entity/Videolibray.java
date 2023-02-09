package entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Videolibray)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class Videolibray implements Serializable {
    private static final long serialVersionUID = 671229581509487744L;
    
    private String videono;
    
    private String institutionno;
    
    private String videoname;
    
    private Date uploadtime;
    
    private String process;

    public Videolibray(String videono, String institutionno, String videoname, Date uploadtime, String process) {
        this.videono = videono;
        this.institutionno = institutionno;
        this.videoname = videoname;
        this.uploadtime = uploadtime;
        this.process = process;
    }

    public String getVideono() {
        return videono;
    }

    public void setVideono(String videono) {
        this.videono = videono;
    }

    public String getInstitutionno() {
        return institutionno;
    }

    public void setInstitutionno(String institutionno) {
        this.institutionno = institutionno;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    @Override
    public String toString() {
        return "Videolibray{" +
                "videono='" + videono + ' ' +
                ", institutionno='" + institutionno + ' ' +
                ", videoname='" + videoname + ' ' +
                ", uploadtime=" + uploadtime +
                ", process='" + process + ' ' +
                '}';
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

}

