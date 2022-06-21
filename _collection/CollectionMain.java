package _collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		//참조값 collection 
		coll.add("호랑이"); 
		coll.add("사자"); 
		coll.add("기린");
		coll.add("호랑이");// 중복 허용 (순서)
		coll.add("코끼리");
		
		Iterator<String> it = coll.iterator();
		while(it.hasNext()) {//true false 
			System.out.println(it.next());// 데이터 꺼내기 하고 담으로
		}
	}
}
/*
interface 사용하기 위해
1. implements
	- 모든 추상메소드를 override
	
2. 대신 Overide 해주는 클래스





*/