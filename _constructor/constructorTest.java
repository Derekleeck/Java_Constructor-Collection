package _constructor;

	
public class constructorTest {
	private String name;
	private int age;
	
	public constructorTest(){ //constructor 앞에 void 들어가면 기본생성자 박탈.
			System.out.println("기본 생성자");
			System.out.println("this = "+ this);
	}
	public constructorTest(String name){ //constructor 앞에 void 들어가면 기본생성자 박탈.
		this();
		this.name = name; //name 양쪽 다 메소드꺼가 아니라, this붙은거는 class 꺼라는 뜻.
		System.out.println("this = "+ this);
	}
	public constructorTest(int age){ //constructor 앞에 void 들어가면 기본생성자 박탈.
		this("네오"); // constructor call must be placed on the first line. (1)
		this.age = age; // this 안써도 되기는 함.
		System.out.println("this = "+ this);
	}	
	public String getName() {
		
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
