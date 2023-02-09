package entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (DocumentLibrary)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class DocumentLibrary implements Serializable {
    private static final long serialVersionUID = 977411319404149647L;
    
    private String documentNo;
    
    private String institutionNo;
    
    private String documentName;
    
    private String documentContent;
    
    private Date uploadDate;
    
    private String isCheck;

    public DocumentLibrary(String documentNo, String institutionNo, String documentName, String documentContent,
                           Date uploadDate, String isCheck) {

        this.documentNo = documentNo;
        this.institutionNo = institutionNo;
        this.documentName = documentName;
        this.documentContent = documentContent;
        this.uploadDate = uploadDate;
        this.isCheck = isCheck;
    }
    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    public String getInstitutionNo() {
        return institutionNo;
    }

    public void setInstitutionNo(String institutionNo) {
        this.institutionNo = institutionNo;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public void setDocumentContent(String documentContent) {
        this.documentContent = documentContent;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck;
    }

}

