package dao;

import java.util.ArrayList;
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
	
	public void delete() {
		List<Application> applicationInside = new ArrayList<Application>();
		applicationInside = getAllApplication();
		Calendar c= Calendar.getInstance();
		c.add(Calendar.DATE, 30);
		Date d=c.getTime();
		Application application = new Application();
		for (Application i:applicationInside) {
			if(d.equals(application.getExpireDate())) {
				application=i;
				application.setStatusOfApplication("Declined by system");
				updateApplication(application,application.getApplicationId());
			}
		
		}
	}
	
}