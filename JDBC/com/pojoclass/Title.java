/**
 * @author Pooja Khandelwal
 * @createdDate 16/09/2015
 * @name Title 
 * @description this class is pojo class for Title table of library database which has getter setter methods for Title table
 */
package com.pojoclass;

public class Title {
	String titleId;
	String titleName;
	String subjectId;
	String publisherId;

	/**
	 * @name getTitleId()
	 * @description return the titleId
	 * @return titleId
	 */
	public String getTitleId() {
		return titleId;
	}

	/**
	 * @name setTitleId()
	 * @description set the value of titleId
	 * @param titleId
	 */
	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	/**
	 * @name getTitleName()
	 * @description return the titleName
	 * @return titleName
	 */
	public String getTitleName() {
		return titleName;
	}

	/**
	 * @name setTitleName()
	 * @description set the value of titleName
	 * @param titleName
	 */
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	/**
	 * @name getSubjectId()
	 * @description return the subjectId
	 * @return subjectId
	 */
	public String getSubjectId() {
		return subjectId;
	}

	/**
	 * @name setSubjectId()
	 * @description set the value of subjectId
	 * @param subjectId
	 */
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	/**
	 * @name getPublisherId()
	 * @description return the publisherId
	 * @return publisherId
	 */
	public String getPublisherId() {
		return publisherId;
	}

	/**
	 * @name setPublisherId()
	 * @description set the value of publisherId
	 * @param publisherId
	 */
	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}

}
