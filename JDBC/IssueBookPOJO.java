package com.metacube.jdbc.example;

public class IssueBookPOJO {
	static boolean isIssued=false;
	public boolean getIssued() {
		return isIssued;
	}
	public void setIssued(boolean isIssued) {
		IssueBookPOJO.isIssued = isIssued;
	}
}
