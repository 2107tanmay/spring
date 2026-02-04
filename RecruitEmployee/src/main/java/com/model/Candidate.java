package com.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Candidate {
    //provide necessary annotation for validation
	@NotBlank(message="Name cannot be blank")
	private String candidateName;

	//provide necessary annotation for validation
	@NotBlank(message="Contact Number should not be blank")
	private String contactNumber;   
    private char gender;
    private String positionApplied;
    
    //provide necessary annotation for validation
    @Min(value = 10000, message = "must be greater than or equal to 10000")
    @Max(value = 200000, message = "must be less than or equal to 200000")
    private double expectedSalary;
    
    //provide necessary annotation for validation
	@Min(value=0, message = "must be greater than or equal to 0")
	private int yearsOfExperience;
	
    public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPositionApplied() {
		return positionApplied;
	}
	public void setPositionApplied(String positionApplied) {
		this.positionApplied = positionApplied;
	}
	
	public double getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(double expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
}
