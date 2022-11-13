package com.rajandco.models;

public class Leaves {

	private int eid; // unique
	private String reason; // not null
	private String status; // 
	
	public Leaves() {
		
	}
	
	
	@Override
	public String toString() {
		return "Leaves [eid=" + eid + ", reason=" + reason + ", status=" + status + "]";
	}
	
	
	public Leaves(int eid, String reason, String status) {
		super();
		this.eid = eid;
		this.reason = reason;
		this.status = status;
	}

	
	

	public String getReason() {
		return reason;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
