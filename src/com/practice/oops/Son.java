package com.practice.oops;

public class Son extends Parent {
    

	public static void main(String[] args) {
		System.out.println(address);
		Parent son = new Parent();
		System.out.println("This is the non static variable response : "+son.noOfFloors);
		son.noOfFloors=2;
		son.address="delhi";
		System.out.println("This is the static varible response :"+address);
		System.out.println("This is the non static variable response : "+son.noOfFloors);
		
		System.out.println("This is the static method response : "+getAddress());
		son.getFloor();
	}
}
