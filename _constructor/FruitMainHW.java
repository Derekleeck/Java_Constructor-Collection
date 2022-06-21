package _constructor;

class Fruit{

	String [] Fruit = {"사과", "포도", "딸기"};
	int [] JAN =  {100, 30, 25};
	int [] FEB = {80, 25 ,30};
	int [] MAR = {75, 10, 90};
	int [] TOT = new int[3] ;
	int [] TOTB = new int[3] ;
	private int sumJan, sumFeb, sumMar, Tot;
	int i = 0;
	
	public void calcTot() {
		for (i=0; i<3; i++) {
			TOT[i] = JAN[i] + FEB[i] + MAR[i];

			sumJan += JAN[i];
			sumFeb += FEB[i];
			sumMar += MAR[i];
		}
	}
	
	public void display() {
		output();
		System.out.println("--------------------------------------");
		System.out.println("\t" + sumJan + "\t" + sumFeb + "\t"+ sumMar) ;
	}
	public void output() {
		calcTot();
		System.out.println("--------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("--------------------------------------");
		for (i=0; i<3; i++) {
		System.out.println(Fruit[i] +"\t"+JAN[i] +"\t"+FEB[i]+"\t"+ MAR[i]+"\t"+TOT[i]);}
		}	
	}

public class FruitMainHW {
	public static void main(String[] args) {
		Fruit ft = new Fruit();
		ft.calcTot();
		ft.display();
	}
}		
		
//	Fruit[] ar = {}
//
//	ft.calcTot();
//	ft.display();		
//	ft.output();
//	
/*

Fruit [] ar = new Fruit[3];
Fruit [0] ar = {사과, 100, 80, 75}
Fruit [1] ar = {포도, 30, 25, 10} 
Fruit [2] ar = {딸기, 25, 30, 90} 

calcTot() 
 
 
[문제] 1사분기의 과일별 합계와 월별 합계를 구하시오 / 배열활용
클래스 : Fruit
필드  : pum, jan, feb, mar, tot
       sumJan, sumFeb, sumMar
       
메소드 : 생성자
       calcTot() 사과 월별 / 포도 월별 / 딸기 월별
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