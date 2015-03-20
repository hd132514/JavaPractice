package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b= 10;
		double h=5.8;
		double h1= 5.4;
		
		double x= (a+b)*h/2;
		double y = a*h1;
		System.out.println("<<도형 넓이 비교>>");
		System.out.printf("사다리꼴 넓이 : %.1f\n",x);
		System.out.printf("평행사변형의 넓이 : %.1f\n\n",y);
		
		if (x>y) {
			System.out.printf("사다리꼴이 평행사변형 보다 %.1f 더 큽니다.",x-y);
		}
		
		else if (x<y) {
			System.out.printf("사다리꼴이 평행사변형 보다 %.1f 더 작습니다.",y-x);
		}
		else {
			System.out.println("사다리꼴과 평행사변형의 넓이는 같습니다.");
		}
	}

}
