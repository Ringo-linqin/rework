package entity;

import java.io.Serializable;

/**
 * (QuestionOptions)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class QuestionOptions{

    private String questionNo;
    
    private String questionOption;
    
    private String questionContent;

    public QuestionOptions(String questionNo, String questionOption, String questionContent) {
        this.questionNo = questionNo;
        this.questionOption = questionOption;
        this.questionContent = questionContent;
    }
    public String getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(String questionNo) {
        this.questionNo = questionNo;
    }

    public String getQuestionOption() {
        return questionOption;
    }

    public void setQuestionOption(String questionOption) {
        this.questionOption = questionOption;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

}

