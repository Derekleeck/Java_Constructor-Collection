package _collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("book101","백설공주");
		map.put("book201","인어공주");
		map.put("book102","백설공주");//value 중복허용 //key는 안날라가는데 포인터가 가르키는 value가 바뀜
		map.put("book301","피오나");
		map.put("book101","엄지공주");//key 중복허용. but 전에꺼 소실
		
		System.out.println(map.get("book101"));
		System.out.println(map.get("book501")); //key값이 없을 경우 null값으로 나온다.
		
	 }

}
