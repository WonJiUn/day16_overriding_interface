package interface_ex;

import java.util.Scanner;

//인터페이스 상속받는 방법 : implements 클래스명
//역시 오버라이딩 해주지 않으면 오류발생(마우스 갖다대고 뜨는 메시지로 자동삽입가능)
class B지상군 implements A공방{
	public void 총알구비() {
		System.out.println("총알을 장전합니다");
	}

	@Override
	public void attack() {
		총알구비();
		System.out.println("지상군이 공격합니다");
		
	}
	public void 방패착용() {
		System.out.println("방패착용");
	}

	@Override
	public void defense() {
		방패착용();
		System.out.println("지상군이 방어합니다");
		
	}
	
}
class B공군 implements A공방{

	@Override
	public void attack() {
		System.out.println("공군이 공격합니다");
		
	}

	@Override
	public void defense() {
		System.out.println("공군이 방어합니다");
		
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		
		A공방 공방 = null;
		
		System.out.println("적이 쳐들어 왔습니다");
		System.out.println("1.지상군 2.공군");
		int choice = 0;
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num == 1) {
			System.out.println("지상군 선택");
			공방 = new B지상군();
		}
		else {
			System.out.println("공군 선택");
			공방 = new B공군();
		}
		System.out.println("1.공격 2.방어");
		choice = input.nextInt();
		
		/*
		if(choice == 1 && num == 1) 공방.attack();
		else if(choice == 2 && num == 1) 공방.defense();
	
		if(choice == 1 && num == 2) 공방.attack();
		else if(choice == 2 && num == 2) 공방.defense();
		*/
		
		if(choice == 1)	공방.attack();
		else 공방.defense();
		
	}
}
