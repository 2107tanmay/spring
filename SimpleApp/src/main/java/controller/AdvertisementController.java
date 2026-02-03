package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Advertisement;

@Controller
public class AdvertisementController {
	
	@RequestMapping(value = "/getdetails", method = RequestMethod.GET)
	String getAdvertisementpage(@ModelAttribute("advertisement") Advertisement aobj)
	{
		return "advertisement";
	}
	
	@RequestMapping(value="/display")
	String displayAdvertisementDetails(@ModelAttribute("advertisement")Advertisement aobj)
	{	
		return "success";
	}
}
