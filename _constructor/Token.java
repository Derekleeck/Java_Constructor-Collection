package _constructor;

import java.util.StringTokenizer;

public class Token {
	public static void main(String[] args) {
		String str = "학원, 집,,게임방";

		
		StringTokenizer st = new StringTokenizer(str, ","); //3
		
		System.out.println("토큰 개수 : " + st.countTokens());
		//hasMoreTokens() - 현재 위치에 항목 있다/없다를 체크 (true false)
		//nextToken() - 현재 위치의 항목을 꺼내주고 다음 위치로 이동	
		while(st.hasMoreTokens())/*-->true false*/ {
			System.out.println(st.nextToken());
		}
		System.out.println("-------------");
		String[] ar = str.split(",");
		for(String data : ar) {
			System.out.println(data);
		}
	}

}
