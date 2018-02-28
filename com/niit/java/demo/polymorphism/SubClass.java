package com.niit.java.demo.polymorphism;

//extends ->  Inheriting SuperClass properties in SubClass
public class SubClass extends SuperClass{
	
	//redefined the method  -- overriding -- runtime polymorphism
	void superClassMethod()
	{
		super.superClassMethod();
		System.out.println("This is in Sub class");
	}


}
