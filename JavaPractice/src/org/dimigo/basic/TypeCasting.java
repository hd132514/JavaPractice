package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long rmq = 1700000;
		int people =3;
		long num = 1500;
		long year= rmq*12*num*people;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여 : "+ String.format ("%,d원\n",rmq));
		System.out.printf("점포 내 직원 수 : %d명\n",people);
		System.out.printf("점포 수 : "+ String.format ("%,d개\n",num));
		System.out.printf("연간 인건비 : "+ String.format ("%,d원",year));
	}

}
