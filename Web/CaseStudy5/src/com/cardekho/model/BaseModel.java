package com.cardekho.model;

import java.util.Date;

import lombok.Data;

/**
 * @author Anjita
 */
@Data
public class BaseModel {
	
	private int id;
	
	private String createdBy;
	
	private Date createdTime;

}
