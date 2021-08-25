package casting;

class A01{
	public void getText() {
		System.out.println("A클래스");
	}
}
class B01 extends A01{
	public void getText() {
		System.out.println("B클래스");
	}
}
class C01 extends A01{
	public void getText() {
		System.out.println("C클래스");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		/*
		 up casting(형변환)
		 - 자식 형태의 값을 부모 형태로 변환하는 것
		 down casting(형변환)
		 - 부모 형태에서 자식 형태로 변환하는 것
		 */
		
		/*
		B01 b = new B01();
		b.getText();
		C01 c = new C01();
		c.getText();
		*/
		//동일한 부모를 가지고 있는데 변수를 따로 만들 필요가 없으므로 보통 아래와같이 업캐스팅해서 사용
		//자식형태에서 부모형태로 저장하는 업캐스팅의 경우, 부모가 가지고있는 기능만 사용가능
		//자식의 고유한 기능을 쓰고싶다면 오버라이딩하는 경우에만 사용가능
		
		A01 a = new B01();
		a.getText();
		a = new C01();
		a.getText();
		
		
	}
}
