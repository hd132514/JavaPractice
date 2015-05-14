/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.oop
 * |_ Score
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author 	 : 김채린
 * @version  :1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("국어 점수 입력 =>");
		Scanner scanner = new Scanner(System.in);
		int kor =scanner.nextInt();
		System.out.println("수학 점수 입력 =>");
		int mat =scanner.nextInt();
		System.out.println("영어 점수 입력 =>");
		int eng =scanner.nextInt();
		
		System.out.println();
		
		StringBuilder sb = new StringBuilder();
		sb.append("<<점수 출력>>\n")
		.append("국어 점수:")
		.append(kor+"점\n")
		.append("수학 점수:")
		.append(mat+"점\n")
		.append("영어 점수:")
		.append(eng+"점\n")
		.append("총점 :")
		.append(kor+mat+eng+"점\n")
		.append("평균 :")
		.append(String.format("%.1f\n",(kor+mat+eng)/3.0)).toString();
		
		System.out.println(sb);
		
	}

}
