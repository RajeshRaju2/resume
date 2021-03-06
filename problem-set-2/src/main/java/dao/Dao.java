package dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import entity.Application;
import entity.Interview;



@Repository
public class Dao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void createApplication(Application application) {
		getSession().saveOrUpdate(application);
	}
	
	public List<Application> getAllApplication() {
		Query query = getSession().createQuery("From Application");
		@SuppressWarnings("unchecked")
		List<Application> applist = query.list();
		return applist;
	}
	
	public List<Application> updateApplication(Application application,int applicationid) {
		Query query = getSession().createQuery("update Application emp set statusOfApplication=:statusOfApplication where applicationId=:applicationId");
		query.setParameter("statusOfApplication",application.getStatusOfApplication());
		int noofrows = query.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Updated " + noofrows + " rows");
		}
		System.out.println("email sent");
		return getAllApplication();
	}
	
	public Application getApplicationById(int applicationid) {
		Criteria c = getSession().createCriteria(Application.class);
	    c.add(Restrictions.eq("applicationid",applicationid));
	    Application e=(Application)c.uniqueResult();
	    System.out.println("Application Retrieved : " + e);
		return e;
	}

	public List<Application> sortApplicationByName(List<Application> Application) {
		Query query = getSession().createQuery("From Application order by name");
		@SuppressWarnings("unchecked")
		List<Application> applist = query.list();
		System.out.println("sorted = "+ applist);
		return applist;
	}
	
	
	
	public void assign(List<Application> applist,Date date) {
		Calendar cal = Calendar.getInstance();
		  cal.setTime(date);
		  int j=0;
		for (Application i:applist) {
			cal.add(Calendar.MINUTE, j);
			date=cal.getTime();
			Interview interview = new Interview();
			interview.setApplication(i);
			interview.setInterviewDate(date);
			j=j+30;
		}
	}

	
	
}
