package com.ustglobal.empwebapp.dto;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;
@Data
public class EmployeeInfo {

	private int id;
	private String name;
	private String email;
	private String password;
}
