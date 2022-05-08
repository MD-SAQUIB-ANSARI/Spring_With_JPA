package com.sagar.demo.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sagar.demo.model.Empl;
import com.sagar.demo.repositary.EmpRepositary;

@Controller
public class MyController {

	@Autowired
	private EmpRepositary empRepositary;
	
	@RequestMapping("/")
	public String home()
	{
		System.out.println("Test App...");		
		return "index";
	}
	
	@GetMapping("add")
	public String add()
	{
		System.out.println("Test App...");
		
		return "add";
	}
	@PostMapping("addRecord")
	public String addRecord(@ModelAttribute Empl empl, Model m)
	{
		empRepositary.save(empl);
		m.addAttribute("msg", "Record Added Done...");
		System.out.println("Add Successfully...");
		return "add";
	}
	
	@GetMapping("update")
	public String update()
	{
		System.out.println("update App...");
		
		return "update";
	}
	
	@PostMapping("updateRecord")
	public String updateRecord(@ModelAttribute Empl empl, Model m)
	{
		Optional<Empl> o=empRepositary.findById(empl.getEmpNo());
		if(!o.isEmpty())
		{
			Empl e=o.get();
			e.setEmpName(empl.getEmpName());
			e.setEmpSal(empl.getEmpSal());
			empRepositary.save(e);
			m.addAttribute("msg", " Update Record Done  "+empl.getEmpName());
		}else {
			m.addAttribute("msg", " Record Not Found...");
		}
		
		System.out.println("Update Successfully...");
		return "update";
	}
	
	@GetMapping("delete")
	public String delete()
	{
		System.out.println("delete App...");
		
		return "delete";
	}
	
	@PostMapping("deleteRecord")
	public String deleteRecord(@ModelAttribute Empl empl, Model m)
	{
		Optional<Empl> o=empRepositary.findById(empl.getEmpNo());
		if(!o.isEmpty())
		{
			
			empRepositary.delete(empl);
			
			m.addAttribute("msg", " Delete Record Done  "+empl.getEmpNo());
		}else {
			m.addAttribute("msg", " Record Not Found...");
		}
		
		System.out.println("Delete Successfully...");
		return "delete";
	}
	
	@GetMapping("find")
	public String find()
	{
		System.out.println("find App...");
		
		return "find";
	}
	
	@PostMapping("findRecord")
	public String findRecord(@ModelAttribute Empl empl, Model m)
	{
		Optional<Empl> o=empRepositary.findById(empl.getEmpNo());
		if(!o.isEmpty())
		{
			Empl ee=o.get();
			
			m.addAttribute("msg1", ee.getEmpNo());
			m.addAttribute("msg2", ee.getEmpName());
			m.addAttribute("msg3", ee.getEmpSal());
		}else {
			m.addAttribute("msg", " Record Not Found...");
		}
		
		System.out.println("find Successfully...");
		return "find";
	}
	
	@GetMapping("findAllRecord")
	public String findAllRecord( Model m)
	{
		List<Empl> o=empRepositary.findAll();
		Iterator<Empl> itr=o.iterator();
		
		while(itr.hasNext())
		{
			Empl emp=itr.next();
			m.addAttribute("msg1", emp.getEmpNo());
			m.addAttribute("msg2", emp.getEmpName());
			m.addAttribute("msg3", emp.getEmpSal());
		
		}if(o.isEmpty()) {
			m.addAttribute("msg", " Table is Empty...");
		}
		
		System.out.println("find Successfully...");
		return "findAll";
	}
}
