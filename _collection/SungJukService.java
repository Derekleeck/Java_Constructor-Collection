package _collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukService {
	private Scanner scn = new Scanner(System.in);
	private ArrayList<SungJukDTO> list;
	
	public SungJukService() {
		list = new ArrayList<SungJukDTO>();
		System.out.println("생성자에서 list = " + list);
	}
	
	public void menu() {
		int num;
		
		
		while(true) {
		System.out.println();
		System.out.println("**********");		
		System.out.println("	1.입력");
		System.out.println("	2.출력");
		System.out.println("	3.검색");
		System.out.println("	4.삭제");
		System.out.println("	5.정렬");
		System.out.println("	5.끝");
		System.out.println("**********");
		num = scn.nextInt();
		
		if (num==6) break;
		}
		if (num==1) {
			insertArticle();
		}
		if (num==2) {
			printArticle();
		}
		if (num==3) {
			searchArticle();
		}
		if (num==4) {
			deleteArticle();
		}
		if (num==5) {
			sortArticle();
		}
	}
	public void insertArticle() {
		System.out.println();
		System.out.println("번호 입력 : ");
		int no = scn.nextInt();
		System.out.println("이름 입력 : ");
		String name = scn.nextLine();
		System.out.println("국어 입력 : ");
		int kor = scn.nextInt();
		System.out.println("영어 입력 : ");
		int eng = scn.nextInt();
		System.out.println("수학 입력 : ");
		int math = scn.nextInt();
	
		SungJukDTO dto = new SungJukDTO(no, name, kor, eng, math);
		dto.calc(); 
		list.add(dto);
		
	}
	public void printArticle() {
		System.out.println();
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO dto : list) {
			System.out.println((dto));
		}
	
	}
	public void searchArticle() {
		System.out.println();
		System.out.print("검색 할 이름 입력 : ");
		String name = scn.next();
		
		int sw=0;
		
		for(SungJukDTO dto : list) {
			if(dto.getName().equals(name)) {
				if(sw==0) System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(dto);
			
				sw=1;
			}
		}//for
	}
	public void deleteArticle() {
		System.out.println("삭제할 이름 입력 : ");
		String name = scn.next();	
		
		int count=0;
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO dto = it.next();
			
			if(dto.getName().equals(name)) {
				it.remove();
				count ++;
			}
		}
		if(count==0) {
			System.out.println("삭제하고자 하는 이름이 없습니다.");
		}
		else {System.out.println("데이터를 " + count + "건 삭제했습니다.");
				
		}
	}
	public void sortArticle() {
		while(true) {
			
			int num;
			
			System.out.println();
			System.out.println("1 이름으로 오름차순");
			System.out.println("2. 총점으로 내림차순");
			System.out.println("3. 이전 메뉴");
			System.out.println("    번호    ");
			num = scn.nextInt();
			if(num == 3) break;
			
			if(num == 1) {
				Collections.sort(list);
				this.printArticle();

			}else if (num==2) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {

					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
					
						return s1.getTot() < s2.getTot() ? 1: -1;
						
					}
					
				};
				Collections.sort(list, com);
				this.printArticle();
				
			}
		}
	}
}