package com.dh.stats.main.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dh.stats.main.dto.TestDTO;
import com.dh.stats.main.service.MainService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {
	
	@Autowired
	MainService mainService;
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		List<TestDTO> list = mainService.getTestValue();

		if( list.size() > 0 ){
			model.addAttribute("output", "Success_DB_Connection");
		}else{
			model.addAttribute("output", "Fail_DB_Connection");
		}
		
		return "main";
	}
	
}
