package com.krecktenwald.domain;

import java.util.HashMap;

public class RunningApplication {

	String runningApplicationWelcomeMessage;
	HashMap<String, RunningApplicationUtility> runningApplicationUtilities;

	public RunningApplication(String runningApplicationWelcomeMessage, HashMap<String, RunningApplicationUtility> runningApplicationUtilities) {
		this.runningApplicationWelcomeMessage = runningApplicationWelcomeMessage;
		this.runningApplicationUtilities = runningApplicationUtilities;
	}

	public String getRunningApplicationWelcomeMessage() {
		return runningApplicationWelcomeMessage;
	}

	public void setRunningApplicationWelcomeMessage(String runningApplicationWelcomeMessage) {
		this.runningApplicationWelcomeMessage = runningApplicationWelcomeMessage;
	}

	public HashMap<String, RunningApplicationUtility> getRunningApplicationUtilities() {
		return runningApplicationUtilities;
	}

	public void setRunningApplicationUtilities(HashMap<String, RunningApplicationUtility> runningApplicationUtilities) {
		this.runningApplicationUtilities = runningApplicationUtilities;
	}
}
