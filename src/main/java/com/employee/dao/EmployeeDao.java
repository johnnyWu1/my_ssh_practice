package com.employee.dao;

import com.employee.domain.Employee;

/**
 * 员工管理的DAO接口
 * @author wyq
 *
 */
public interface EmployeeDao {

	Employee findByUserNameAndPassword(Employee employee);

}
