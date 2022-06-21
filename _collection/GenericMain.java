package _collection;

class GenericTest<T>{
	private T a;
	
	public void setA(T a) {
		this.a = a;
		
	}
	public T getA() {
		return a;
	}
}


public class GenericMain {
	
	public static void main(String[] args) {
		GenericTest<Integer> aa = new GenericTest();
		aa.setA(12);
		System.out.println("나이 + " + aa.getA());
		
		//aa.setA("홍길동"); --> Integer 타입 걸어놔서 에러남.
		//so 밑에처럼
		GenericTest bb = new GenericTest();
		bb.setA("홍길동");
		System.out.println("이름 = " + bb.getA());
	}

}

//기본형 int를 클래스화 했다 => integer //이런걸 레퍼클래스라고 함.