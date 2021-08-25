package casting;

import java.util.ArrayList;

class AAA{
	public String getText() {
		return "AAA 클래스";
	}
}

public class Ex03 {
	public static void main(String[] args) {
		
		Object a = new AAA();
		AAA aa = (AAA)a;
		aa.getText();
		//다운캐스팅
		//자식형태에서 부모형태로 저장하는 업캐스팅의 경우, 부모가 가지고있는 기능만 사용가능
		//자식의 고유한 기능을 쓰고싶다면 오버라이딩하거나 다운캐스팅하여 사용가능
		
		ArrayList arr = new ArrayList();
		arr.add("test");
		arr.get(0);						//object 타입으로 값을 가져옴
		String s = (String)arr.get(0);	//다운캐스팅의 예시
		
		
		
	}
}
