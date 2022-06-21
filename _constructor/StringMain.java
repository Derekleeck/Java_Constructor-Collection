package _constructor;

public class StringMain {

	public static void main(String[] args) {
		String a = "apple"; //literal 생성
		String b = "apple";	//똑같은ㅇ literal은 두번이상 잡히지 않는다
		if(a==b) System.out.println("true");
			
		String c = new String("apple"); // literal과 다르게 new 실행자는 항상 공간잡음
		String d = new String ("apple");
		
		String e = "오늘 날짜는 " + 2022 + 4 + 22; // 문자열에서는 +연산자 선호안한다.(1)
		System.out.println("문자열 = " + e);
		System.out.println("문자열 크기 = " + e.length());
		System.out.println("문자열 자리 = " + e.charAt(3));
		
		System.out.println("부분 문자열 추출= " + e.substring(7)); //7 까지
		System.out.println("부분 문자열 추출= " + e.substring(7, 11)); //2022 -> 7번부터 11 이전까지
	
		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
		System.out.println("소문자 변경 = " + "Hello".toLowerCase());
	
		System.out.println("문자열 검색 = " + e.indexOf("써")); //4
		System.out.println("문자열 검색 = " + e.indexOf("날짜")); // 3
		System.out.println("문자열 검색 = " + e.indexOf("개바부")); // -1 (찾는 문자열이 없을떄)
		System.out.println("문자열 검색 = " + e.indexOf("2")); // 7
		System.out.println("문자열 검색 = " + e.indexOf("2", 0));// 0부터 시작해서 2찾아라
		System.out.println("문자열 검색 = " + e.indexOf("2", 8)); // 8 부터 시작해서 2찾아라
		
		System.out.println("문자열 치환 = " + e.replace("날짜", "일자")); //날짜를 일자로 바꿔라
	}

}


 /* (1)
문자열은 편집이 안되므로 메모리 4번 생성된다
JVM에 의해서 삭제 시 Garbage Collector로 보낸다
Garbage Collector가 실행(휴지통 비우기)되면 컴퓨터는 멈춘다
*/