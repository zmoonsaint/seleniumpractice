package com.ym.jobboard.common;

public enum JCheckpointXPath {
	MAIN_PAGE_TITLE("//*[@id=\'main-content\']/div[3]/h1"),
	BREADCRUMBS("//*[@id=\'main-content\']/div/div[1]/ol/li[2]"),
	JOB_ALERTS("//*[@id=\'main-content\']/div[2]/section[1]/h1"),
	HELP("//*[@id='main-content']/div[2]/h1");
	
	private final String jCheckpointXPath;
	
	private JCheckpointXPath(String jCheckpointXPath) {
		this.jCheckpointXPath = jCheckpointXPath;
	}
	
	public String getJCheckpointXPath() {
		return this.jCheckpointXPath;
	}

}
