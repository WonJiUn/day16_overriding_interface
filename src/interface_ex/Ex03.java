package interface_ex;

interface Test{
	//public int a;		인터페이스에서는 이런식으로 변수를 만들수는 없음. 스태틱 파이널 변수만 가능
	public static final int a = 12345;
	public final int a1 = 12345;
	public static int a2 = 12345;
	public static String id = "홍길동";
	public static String pwd = "12345";
}

public class Ex03 implements Test{
	public static void main(String[] args) {
		
		System.out.println(Test.id);
		System.out.println(pwd);
		//모든곳에서 공통적으로 쓰는 변수는 이런식으로 인터페이스를 통해 사용가능하다
		
	}
}
