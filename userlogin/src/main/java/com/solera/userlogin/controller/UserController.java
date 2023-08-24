package com.solera.userlogin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.solera.userlogin.entities.UserData;
import com.solera.userlogin.model.UserModel;
import com.solera.userlogin.service.UserService;
import com.solera.userlogin.utility.UserUtility;

@Controller
public class UserController {
	/*
	 * @GetMapping("/userlogin") public ModelAndView loginform() { ModelAndView
	 * mv=new ModelAndView(); mv.setViewName("userloginform"); return mv;
	 * 
	 * }
	 */
	@Autowired
	private UserService userserv;
	@Autowired
	private UserUtility ui;
	

	@GetMapping("/home")
	public ModelAndView userhome() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		return mv;
		
	}
	
	@GetMapping(value="/useregist")
	public ModelAndView registform() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("userregist");
		return mv;
		
	}
	
	@RequestMapping(value="/adduser",method=RequestMethod.POST)
	//public ModelAndView addDealerDetails(@ModelAttribute("dealer") Dealer dealer) {
	public ModelAndView addUserDetails( UserModel usermodel) {
		ModelAndView mv = new ModelAndView();
		
		UserData usd = userserv.registeruser(ui.createUserDataFromModel(usermodel));
		
	
		mv.setViewName("index");
		mv.addObject("adduser", usd);
	    return mv;
	}
	
	
	
	
}
