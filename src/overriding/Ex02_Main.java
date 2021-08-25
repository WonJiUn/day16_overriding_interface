package overriding;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa() {
		System.out.println("나만의 기능입니다");
	}
	public Object get(int i) {
		return "내가 만든 get이다";
	}
}

//class BB extends String{
//	String 에는 final이 붙어있기 때문에 상속불가(오버라이딩 불가)
//	new연산으로만 사용가능. 변경하지말고 있는 그대로만 사용해야함
//}
public class Ex02_Main {
	public static void main(String[] args) {
		
		AA a = new AA();
		a.add("안녕하세요");
		System.out.println("저장값 : " + a.get(0));
		
	}
}
