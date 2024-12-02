package com.tng.bean;

import java.util.Date;

public class TrackingDetails {
	
	private String tracking_number;
	private String created_at;
	private String message;
	
	public TrackingDetails(String tracking_number, String created_at, String message) {
		super();
		this.tracking_number = tracking_number;
		this.created_at = created_at;
		this.message = message;
	}
	public String getTracking_number() {
		return tracking_number;
	}
	public void setTracking_number(String tracking_number) {
		this.tracking_number = tracking_number;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "TrackingDetails [tracking_number=" + tracking_number + ", created_at=" + created_at + ", message="
				+ message + "]";
	}
	
}
