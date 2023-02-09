package entity;

import java.io.Serializable;

/**
 * (Traingtype)实体类
 *
 * @author makejava
 * @since 2022-11-29 12:27:56
 */
public class Traingtype implements Serializable {
    private static final long serialVersionUID = 217789442157935238L;
    
    private String traingtypeno;


    private String traingtypename;
    public Traingtype(String traingtypeno, String traingtypename) {
        this.traingtypeno = traingtypeno;
        this.traingtypename = traingtypename;
    }


    public String getTraingtypeno() {
        return traingtypeno;
    }

    public void setTraingtypeno(String traingtypeno) {
        this.traingtypeno = traingtypeno;
    }

    public String getTraingtypename() {
        return traingtypename;
    }

    public void setTraingtypename(String traingtypename) {
        this.traingtypename = traingtypename;
    }

}

