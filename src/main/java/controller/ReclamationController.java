package controller;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import modele.Reclamation;
import service.ReclamationService;
import util.Mailing;

@Controller
public class ReclamationController {
	
	
	
	@Autowired
	ReclamationService reclamationService;
	//@RequestBody Reclamation rec
	@RequestMapping(value = "/reclamationForm",method=RequestMethod.GET)
	public String reclamationForm()
	{
		//reclamationService.addreclamation(rec);
		return"reclamationForm";
	}

	
	@RequestMapping(value = "/reclamationValidation",method=RequestMethod.POST)
	public ModelAndView validationReclamation(@ModelAttribute("reclamation") Reclamation rec)
	{
		reclamationService.addreclamation(rec);
		ModelAndView model = new ModelAndView();
		model.addObject("list",reclamationService.listReclamation());
		model.setViewName("reclamationValidation");
		reclamationService.save(rec);
		try {
			Mailing.sendmail();
		} catch (MessagingException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value = "/list",method=RequestMethod.GET)
	public ModelAndView getList()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("list",reclamationService.listReclamation());
		model.setViewName("list");
		return model;
	}

}
