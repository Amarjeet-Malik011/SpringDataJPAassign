package com.ttn.springDataJPApractise;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(PersistenceContext.class);
		Employee employee=context.getBean(Employee.class);
		employee.setName("Amarjeet Malik");
		employee.setAge(21);
		employee.setId(1);
		employee.setSalary(15000);
		EmployeeRepository employeeRepository=context.getBean(EmployeeRepository.class);
		employeeRepository.save(employee);
		Employee employee1=employeeRepository.findById(1);
		System.out.println(employee1);
		
	}
}
