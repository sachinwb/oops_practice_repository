package com.practice.oops;

public class StaticPractice {
 
	//static variable
	static String brandName="Lenovo";
	
	//non static variable
	String color="Yellow";
	
	//static method
	static String getBrandName()
	{
		return brandName;
	}
	
	//non static method
	void changeColor(String newColor)
	{
		color = newColor;
		System.out.println(color);
	}
	
	
	
	public static void main(String[] args) {
		
//		StaticPractice staticPractice1 = new StaticPractice();
//		staticPractice1.brandName="hp";
//		staticPractice1.color="Black";
////		System.out.println(staticPractice1.brandName);
//		System.out.println(staticPractice1.color);
//		
//		StaticPractice staticPractice2 = new StaticPractice();
//		staticPractice2.brandName="lenovo";
//		staticPractice2.color="red";
//		System.out.println(staticPractice2.brandName);
//		System.out.println(staticPractice2.color);
//		
//		StaticPractice staticPractice3 = new StaticPractice();
//		System.out.println(staticPractice3.brandName);
//		System.out.println(staticPractice3.color);
		
		StaticPractice staticPractice4 = new StaticPractice();
		System.out.println("Brand name is : "+brandName);
		System.out.println(staticPractice4.color);
		System.out.println(getBrandName());
		staticPractice4.changeColor("Red");
		
	}

}
