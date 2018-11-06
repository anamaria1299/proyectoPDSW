package edu.eci.pdsw.managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import edu.eci.pdsw.samples.services.InitiativeServices;
import edu.eci.pdsw.samples.services.ServicesException;


@SuppressWarnings("deprecation")
@ManagedBean(name = "initiativeBean")
@SessionScoped
public class InitiativeBean extends BasePageBean {
	
	@Inject
	InitiativeServices initiativeService;

	private static final long serialVersionUID = 3594009161252782831L;
	
	public void addInitiative(String description, String area) throws ServicesException{
		System.out.println(description);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
		try {
			System.out.println(initiativeService);
			initiativeService.createInitiative(description, area, Integer.parseInt(session.getAttribute("id").toString()));
		} catch (ServicesException ex) {
			throw ex;
		}
	}
	
    
}