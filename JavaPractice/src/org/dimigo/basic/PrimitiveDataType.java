package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "아이유";
		
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : "+ name);
		
		boolean gender = true;
		if(gender) {
			System.out.println("성별 : 여자");
		}
		else {
			System.out.println("성별 : 남자");
		}
		
		int age = 23;
		double key=161.8;
		float mom = 44.3f;
		char type='A';
		
		System.out.printf("나이 : %d세\n",age);
		System.out.printf("키 : %.1fcm\n",key);
		System.out.printf("몸무게 : %.1fkg\n",mom);
		System.out.printf("혈액형 : %c",type);
		
	}

}
