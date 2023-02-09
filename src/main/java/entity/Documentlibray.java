package entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Documentlibray)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class Documentlibray implements Serializable {
    private static final long serialVersionUID = 977411319404149647L;
    
    private String documentno;
    
    private String institutionno;
    
    private String documentname;
    
    private String documentcontent;
    
    private Date uplodedate;
    
    private String ischeck;

    public Documentlibray(String documentno, String institutionno, String documentname, String documentcontent,
                          Date uplodedate, String ischeck) {

        this.documentno = documentno;
        this.institutionno = institutionno;
        this.documentname = documentname;
        this.documentcontent = documentcontent;
        this.uplodedate = uplodedate;
        this.ischeck = ischeck;
    }
    public String getDocumentno() {
        return documentno;
    }

    public void setDocumentno(String documentno) {
        this.documentno = documentno;
    }

    public String getInstitutionno() {
        return institutionno;
    }

    public void setInstitutionno(String institutionno) {
        this.institutionno = institutionno;
    }

    public String getDocumentname() {
        return documentname;
    }

    public void setDocumentname(String documentname) {
        this.documentname = documentname;
    }

    public String getDocumentcontent() {
        return documentcontent;
    }

    public void setDocumentcontent(String documentcontent) {
        this.documentcontent = documentcontent;
    }

    public Date getUplodedate() {
        return uplodedate;
    }

    public void setUplodedate(Date uplodedate) {
        this.uplodedate = uplodedate;
    }

    public String getIscheck() {
        return ischeck;
    }

    public void setIscheck(String ischeck) {
        this.ischeck = ischeck;
    }

}

