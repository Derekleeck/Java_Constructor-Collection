package _constructor;

class StaticTest{
	private int a; //필드 Stack 영역에 잡힌다. '인스턴스 변수'
	private static int b;//필드 but 메모리 중 data 영역에 따로잡힌다. '클래스 변수' 클래스 소속 아님.
	
	static {
		System.out.println("초기화 영역 "); // static의 초기화 영역. 클래스 변수는 요 공간에서 초기화.
		b = 3;
		
	}
	
	public StaticTest() {
		System.out.println("StaticTest 기본생성자");
		a = 3; //--> 생성자 : a를 3으로 초기화한다. (생성자의 초기화는 값을 0000으로 돌리는게 아니고 초기값을 넣어주는 것
	
	}
	
	public void calc() {
		a++; // 필드 변수
		b++; // static
	}
	public void disp() {
		System.out.println("a = " + a + " b = " + b);
	}
	
	public static void output() {
		System.out.println("Static method .... ");
		//System.out.println("a = " + (앞에 this.생략)a + " b = " + (StaticTest.생략)b); --> a 사용불가. static range에서는 static 변수만 사용가능.
	}
}



//----------------

public class StaticMain {

	public static void main(String[] args) {
		StaticTest aa = new StaticTest();
		aa.calc();
		aa.disp();
		System.out.println();
		
		StaticTest bb = new StaticTest();
		bb.calc();
		bb.disp();
		System.out.println();
		
		StaticTest cc = new StaticTest();
		cc.calc(); // 1 1 1 -> 새로 변수를 계속만들어서 집어넣는다
		cc.disp(); // 1 2 3 -> 한개만 잡아서 계속 쓴다 
		System.out.println();
		
		StaticTest.output();
		
		//aa.a	aa.b ---> 
		//bb.a	bb.b
		//cc.a	cc.b
		
	}

}
