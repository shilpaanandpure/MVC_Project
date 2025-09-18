package com.rt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(){
		return "index";
		
	}

	@RequestMapping("/ref")
	public String form(){
		return "form";
		

}
	@RequestMapping("/updatepage")
	public String update(){
		return "update";
		
	}
	@RequestMapping("/deletpage")
	public String delet(){
		return "delet";
		
}
	@RequestMapping("/slectpage")
	public String slect(){
		return "slect";
		
}
	
}
