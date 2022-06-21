package _collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("호랑이"); 
		set.add("사자"); 
		set.add("기린");
		set.add("호랑이");// 중복 허용 (순서)
		set.add("코끼리");
		
		Iterator<String> it = set.iterator(); //set 은 데이터 저장순서가 없다. 리스트는 있다.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
