package entity;

import java.io.Serializable;

/**
 * (QuestionInWhichPaper)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class QuestionInWhichPaper {

    private String testPaperNo;
    
    private String questionNo;
    public QuestionInWhichPaper(String testPaperNo, String questionNo) {
        this.testPaperNo = testPaperNo;
        this.questionNo = questionNo;
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

}

