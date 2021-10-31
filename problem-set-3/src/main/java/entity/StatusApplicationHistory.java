package entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class StatusApplicationHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="HISTORY_ID")
	private int historyId;
	
	@ManyToOne
	@JoinColumn(name="applicationId")
	private Application application;
	
	@Column(name="MAIL")
	private String mail;

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
}
