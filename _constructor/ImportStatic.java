package _constructor;

//import static java.lang.Math.random; //static으로 java lang math에 random이라는 메서드가 있다.
//import static java.lang.Math.pow;
import static java.lang.System.out;
import static java.lang.Math.*;//---> java.lang에 있는 모든 math 메소드들을 static 선언

public class ImportStatic {

	public static void main(String[] args) {
		out.println("난수 = " + random());//0.1-0.99 
		System.out.println("제곱 = " + pow(2, 5)); //2의 5승 계산 --> pow 앞에 math 선언 안해줘도 된다. static에 Math 선언했으니까
		
		
		
		
		
	}

}
