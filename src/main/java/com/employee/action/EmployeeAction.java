package com.employee.action;

import com.employee.domain.Employee;
import com.employee.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
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
		//调用业务层方法
		Employee existEmployee = employeeService.login(employee);
		if(existEmployee == null){
			//登录失败
			this.addActionError("用户名或密码错误！");
			return INPUT;
		}else{
			//登录成功
			ActionContext.getContext().getSession().put("existEmployee", existEmployee);
			return SUCCESS;
		}
	}

	

}
