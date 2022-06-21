package _collection;

import java.util.ArrayList;

public class CollectionMain2 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); 
		//위에껀 <Object> 생략되어있다. 아래처럼 문자형 넣으면 지정 가능하다.
		//ArrayList<String> list = new ArrayList();
		
		list.add(25); //index 0번째
		list.add(43.8); // 1번째
		list.add("호랑이"); // 2번째
		list.add("사자"); // 3번째
		list.add("기린"); // 4번째
		list.add("코끼리"); // 5번째
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------------");
		
		for (Object data : list) {
			System.out.println(data);
		}
	}

}
