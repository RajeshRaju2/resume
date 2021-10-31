package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Interview {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="INTERVIEW_ID")
	private int interviewId;
	
	@Column(name="INTERVIEW_DATE_AND_TIME")
	Date interviewDate;
	
	@OneToOne
	@JoinColumn(name="applicationId")
	Application application;

	public Interview() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Interview(int interviewId, Date interviewDate, Application application) {
		super();
		this.interviewId = interviewId;
		this.interviewDate = interviewDate;
		this.application = application;
	}

	public int getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}
	
	
	
}
