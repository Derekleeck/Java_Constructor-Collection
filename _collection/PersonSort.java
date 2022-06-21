package _collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana","pear","peach","applemango"};
		
		System.out.println("정렬 전 + " );
		for(String str : ar) {
			System.out.println(str + " ");
		}
		System.out.println();
		
		Arrays.sort(ar);// 정렬
		
		System.out.println("정렬 후 = ");
		for(String str : ar) {
			System.out.println(str + " ");
		}
		System.out.println();
		
		System.out.println("객체 소트 - 기준을 나이로 설정.");
		PersonDTO aa = new PersonDTO("홍길동", 107);
		PersonDTO bb = new PersonDTO("네오", 30);
		PersonDTO cc = new PersonDTO("프로도", 98);
	
		List<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		System.out.println("정렬 전 = " + list);
		
		Collections.sort(list); //personDTO에 comparable걸어놔서 
		//ㄴ나이를 기준점으로 뒤집힘 //list안에 있는걸 sort 시켜준다. 컬렉션안에 있는걸 sort 시킬 땐 collections 사용하면된다.
		System.out.println("정렬 후 = " + list);
		
		System.out.println("다른 기준으로 정렬 - 이름");
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {

			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {
//				<오름차순>
//				return p1.getName().compareTo(p2.getName());

//				<내림차순>
				return p1.getName().compareTo(p2.getName())* -1; //-1 역순 0 정순
				
			}
			
		};
		
		System.out.println("정렬 전 = " + list);
		Collections.sort(list, com);
		System.out.println("정렬 후 = " + list);
	}
}


