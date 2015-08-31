/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.inheritance
 * |_ SmartPhone
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 *
 * @author 	 : 김채린
 * @version  :1.0
 */
public class SmartPhone {
	
	private String model;
	private String comany;
	private int price;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone (String model, String company,int price ) {
	   this.model= model;
	   this.comany= company;
	   this.price = price;
	   
	}
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		
		
	}
	
	public void pay() {
		
	}

	
	public String toString() {
		return "SmartPhone [model=" + model + ", comany=" + comany + ", price="
				+ price + "]";
	}
	
	
	
	
	
	
	
	
	
}
