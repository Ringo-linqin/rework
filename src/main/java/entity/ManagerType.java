package entity;

import java.io.Serializable;

/**
 * (ManagerType)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class ManagerType{
    
    private String managerTypeNo;
    
    private String managerTypeName;

    public ManagerType(String managerTypeNo, String managerTypeName) {
        this.managerTypeNo = managerTypeNo;
        this.managerTypeName = managerTypeName;
    }

    public String getManagerTypeNo() {
        return managerTypeNo;
    }

    public void setManagerTypeNo(String managerTypeNo) {
        this.managerTypeNo = managerTypeNo;
    }

    public String getManagerTypeName() {
        return managerTypeName;
    }

    public void setManagerTypeName(String managerTypeName) {
        this.managerTypeName = managerTypeName;
    }

}

