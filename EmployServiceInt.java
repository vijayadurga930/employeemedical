package com.cg.MIS.service;

import com.cg.MIS.Exception.EmployException;

public interface EmployServiceInt {
	public boolean isNameValid(String name) ;
	
     public boolean isDesignationValid(String designation);
    String getInsurancescheme(int salary, String designation) ;
}
