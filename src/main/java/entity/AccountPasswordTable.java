package entity;

import java.io.Serializable;

/**
 * (AccountPasswordTable)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class AccountPasswordTable {
    
    private String id;
    
    private String institutionNo;
    
    private String managerTypeNo;
    
    private String password;
    
    private String name;

    public AccountPasswordTable(String id, String institutionNo, String managerTypeNo, String password, String name) {

        this.id = id;
        this.institutionNo = institutionNo;
        this.managerTypeNo = managerTypeNo;
        this.password = password;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstitutionNo() {
        return institutionNo;
    }

    public void setInstitutionNo(String institutionNo) {
        this.institutionNo = institutionNo;
    }

    public String getManagerTypeNo() {
        return managerTypeNo;
    }

    public void setManagerTypeNo(String managerTypeNo) {
        this.managerTypeNo = managerTypeNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

