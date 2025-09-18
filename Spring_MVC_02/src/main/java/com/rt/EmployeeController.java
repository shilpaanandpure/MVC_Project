package com.rt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.er.Entity.Employee;
import com.rt.dao.StudentDao;

@Controller
public class EmployeeController {
	
	@Autowired
	StudentDao sd;
	
	@RequestMapping("/insert")
	public String form(Model m, @ModelAttribute Employee e) {
		sd.insert(e);
	    m.addAttribute("name", e.getName());
	    m.addAttribute("salary", e.getSalary());
	    return "display";
	}
	
	@RequestMapping("/update")
	public String update(Model m,@ModelAttribute Employee e){
		sd.update(e);
		m.addAttribute("userId", e.getId());
		m.addAttribute("userName", e.getName());
		m.addAttribute("userSalary", e.getSalary());
		return "update";
		
	}
	@RequestMapping("/delete")
	public String delet(Model m,@ModelAttribute Employee e){
		sd.delet(e);
		m.addAttribute("userId", e.getId());
		m.addAttribute("userName", e.getName());
		m.addAttribute("userSalary", e.getSalary());
		return "delet";
		
	}
	@RequestMapping("/slect")
	public String slect(Model m,@ModelAttribute Employee e){
		sd.slect(e);
		m.addAttribute("userId", e.getId());
		m.addAttribute("userName", e.getName());
		m.addAttribute("userSalary", e.getSalary());
		return "slect";


}
	@RequestMapping("/selectall")
	public String slectal(Model m){
		List<Employee> list = sd.slectall();
		m.addAttribute("emp", list);
		return "selectAll";


}
}

