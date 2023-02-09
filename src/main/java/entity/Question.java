package entity;

import java.io.Serializable;

/**
 * (Question)实体类
 *
 * @author makejava
 * @since 2022-11-29 15:48:46
 */
public class Question implements Serializable {
    private static final long serialVersionUID = -45749572162363812L;
    
    private String questionNo;
    
    private String institutionNo;
    
    private String questionCorrectAnswer;
    
    private Float questionScore;
    
    private String questionDifficulty;
    
    private String questionContent;
    
    private String questionTypeNo;

    public Question(String questionNo, String institutionNo, String questionCorrectAnswer, Float questionScore, String questionDifficulty, String questionContent, String questionTypeNo) {
        this.questionNo = questionNo;
        this.institutionNo = institutionNo;
        this.questionCorrectAnswer = questionCorrectAnswer;
        this.questionScore = questionScore;
        this.questionDifficulty = questionDifficulty;
        this.questionContent = questionContent;
        this.questionTypeNo = questionTypeNo;
    }

    public String getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(String questionNo) {
        this.questionNo = questionNo;
    }

    public String getInstitutionNo() {
        return institutionNo;
    }

    public void setInstitutionNo(String institutionNo) {
        this.institutionNo = institutionNo;
    }

    public String getQuestionCorrectAnswer() {
        return questionCorrectAnswer;
    }

    public void setQuestionCorrectAnswer(String questionCorrectAnswer) {
        this.questionCorrectAnswer = questionCorrectAnswer;
    }

    public Float getQuestionScore() {
        return questionScore;
    }

    public void setQuestionScore(Float questionScore) {
        this.questionScore = questionScore;
    }

    public String getQuestionDifficulty() {
        return questionDifficulty;
    }

    public void setQuestionDifficulty(String questionDifficulty) {
        this.questionDifficulty = questionDifficulty;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getQuestionTypeNo() {
        return questionTypeNo;
    }

    public void setQuestionTypeNo(String questionTypeNo) {
        this.questionTypeNo = questionTypeNo;
    }

}

