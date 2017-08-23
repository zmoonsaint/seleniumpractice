package com.ym.jobboard.common;

public enum JNavXPath {
	JOBSEEKER("//*[@id=\'menu\']/ul/li[2]/a"),
	MY_ACCOUNT("//*[@id=\'menu\']/ul/li[2]/ul/li[2]/a"),
	JOB_SEARCH("//*[@id=\'menu\']/ul/li[2]/ul/li[3]/a"),
	MANAGE_RESUMES("//*[@id=\'menu\']/ul/li[2]/ul/li[4]/a"),
	JOB_ALERTS("//*[@id=\'menu\']/ul/li[2]/ul/li[5]/a"),
	RESOURCES("//*[@id=\'menu\']/ul/li[2]/ul/li[6]/a"),
	HELP("//*[@id=\'menu\']/ul/li[2]/ul/li[7]/a");
	
	
	private final String jNavXPath;
	
	private JNavXPath(String jNavXPath) {
		this.jNavXPath = jNavXPath;
	}
	
	public String getJNavXpath() {
		return this.jNavXPath;
	}
}
