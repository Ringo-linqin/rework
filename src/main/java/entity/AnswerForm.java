package entity;

import java.io.Serializable;

/**
 * (AnswerForm)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class AnswerForm  {
    
    private String studentNo;
    
    private String testPaperNo;
    
    private String questionNo;
    
    private Integer score;

    public AnswerForm(String studentNo, String testPaperNo, String questionNo, Integer score) {
        this.studentNo = studentNo;
        this.testPaperNo = testPaperNo;
        this.questionNo = questionNo;
        this.score = score;
    }
    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getTestPaperNo() {
        return testPaperNo;
    }

    public void setTestPaperNo(String testPaperNo) {
        this.testPaperNo = testPaperNo;
    }

    public String getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(String questionNo) {
        this.questionNo = questionNo;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}

