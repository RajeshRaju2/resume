package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	
	@OneToMany
	private List<StatusApplicationHistory> statusApplicationHistory;
	
	public Application(int applicationId, String name, String qualification, String experience,
			String statusOfApplication, String email, List<StatusApplicationHistory> statusApplicationHistory) {
		super();
		this.applicationId = applicationId;
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
		this.statusOfApplication = statusOfApplication;
		this.email = email;
		this.statusApplicationHistory = statusApplicationHistory;
	}

	public Application() {
		super();
		// TODO Auto-generated constructor stub
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

	public List<StatusApplicationHistory> getStatusApplicationHistory() {
		return statusApplicationHistory;
	}

	public void setStatusApplicationHistory(List<StatusApplicationHistory> statusApplicationHistory) {
		this.statusApplicationHistory = statusApplicationHistory;
	}
	
	
	
	
}
