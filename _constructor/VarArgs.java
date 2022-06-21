package _constructor;

public class VarArgs {
	
	public int sum(int...ar) { //개수에 상관없이 들어오라는 뜻. but 배열로 인식해서 방 세개 잡음.
		int hap = 0;
		for (int i=0; i<ar.length; i++) {
			hap += ar[i];
		}
		return hap;
		
	}
	public void sum(Object...ar) { //개수에 상관없이 모든 자료형 들어오라는 뜻. but 배열로 인식해서 방 세개 잡음.
		
	}
	
	public int sum(int a, int b) { // 매개변수 parameter, 인수 argument.
		return a+b;
	}
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	public int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println("합 = " + va.sum(1,  2));
		System.out.println("합 = " + va.sum(1,  2, 3));
		System.out.println("합 = " + va.sum(1,  2, 3, 4));

	}

}
