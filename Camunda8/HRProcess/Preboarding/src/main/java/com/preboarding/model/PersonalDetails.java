package com.preboarding.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class PersonalDetails {

	@Id
	@GeneratedValue(generator = "personal_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "personal_gen", sequenceName = "personal_seq", initialValue = 101, allocationSize = 1)
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private String dob;
	private String gender;
	private String bloodGroup;
	private String phoneNumber;
	private String email;
	private String permanentAddress;
	private String currentAddress;
	private String fatherName;
	private String motherName;
	private String emergencyContact;

	public PersonalDetails() {
		super();
	}

	public PersonalDetails(String firstName, String lastName, String dob, String gender, String bloodGroup,
			String phoneNumber, String email, String permanentAddress, String currentAddress, String fatherName,
			String motherName, String emergencyContact) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.permanentAddress = permanentAddress;
		this.currentAddress = currentAddress;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.emergencyContact = emergencyContact;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	@Override
	public String toString() {
		return "PersonalDetails [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", gender="
				+ gender + ", bloodGroup=" + bloodGroup + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", permanentAddress=" + permanentAddress + ", currentAddress=" + currentAddress + ", fatherName="
				+ fatherName + ", motherName=" + motherName + ", emergencyContact=" + emergencyContact + "]";
	}

}
