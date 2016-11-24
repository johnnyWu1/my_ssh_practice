package com.employee.service.impl;

import com.employee.dao.EmployeeDao;
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
	
	
}
