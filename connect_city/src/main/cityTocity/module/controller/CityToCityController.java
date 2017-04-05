package cityTocity.module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cityTocity.module.utill.CityToCityUrls;

@Controller
public class CityToCityController {
	
	@RequestMapping(value=CityToCityUrls.INDEX,method=RequestMethod.GET)
	public ModelAndView index(){   	
		ModelAndView mav=new ModelAndView("/index");
		return mav;
	}
}
