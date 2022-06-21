package _constructor;

class Fruit1 {
	public String pum;
	public int jan, feb, mar, tot;
	public static int sumJan, sumFeb, sumMar; 
	// static 멤버 변수로 걸어서 sumJan, sumFeb, sumMar 누적시켜줘야함
	
	public Fruit1(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}
	public void calcTot() {
		tot = jan + feb + mar;
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}
	public void display() {
		System.out.println("------------------------------------");
		System.out.println(this.pum + "\t" + this.jan + "\t" + this.feb + "\t" + this.mar + "\t" + this.tot );
	}
	public static void output() {
		System.out.println("\t" + sumJan + "\t" + sumFeb + "\t" + sumMar);
	}
}

public class FruitMainHW2 {

	public static void main(String[] args) {
		Fruit1[] ar = new Fruit1[3];
		ar[0] = new Fruit1("사과", 100, 80, 75);
		ar[1] = new Fruit1("포도", 30, 24, 10);
		ar[2] = new Fruit1("딸기", 25, 30, 90);
		
		System.out.println("------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("------------------------------------");
		for(Fruit1 f : ar){
			f.calcTot();
			f.display();
		}
		System.out.println("------------------------------------");
		Fruit1.output();
		
	}	
}
/*
Fruit [0] ar = {사과, 100, 80, 75}
Fruit [1] ar = {포도, 30, 25, 10}
Fruit [2] ar = {딸기, 25, 30, 90}

calcTot() 
 
 
[문제] 1사분기의 과일별 합계와 월별 합계를 구하시오 / 배열활용
클래스 : Fruit
필드  : pum, jan, feb, mar, tot
       sumJan, sumFeb, sumMar
       
메소드 : 생성자
       calcTot() 
       display() -----
       output() - 월별 출력 

[실행결과]
---------------------------------
PUM    JAN   FEB   MAR      TOT 
---------------------------------
사과    100    80    75        255
포도     30    25    10        xxx
딸기     25    30    90        xxx
---------------------------------
       xxx   xxx   xxx

*/