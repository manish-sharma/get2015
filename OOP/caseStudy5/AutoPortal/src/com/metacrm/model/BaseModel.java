package com.metacrm.model;

import java.util.Date;

//import lombok.Data;
//
//@Data
/**
 *
 * @author Riddhi
 */
public class BaseModel {

    private int id;
    private String createdBy;
    private Date createdTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
