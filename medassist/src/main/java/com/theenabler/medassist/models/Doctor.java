package com.theenabler.medassist.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor {

	@Id
	@GeneratedValue
	private long id;
	
	private String username;
	private String password;
	private String name;
	private String emailId;
	private long contactNumber;
	private int age;
	private String sex;
	private String speciality;
	private String qualification;
	private String clinicName;
	private String address;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(long id, String username, String password, String name, String emailId, long contactNumber, int age,
			String sex, String speciality, String qualification, String clinicName, String address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
		this.age = age;
		this.sex = sex;
		this.speciality = speciality;
		this.qualification = qualification;
		this.clinicName = clinicName;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getClinicName() {
		return clinicName;
	}

	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", emailId=" + emailId + ", contactNumber=" + contactNumber + ", age=" + age + ", sex=" + sex
				+ ", speciality=" + speciality + ", qualification=" + qualification + ", clinicName=" + clinicName
				+ ", address=" + address + "]";
	}
	
	
	
}
