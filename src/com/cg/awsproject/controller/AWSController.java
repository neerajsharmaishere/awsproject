package com.cg.awsproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.awsproject.entity.UserNames;
import com.cg.awsproject.service.RegisterService;


@Controller
@Transactional
public class AWSController {
	
	@Autowired
	RegisterService rser;
	
	/*
	 * @RequestMapping(value="/user", method=RequestMethod.GET) public ModelAndView
	 * displayName(Model model) {
	 * 
	 * String name = "User_1987";
	 * 
	 * return new ModelAndView("Name", "name",name); }
	 */
	 
	
	
	  @RequestMapping(value="/user", method=RequestMethod.GET) 
	  public ModelAndView indexController(@RequestParam("name") String name, Model model){
		  UserNames name2 = new UserNames();
		  name2.setName(name);
		  rser.register(name2);
		  return new ModelAndView("Name", "name", name);
	  }
	  
	  
	 @RequestMapping(value="/fetchusers", method=RequestMethod.GET)
	 public ModelAndView getListCustomerList(Model model){
			List<UserNames> list= rser.getUserNames();
			return new ModelAndView("UserList","data",list);
			}
}