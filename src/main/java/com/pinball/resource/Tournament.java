package com.pinball.resource;

public class Tournament{

	boolean isActive = false;
	String location = null;
	String title = null;
	Long id = null;

	public Tournament(){
	}

	public Tournament (final String location, final String title, final Long id, final boolean isActive){
		this.isActive = isActive;
		this.location = location;
		this.title = title;
		this.id = id;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(final boolean isActive) {
		this.isActive = isActive;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(final String location) {
		this.location = location;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}
}