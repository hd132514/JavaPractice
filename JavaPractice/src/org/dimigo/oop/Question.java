/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.oop
 * |_ Question
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 *
 * @author 	 : 김채린
 * @version  :1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("<가장 좋아하는 삼각김밥 맛은?>");
		Scanner scanner =new Scanner(System.in);
		String answer=scanner.nextLine();
		
		if (answer.equals("참치마요")) {
			System.out.println("정답입니다");
		}
		else {
			System.out.println("틀림 ㅠㅠ");
		}
		
		System.out.println("<가장 좋아하는 우유 맛은?>");
		
		String answer1=scanner.nextLine();
		if (answer1.equals("초코")) {
			System.out.println("정답입니다");
		}
		else {
			System.out.println("틀림 ㅠㅠ");
		}
		
		System.out.println("<가장 좋아하는 음식은?>");
		
		String answer2=scanner.nextLine();
		if (answer2.equals("고기")) {
			System.out.println("정답입니다");
		}
		else {
			System.out.println("틀림 ㅠㅠ");
		}
		
	}

}
