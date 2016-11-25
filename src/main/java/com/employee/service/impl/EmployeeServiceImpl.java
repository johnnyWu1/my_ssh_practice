package com.employee.service.impl;

import com.employee.dao.EmployeeDao;
import com.employee.domain.Employee;
import com.employee.service.EmployeeService;

/**
 * 员工管理的业务层实现类
 * @author wyq
 *
 */
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;

	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	/**
	 * 业务层登录的方法
	 */
	@Override
	public Employee login(Employee employee) {
		
		Employee existEmployee = employeeDao.findByUserNameAndPassword(employee);
		return existEmployee;
		
		
	}
	
	
}
