package abstract_ex;

abstract class Abstract{
	protected int num;
	public void setNum(int num) {
		this.num = num;
	}
	/*
	public void combo() {
		System.out.println(num + " 단 콤보 공격");
	}
	*/
	public abstract void combo();
	//추상클래스는 자식 클래스에서 반드시 오버라이딩 해줘야 에러가 발생하지 않음
}
class NewAbstract extends Abstract{
	public void combo() {
		System.out.println(num + " 단 콤보 공격 & 2대 더 때리기");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		Abstract a = new NewAbstract();
		a.setNum(3);
		a.combo();
		
		
		
		
	}
}
