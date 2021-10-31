package entity;




import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
	
	@Column(name="EXPIRE_DATE")
	Date expireDate;
	
	@OneToOne
	Interview interview;
	

	public Application(int applicationId, String name, String qualification, String experience,
			String statusOfApplication, String email, Date expireDate, Interview interview) {
		super();
		this.applicationId = applicationId;
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
		this.statusOfApplication = statusOfApplication;
		this.email = email;
		this.expireDate = expireDate;
		this.interview = interview;
	}

	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	
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

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	
	public Interview getInterview() {
		return interview;
	}

	public void setInterview(Interview interview) {
		this.interview = interview;
	}
	
}
