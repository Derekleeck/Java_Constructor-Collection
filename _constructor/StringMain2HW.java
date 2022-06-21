package _constructor;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringMain2HW {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int index = 0;
		int count = 0;
		
		while(true) {

			System.out.print("문자열을 입력하시오 : ");
			String n = scn.next().toLowerCase();
					
			System.out.print("바꿀 문자열 선택 : ");
			String target = scn.next().toLowerCase();
			
			System.out.print("뭐로 바꾸시겠습니까 : ");
			String replacing = scn.next();
	
			if (n.length() < target.length()) {
				System.out.println("입력한 문자열의 크기가 너무 큽니다.");
				continue;
			}
			if (n.length() > target.length()) {
				System.out.println("입력한 문자열의 크기가 작습니다.");
				System.out.println("치환하지 못하였습니다.");
			}
			else {
				while((index = n.indexOf(target, index)) != - 1) {
				count++;
				index = index+target.length();
				System.out.println(count+ "개 치환");
				}	
			}
		
		}
	}
}



/*15줄 정도 나옴
[문제] 치환하는 프로그램을 작성하시오 - indexOf(), replace() - 순환해서 바꾸는게 아니라 한번에 바꿈
- String 클래스의 메소드를 이용하시오
- 대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba      
현재 문자열 입력 : aa      
바꿀 문자열 입력 : dd
ddbba
1번 치환
---------------------
문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환
----------------
문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환
----------------
문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환
----------------
문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다

*/







