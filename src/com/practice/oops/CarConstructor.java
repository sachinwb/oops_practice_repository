package com.practice.oops;

public class CarConstructor {
	
	String color;
	boolean isAutomatic;
	
	CarConstructor()//ZERO-ARG CONSTRUCTOR
	{
		
	}
	
	CarConstructor(String color,boolean isAutomatic)//PARAMETARIZE CONSTRUCTOR
	{
		this.color=color;
		this.isAutomatic=isAutomatic;
	}
	
	
	public static void main(String[] args) {
		CarConstructor carconstructor1 = new CarConstructor();//ZERO-ARG CONSTRUCTOR
		carconstructor1.color="Black";
		carconstructor1.isAutomatic=true;
		System.out.println(carconstructor1.color);
		System.out.println(carconstructor1.isAutomatic);
		
		CarConstructor carconstructor = new CarConstructor("white",true);//PARAMETARIZE CONSTRUCTOR
//		carconstructor.car();
		System.out.println(carconstructor.color);
		System.out.println(carconstructor.isAutomatic);
	}

}
