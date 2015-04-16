/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.oop
 * |_ Car
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author 	 : 김채린
 * @version  :1.0
 */
public class Car2 {

		private String company;
		private String model;
		private String color;
		private int maxSpeed;
		private int price;
		
		public Car2() {
		}  //기본 생성자
		
		
		public Car2(String newcompany, String newmodel, String newcolor, int newmaxSpeed, int newprice) {
			company =newcompany;
			model = newmodel;
			color= newcolor;
			maxSpeed = newmaxSpeed;
			price = newprice;
		}
		
		
		public String getCompany() {
			return company;
		}
		public String getModel() {
			return model;
		}
		public String getColor() {
			return color;
		}
		public int getMaxSpeed() {
			return maxSpeed;
		}
		public int getPrice() {
			return price;
		}
		
		
		
		
		
		
		
		
}








