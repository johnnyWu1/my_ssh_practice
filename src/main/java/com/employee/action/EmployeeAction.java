package com.employee.action;

import com.employee.domain.Employee;
import com.employee.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 员工管理的Action类
 * @author wyq
 *
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {
	
	//模型驱动使用的对象
	private Employee employee = new Employee();
	
	@Override
	public Employee getModel() {
		return employee;
	}
	
	private EmployeeService employeeService;
	
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}



	/**
	 * 登录执行的方法：
	 * @return
	 */
	public String login(){
		
		System.out.println("login执行了。。。。");
		return NONE;
	}

	

}
