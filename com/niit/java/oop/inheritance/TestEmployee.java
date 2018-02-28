package com.niit.java.oop.inheritance;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		//will create instance of ContractEmployee
		
		ContractEmployee cEmployee = new ContractEmployee();
		
		//will create instance of PermanentEmployee
		
		PermanentEmployee pEmployee = new PermanentEmployee();
		
		//will set the properties for both employees.
		
		cEmployee.setEmpName("Arpit");
		cEmployee.setEmpNo(101);
		cEmployee.setSalary(100000);
		cEmployee.setDuration(60);
	//	cEmployee.set               //setDuration is not availble.
		
		pEmployee.setEmpName("Manoj");
		pEmployee.setEmpNo(102);
		pEmployee.setSalary(200000);
		pEmployee.setPf(1000);
		
		/// display the properties in console.
		
		System.out.println( cEmployee.getEmpNo()      );
		System.out.println( cEmployee.getEmpName()      );
		System.out.println( cEmployee.getSalary()      );
		System.out.println( cEmployee.getDuration()      );
		
		System.out.println( pEmployee.getEmpNo()      );
		System.out.println( pEmployee.getEmpName()      );
		System.out.println( pEmployee.getSalary()      );
		System.out.println( pEmployee.getPf()     );
		
		//System.out.println(cEmployee.setEmpName("Anant"));
		//setEmpName ->return void
		//getEmpName -> retrn string
		
		
		
		
		
	
	}

}
