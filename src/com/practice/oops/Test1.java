package com.practice.oops;

public class Test1 {

	String color;
	double price;
	String brand;
	
	Test1()//Zero-arg constructor
	{
		System.out.println("in zero arg constructor");
	}
	
	Test1(String color,double price,String brand)
	{
		this.color=color;
		this.price=price;
		this.brand=brand;
		System.out.println("In parametarized constructor");
	}
	
	void writing()
	{
		System.out.println("Writing.....");
	}
	public static void main(String[] args) {

		Test1 test1 = new Test1();//Default constructor
		System.out.println(test1.color);
		System.out.println(test1.price);
		System.out.println(test1.brand);
		test1.writing();
		
		Test1 test2 = new Test1("black",123456.00,"audi");		
		System.out.println(test2.color);
		System.out.println(test2.price);
		System.out.println(test2.brand);
		test2.writing();
	}
 
}
