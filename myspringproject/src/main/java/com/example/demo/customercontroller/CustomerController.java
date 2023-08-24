package com.example.demo.customercontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	
	
	
	@GetMapping("/customerform")
	public ModelAndView getCustomerForm() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("customerform");
		return mv;
	}
}
