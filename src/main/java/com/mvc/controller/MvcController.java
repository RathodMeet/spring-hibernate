package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MvcController {
		
		@Autowired
		private UserDao userDao;
		
		@RequestMapping(value="/welcome")
		public String welcomePage() {
				return "welcome";
		}
		
		@RequestMapping(value="/form")
		public String goToForm() {
				return "form";
		}
		
		@RequestMapping(value="/submit",  method = RequestMethod.POST)
		public String submit(@ModelAttribute("user") User user, HttpServletRequest request, Model model) {
			System.out.println(user.getName());
			long id = userDao.save(user);
			User savedUser = userDao.getUserById(id);
			model.addAttribute("name",savedUser.getName());
			model.addAttribute("surname",savedUser.getName());
			return "result";
		}
}
