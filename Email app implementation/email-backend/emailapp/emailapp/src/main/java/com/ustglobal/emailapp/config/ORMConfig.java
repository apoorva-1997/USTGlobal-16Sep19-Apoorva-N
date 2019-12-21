package com.ustglobal.emailapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class ORMConfig {
	@Bean
	public LocalEntityManagerFactoryBean getBean() {

		LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("Mail-unit");
		return bean;	
	}
}
