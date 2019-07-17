package com.cg.MIS.service;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.MIS.Dao.MisDaoImpl;
import com.cg.MIS.Exception.EmployException;

public class EmployServiceImpl implements EmployServiceInt{

	@Override
	public boolean isNameValid(String name) {
		Pattern nameptn = Pattern.compile("^[A-Z]{1}[a-z]{4,}$");
		Matcher match = nameptn.matcher(name);
		if (match.matches()) {
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean isDesignationValid(String designation)  {
		Pattern nameptn = Pattern.compile("[a-z]{10}");
		Matcher match = nameptn.matcher(designation);
		if (match.matches()) {
			return true;
		}
		else
		return false;
	}

	@Override
	public String getInsurancescheme(int salary, String designation) 
	{
		if((salary>=5000 && salary < 20000 ) && (designation.equalsIgnoreCase(" system associate")))
				return" SCHEME-C";
		else if ((salary>=20000 && salary <40000)&&(designation.equalsIgnoreCase("programmer")))
				return "SCHEME-B";
		else if ((salary>=40000)&&(designation.equalsIgnoreCase("manager")))
			return "SCHEME-A";
		else if((salary<5000)&&(designation.equalsIgnoreCase("clerk")))
				return "no scheme is available";
		else
			return " invalid input";
			
		}
}
		

















