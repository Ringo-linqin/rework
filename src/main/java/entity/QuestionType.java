package entity;

import java.io.Serializable;

/**
 * (QuestionType)实体类
 *
 * @author makejava
 * @since 2022-11-29 15:49:07
 */
public class QuestionType {
    
    private String questionTypeNo;
    
    private String questionTypeName;

    public QuestionType(String questionTypeNo, String questionTypeName) {
        this.questionTypeNo = questionTypeNo;
        this.questionTypeName = questionTypeName;
    }

    public String getQuestionTypeNo() {
        return questionTypeNo;
    }

    public void setQuestionTypeNo(String questionTypeNo) {
        this.questionTypeNo = questionTypeNo;
    }

    public String getQuestionTypeName() {
        return questionTypeName;
    }

    public void setQuestionTypeName(String questionTypeName) {
        this.questionTypeName = questionTypeName;
    }

}

