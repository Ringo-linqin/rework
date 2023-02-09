package entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TestPaper)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class TestPaper{

    private String testPaperNo;

    private String institutionNo;

    private String trainingPlanNo;

    private String testPaperName;

    private Date testPaperTime;

    private Date testLength;

    public TestPaper(String testPaperNo, String institutionNo, String trainingPlanNo, String testPaperName, Date testPaperTime, Date testLength) {
        this.testPaperNo = testPaperNo;
        this.institutionNo = institutionNo;
        this.trainingPlanNo = trainingPlanNo;
        this.testPaperName = testPaperName;
        this.testPaperTime = testPaperTime;
        this.testLength = testLength;
    }
    public String getTestPaperNo() {
        return testPaperNo;
    }

    public void setTestPaperNo(String testPaperNo) {
        this.testPaperNo = testPaperNo;
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

    public String getTestPaperName() {
        return testPaperName;
    }

    public void setTestPaperName(String testPaperName) {
        this.testPaperName = testPaperName;
    }

    public Date getTestPaperTime() {
        return testPaperTime;
    }

    public void setTestPaperTime(Date testPaperTime) {
        this.testPaperTime = testPaperTime;
    }

    public Date getTestLength() {
        return testLength;
    }

    public void setTestLength(Date testLength) {
        this.testLength = testLength;
    }

}


