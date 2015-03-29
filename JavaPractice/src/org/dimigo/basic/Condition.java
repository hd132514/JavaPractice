package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "고속버스";
		int car=0;
		int km = 10;
		int extra = 0;
		
		if (km==0) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		if (a == "고속버스") {
			car =1;
		}
		else if (a=="경차") {
			car =2;
		}
		else if (a=="그 외") {
			car = 3;
		}
		
		
		switch (car) {
		case 1:
			extra=850;
			extra += 300*(int)((km-1)/10);
			break;
		case 2:
			extra =300;
			extra += 200*(int)((km-1)/10);
			break;
		case 3:
			extra = 600;
			extra += 200*(int)((km-1)/10);
			break;
		}
		
	
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + km +"km");
		System.out.println("차종 : "+ a);
		System.out.println("통행료 : " + extra+"원");
		
		
		
		
		
	}

}
