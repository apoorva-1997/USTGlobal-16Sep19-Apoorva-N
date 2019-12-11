package com.ustglobal.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ustglobal.springmvc.beans.Employee;

@Controller
public class HelloController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);				//creates custom date
		binder.registerCustomEditor(Date.class, editor);
	}
	@RequestMapping(path = "/hello") 												// url
	public String hello(@RequestParam("name") String name,@RequestParam("id")int id, ModelMap map) {
		map.addAttribute("msg", "Hello World");										//query string
		map.addAttribute("name",name);
		map.addAttribute("id", id);
		return "index";
	}


	/*
	 * @RequestMapping(path = "/hi") 								// based on this url op is displayed public
	 * String hi(HttpServletRequest request) { 						//request is same as Modelmap
	 * request.setAttribute("msg","Hello JAVA World"); 
	 * return "index"; }
	 */

	/*@RequestMapping(path = "/hi") // based on this url output is displayed
	public String hi(ModelMap map) {
		map.addAttribute("msg", "JAVA World");
		return "index";*/

	@RequestMapping(path = "/hi/{name}/{id}") 								//pah param
	public String hi(@PathVariable("name") String name,@PathVariable("id") int id,ModelMap map) {
		map.addAttribute("msg", "JAVA World");
		map.addAttribute("name", name);
		map.addAttribute("id", id);
		return "index";
	}

	@RequestMapping(path="/form")
	public String formPage() {
		return "form";
	}

	@RequestMapping(path="/form", method=RequestMethod.POST)
	public String form(Employee employee,ModelMap map) {
		map.addAttribute("id", employee.getId());
		map.addAttribute("name", employee.getName());
		map.addAttribute("password", employee.getPassword());
		map.addAttribute("gender", employee.getGender());
		map.addAttribute("doj", employee.getDoj());
		return "formoutput";
	}

	@RequestMapping(path="/create-cookie")
	public String createCookie(ModelMap map,HttpServletResponse response) {
		Cookie cookie = new Cookie("name", "Apooooo");
		response.addCookie(cookie);										//add the cookie
		return "createcookie";
	}
	@RequestMapping(path="/read-cookie")
	public String readCookie(@CookieValue(name="name", required=false) String name,ModelMap map) {
		map.addAttribute("name", name);
		return "readcookie";

	}

	@RequestMapping(path="/redirect")
	public String redirect() {
		return "redirect: http://www.google.com";						//to redirect to that webpage

	}

	@RequestMapping(path="/forward")
	public String forward() {
		return "forward:form";											//this takes to form page
	}

}
