package com.ym.jobboard.common;

public enum JCheckpointXPath {
	MAIN_PAGE_TITLE("//*[@id=\'main-content\']/div[3]/h1"),
	JOB_SEARCH("//*[@id=\'main-content\']/div/div[1]/ol/li[2]/text()");
	
	
	private final String jCheckpointXPath;
	
	private JCheckpointXPath(String jCheckpointXPath) {
		this.jCheckpointXPath = jCheckpointXPath;
	}
	
	public String getJCheckpointXPath() {
		return this.jCheckpointXPath;
	}

}
