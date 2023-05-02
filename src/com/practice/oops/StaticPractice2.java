package com.practice.oops;

public class StaticPractice2 {
	
	
	public static void main(String[] args) {
		System.out.println(StaticPractice.brandName);
		System.out.println(StaticPractice.getBrandName());
		
		StaticPractice staticPractice = new StaticPractice();
		System.out.println(staticPractice.color);
		staticPractice.changeColor("Green");
	}

}
