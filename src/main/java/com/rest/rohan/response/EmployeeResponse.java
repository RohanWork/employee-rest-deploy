package com.rest.rohan.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.rest.rohan.mapper.entity.EmployeeEntity;

import lombok.Setter;

@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponse extends BaseResponse{

	public String responseMsg;
	
	public List<EmployeeEntity> getAllEmployees;
	
	public List<EmployeeEntity> getEmployeeById;
	
	public List<EmployeeEntity> createEmployee;

	public List<EmployeeEntity> auditTable;

}
