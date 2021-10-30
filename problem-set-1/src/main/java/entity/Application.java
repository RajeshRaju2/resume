package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="APPLICATION_ID")
	private int applicationId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="QUALIFICATION")
	private String qualification;
	
	@Column(name="EXPERIENCE")
	private String experience;
	
	@Column(name="STATUS")
	private String statusOfApplication;
	
	@Column(name="EMAIL")
	private String email;
	
	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getStatusOfApplication() {
		return statusOfApplication;
	}

	public void setStatusOfApplication(String statusOfApplication) {
		this.statusOfApplication = statusOfApplication;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
