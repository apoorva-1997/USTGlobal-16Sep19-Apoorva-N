package com.ustglobal.springrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.springrest.dto.EmployeeBean;
import com.ustglobal.springrest.dto.EmployeeResponse;
import com.ustglobal.springrest.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping(path="/add",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public  EmployeeResponse addEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.addEmployee(bean)) {
			response.setStatusCode(201);
			response.setMeaasage("success");
			response.setDescription("data added to the db");
		}else {
			response.setStatusCode(401);
			response.setMeaasage("failure");
			response.setDescription("data not added to the db");
		}
		return response;
	}
	
	@PutMapping(path="/modify",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.addEmployee(bean)) {
			response.setStatusCode(201);
			response.setMeaasage("success");
			response.setDescription("data modified in the db");
		}else {
			response.setStatusCode(401);
			response.setMeaasage("failure");
			response.setDescription("data not modified in the db");
		}
		return response;
	}
	
	@DeleteMapping(path="/delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable("id")int id) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.deleteEmployee(id)) {
			response.setStatusCode(201);
			response.setMeaasage("success");
			response.setDescription("data deleted in the db");
		}else {
			response.setStatusCode(401);
			response.setMeaasage("failure");
			response.setDescription("data not deleted in the db");
		}
		return response;
	}
	
	@GetMapping(path="/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id")int id) {
		
		EmployeeResponse response = new EmployeeResponse();
		EmployeeBean bean = service.getEmployee(id);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMeaasage("success");
			response.setDescription("data found in the db");
			response.setEmployeeBeans(Arrays.asList(bean));
		}else {
			response.setStatusCode(401);
			response.setMeaasage("failure");
			response.setDescription("data not found in the db");
		}
		
		return response;
	}
	
	@GetMapping(path = "/get-all",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee() {
		EmployeeResponse response = new EmployeeResponse();
		List<EmployeeBean> beans = service.getAllEmployee();
		if(!beans.isEmpty()) {
			response.setStatusCode(201);
			response.setMeaasage("success");
			response.setDescription("data found in the db");
			response.setEmployeeBeans(beans);
		}else {
			response.setStatusCode(401);
			response.setMeaasage("failure");
			response.setDescription("data not found in the db");
		}
		return response;
	}
	
	@GetMapping(path="/exce",produces = MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		int i = 1/0;
		
	}

}
