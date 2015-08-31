/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.inheritance
 * |_ SmartphoneTest
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 *
 * @author 	 : 김채린
 * @version  :1.0
 */
public class SmartphoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone a1 = new IPhone("IPhone 6", "애플", 700000);
		SmartPhone b1 = new Galaxy("갤럭시 S6", "삼성", 650000); 
		 		 
		
		System.out.println(a1); 
		System.out.println(b1); 
		 		 
		a1.turnOn(); 
		a1.pay(); 
		a1.useSpecialFunction(); 
		a1.turnOff(); 
		
		System.out.println(); 		 
		b1.turnOn(); 
		b1.pay(); 
		b1.useSpecialFunction(); 
		b1.turnOff();
		
	}

}
