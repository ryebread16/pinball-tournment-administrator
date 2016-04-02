package com.pinball.resource;

public class Tournament {

	boolean isActive = false;
	String location = null;
	String title = null;
	
	
	public Tournament(boolean isActive, String location, String title){
		this.isActive = isActive;
		this.location = location;
		this.title = title;
	}
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
