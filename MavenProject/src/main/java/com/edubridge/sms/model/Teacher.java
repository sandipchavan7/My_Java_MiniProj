package com.edubridge.sms.model;

public class Teacher {
	private int teacherID;
    private String teacherName;
    private String teacherAddress;
    private String teacherSubject;
    private long teacherContact;
	public Teacher(int teacherID, String teacherName,String teacherAddress,String teacherSubject,long teacherContact) {
		super();
		this.teacherID=teacherID;
		this.teacherName=teacherName;
		this.teacherAddress=teacherAddress;
		this.teacherSubject=teacherSubject;
		this.teacherContact=teacherContact;
		
	}
	public int getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherAddress() {
		return teacherAddress;
	}
	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}
	public String getTeacherSubject() {
		return teacherSubject;
	}
	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}
	public long getTeacherContact() {
		return teacherContact;
	}
	public void setTeacherContact(long teacherContact) {
		this.teacherContact = teacherContact;
	}
	@Override
	public String toString() {
		return "Teacher [teacherID=" + teacherID + ", teacherName=" + teacherName + ", teacherAddress=" + teacherAddress
				+ ", teacherSubject=" + teacherSubject + ", teacherContact=" + teacherContact + "]";
	}

}
