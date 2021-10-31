package controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import dao.Dao;
import entity.Application;
import entity.StatusApplicationHistory;

@Controller
@Transactional
public class ResumeController {

	@Autowired
	Application application;
	
	@Autowired
	Dao dao;
	
	@Autowired
	StatusApplicationHistory statusApplicationHistory;
		
	@RequestMapping(value="/registration",method = RequestMethod.GET )
	public ModelAndView register() {
		
		return new ModelAndView("home");
		
	}
	
	@RequestMapping(value="/addapplicant",method = RequestMethod.GET )
	public ModelAndView add(@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("qualification") String qualification,
			@RequestParam("experience") String experience
			) {
		application = new Application();
		application.setName(name);
		application.setQualification(qualification);
		application.setEmail(email);
		application.setExperience(experience);
		application.setStatusOfApplication("FALSE");
		dao = new Dao();
		dao.createApplication(application);
		return new ModelAndView("home");
		
	}	
	@RequestMapping(value="/check",method = RequestMethod.GET )
	public ModelAndView check(@RequestParam("id") int id,
			@RequestParam("password") String password) {
			if((id==1234)&&(password=="1234")) {
				List<Application> applist = dao.getAllApplication();
				ModelAndView mv = new ModelAndView("admin1");
				return mv.addObject("applist",applist);
			}
			else {
				return new ModelAndView("home");
			}
	}
	
	@RequestMapping(value = "/search",method = RequestMethod.GET)
	public ModelAndView search(@RequestParam("applicationId") int applicationId)
	{
		
		Application app = dao.getApplicationById(applicationId);
		ModelAndView mv = new ModelAndView("result");
		return mv.addObject("app", app);	
		
	}
	
	@RequestMapping(value ="/sort" , method = RequestMethod.POST)
	public ModelAndView sortApplication() {
		List<Application> applist = dao.getAllApplication();
		List<Application> sortedAPPList = dao.sortApplicationByName(applist);
		ModelAndView mv = new ModelAndView("admin1");
		return mv.addObject("applist",sortedAPPList);
		
	}
	
	public void addHistory(Application application) {
		this.statusApplicationHistory.setApplication(application);
		@SuppressWarnings("unused")
		ModelAndView mv = new ModelAndView("mail");
	}
	
	@RequestMapping(value ="/addMail" , method = RequestMethod.GET)
	public ModelAndView addMail(@RequestParam("mail") String mail) {
		statusApplicationHistory = new StatusApplicationHistory();
		statusApplicationHistory.setMail(mail);
		statusApplicationHistory.setApplication(this.statusApplicationHistory.getApplication());
		dao.createMailHistory(statusApplicationHistory);
		return new ModelAndView("home");	
	}
}
