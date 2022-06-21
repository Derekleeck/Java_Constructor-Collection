package _constructor;

public class constructorMain {
	public static void main(String[] args) {
		constructorTest aa = new constructorTest(); // test에 있는 생성자 호출
		System.out.println("객체aa =" + aa);
		System.out.println(aa.getName() + ", " + aa.getAge()); 
		System.out.println();
		
		constructorTest bb = new constructorTest("홍길동");
		System.out.println("객체bb = " + bb);
		System.out.println(bb.getName() + ", " + bb.getAge()); 
		System.out.println();
		
		constructorTest cc = new constructorTest(25);
		System.out.println("객체cc = " + cc);
		System.out.println(cc.getName() + ", " + cc.getAge()); 
		System.out.println();
		
		
	}
}


