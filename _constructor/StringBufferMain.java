package _constructor;

import java.util.Scanner;

public class StringBufferMain {
	
	private int dan;
	
	public void input() {
		Scanner scn = new Scanner(System.in);
		System.out.println("원하는 단을 입력 : ");
		dan = scn.nextInt();
		
	}
	public void output() {
		StringBuffer buffer = new StringBuffer();

		for (int i=1; i<=9; i++) {
						
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			
			System.out.println(buffer);
			buffer.delete(0,buffer.length());
			
			//전에 buffer내용 지워주기
		}
	}
	
	
	public static void main(String[] args) {
		StringBufferMain sbm = new StringBufferMain();
		sbm.input();
		sbm.output();
	

	}

}
