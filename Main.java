package com.cg.MIS.main;

import java.util.Scanner;

import com.cg.MIS.Exception.EmployException;
import com.cg.MIS.presentation.Employee;
import com.cg.MIS.service.EmployServiceImpl;

public class Main{
static EmployServiceImpl service=new EmployServiceImpl(); 
Employee emp= new Employee();
static Scanner scanner=null;
 static int choiceflag=1;
 String name,designation,scheme;

static String option;
 int salary;
 int Id;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("*** Welcome to the employee medical insurance scheme***** ");
		do 
		{
	            do 
	            {
	            	System.out.println("The following services are offered:");
	            	System.out.println("1.available insurance schemes\n 2.display your details ");
	            	int choice=scanner.nextInt();
	            	Main object=new Main();
	            	switch (choice)
	            	{
	            	case 1: object.insurancescheme();
	            	          choiceflag=1;
	            	       break;
	            	case 2: if(choiceflag==1)
	            		 object.getdetails();
	            	else
	            		 System.out.println("enter your details"); 
	            		
	            	         break;
	            	 default:
	            		 System.out.println("enter option from only 1 to 2 ");
	            	}
	            		
	            	}while(choiceflag==0);
	            
	            	System.out.println("enter your choice: Y=yes or N=no ");
	            	 option=scanner.next();
	        } while(option.equalsIgnoreCase("y"));
	}
	
    private void getdetails(){
  	  System.out.println(" enter your details:");
  	  System.out.println("name=  "+emp.getName() + " salary=" +emp.getSalary()+"ID ="+emp.getId()+
  			  "designation= "+emp.getDesignation()+ "insurancescheme=  "+emp.getInsurancescheme());
    }
    private void insurancescheme() 
    {    boolean result=true,result1;
    	System.out.println("enter your employee details: ");
    	System.out.println("enter your id: ");
    	Scanner scanner =new Scanner(System.in);
    	int id= scanner.nextInt();
    	 do {	
    		 			System.out.println("enter your name: ");
            			name=scanner.nextLine();
            			result= service.isNameValid(name);
            			if (result) {
				    		
        				}
            			else 
        				System.out.println("invalid name"); 
        				
    		}while(!result);
    			System.out.println("enter your salary: ");
    			scanner= new Scanner(System.in);
    			salary=scanner.nextInt();
    			scanner=new Scanner(System.in);
    	do {
    		
    		System.out.println("enter your designation: ");
    		designation=scanner.nextLine();
				result1=service.isDesignationValid(designation);
				if(result1){
					
				}else 
							System.out.println("invalid designation ");
		}while(!result1);
    	          
    			System.out.println("successfully registered wity your details ");
    			emp.setName(name);
    			emp.setId(id);
    			emp.setSalary(salary);
    			emp.setDesignation(designation);
    		
					scheme= service.getInsurancescheme(salary,designation);
					
		    		if (scheme.equals(" invalid input"))
		    		{
		    			System.out.println("invalid inputs");
		    		}
		    		else 
		    		{
		    			emp.setInsurancescheme(scheme);
		    			System.out.println("your available insurance scheme is: ");
		    		}
				} 
    	}
    
    


		
		
		
		
		
		
		
		
		
		
		
	


	    



	

			
   
