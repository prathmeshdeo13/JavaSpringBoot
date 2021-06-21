package com.example.FullStackJavaBatchMarch;

import com.example.FullStackJavaBatchMarch.di.Company;
import com.example.FullStackJavaBatchMarch.di.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FullStackJavaBatchMarchApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FullStackJavaBatchMarchApplication.class, args);

		Company company = context.getBean(Company.class);
		company.showEmpInfo();

		Company company1 = context.getBean(Company.class);
		company1.showEmpInfo();
	}

}
