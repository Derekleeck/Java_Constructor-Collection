package _constructor;

import java.util.Scanner;

public class MemberService {
	private MemberDTO[] ar = new MemberDTO[5];
		public void menu() {
			Scanner scn = new Scanner(System.in);
			int num;
			int count=0;	
			while(true) {
				System.out.println();
				System.out.println("**************");
				System.out.println("	1.가입");
				System.out.println("	2.출력");
				System.out.println("	3.수정");
				System.out.println("	4.탈퇴");
				System.out.println("	5.끝내기");
				System.out.println("**************");
				System.out.println("번호 :  ");
				num = scn.nextInt();
				if(num==5)break;
	
				if(num==1) {
					count++;
					insertMember();
					System.out.println("등록 완료 : " + (ar.length-count) + "자리 남았습니다");
					continue;
				}
				
				else if(num==2) {
					System.out.println("이름\t나이\t핸드폰\t\t주소");
					 	list();
						continue;
				}	
				else if(num==3) {
					updateMember();
					continue;
				}
				else if(num==4) {
					deleteMember();
				}
		}	
}

	private void insertMember() {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("이름 입력 :");
		String name =scn.nextLine();
		System.out.print("나이 입력 :");
		int age = scn.nextInt();
		scn.nextLine(); // int 엔터 먹음 ---> nextline 도 단어입력할떄는 scn.next로
		System.out.print("휴대폰 번호 입력 :");
		String phone = scn.nextLine();
 		System.out.print("주소 입력 :");
		String address = scn.nextLine();
		
			for(int i=0; i<ar.length; i++) { 
				if(ar[i] == null) { // memory 갔다가 돌아오면서 null 값을 만듬
					ar[i] = new MemberDTO(name, age, phone, address);
				break;
				}
			}
			
	}
	private void list() {
			for(int i=0; i<ar.length; i++) {
				if(ar[i] != null) {
				 System.out.println(ar[i].getName() + "\t"
									+ar[i].getAge() + "\t"
									+ar[i].getPhone() + "\t"
									+ar[i].getAddress());
				} 
						
			}
	}
	private void updateMember() {
		Scanner scn = new Scanner(System.in); 	
		System.out.print("회원 핸드폰 번호 입력 : ");
		String phone = scn.nextLine();
			for(int i=0; i<ar.length; i++) {
				if(ar[i] != null) {
					if (phone.equals(ar[i].getPhone())) {
						System.out.print("이름 수정 : "); //이름 수정
						String newName = scn.next();
						newName = ar[i].getName();
							
						System.out.print("나이 수정 : ");
						int newAge = scn.nextInt();
						newAge = ar[i].getAge();
							
						System.out.print("변경 후 핸드폰 번호 : ");
						String newNum = scn.next();
						newNum = ar[i].getPhone();
							
						System.out.print("수정 주소 입력 : ");
						String newAddress = scn.next();
						newAddress = ar[i].getAddress();
							
						System.out.println("수정 완료");
						break;
					}
				}
			}	
			for(int j=0; j<ar.length; j++) {	
					if (!phone.equals(ar[j].getName())) { 
						System.out.println("핸드폰 번호 입력  : "); //번호 일치 여부
						phone = scn.next();
						System.out.println("찾고자 하는 회원이 없습니다.");
						break;
					}
			}
	}
	private void deleteMember() {
			
	}
	
			
}
