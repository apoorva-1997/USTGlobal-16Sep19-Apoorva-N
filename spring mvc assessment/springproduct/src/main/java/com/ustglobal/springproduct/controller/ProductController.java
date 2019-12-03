package com.ustglobal.springproduct.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.springproduct.beans.ProductBean;
import com.ustglobal.springproduct.beans.ProductDetail;
import com.ustglobal.springproduct.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of loginpage

	@PostMapping("/login")						
	public String login(int id,String password,HttpServletRequest request) {

		service.login(id, password);
		ProductBean bean = service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg", "Invalid Credintials");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}//end of login
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}//end of registerpage

	@PostMapping("/register")
	public String createprofile(ProductBean bean,ModelMap map) {

		int check = service.createprofile(bean);
		if(check>0) {
			map.addAttribute("msg", "You are Registered and ID is "+check);
		}else {
			map.addAttribute("msg", "Email is repeated");
		}
		return "login";
	}//end of register
	@PostMapping("/home")
	public String home() {
		return "home";
	}//end of home

	@GetMapping("/search")
	public String search(@RequestParam("id")int id,ModelMap map) {
		ProductBean detail = service.searchProduct(id);
		if(detail==null) {
			map.addAttribute("msg", "Data not Found");
		}else {
			map.addAttribute("bean", detail);							
		}
		return "home";
	}//end of search
	
	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session!=null) {
			return "changepassword";
		}else {
			return "login";
		}
	}//end of changepassword
	
	@PostMapping("/changepassword")
	public String changePassword(ModelMap map,String password, String confirmpassword,@SessionAttribute(name="bean")ProductBean bean) {
		if(password.equals(confirmpassword)) {
			service.changePassword(bean.getId(), password);
			map.addAttribute("msg", "Password Changed");
		}else {
			map.addAttribute("msg", "Password not Matching");
		}
		return "home";
	}//end of changepassword

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}//end of logout
}
