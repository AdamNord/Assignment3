package Assignment3;

public class Practices {

	public static void main(String[] args) {
	
		int a=10000;
		int b=2000;
		int c=60000;
		
		if(a>b && a>c) {
			System.out.println(a +" is the biggest number.");	
		}else if(b>c) {
			System.out.println(b +" is the biggest number.");
		}else {
			System.out.println(c +" is the biggest number");
		}
		System.out.println("_________________________________");
		
		int math=100;
		int chemistry=100;
		int biology=10;
		
		double average=(math+chemistry+biology)/3;
		System.out.println("Grade is "+average);
		
		if(average>=90 && average<=100) {
			System.out.println("Your grade is A");
		}else if(average>=70 && average<=89) {
			System.out.println("Your grade is B");
		}else if(average>=55 && average<=69) {
			System.out.println("Your grade is C");
		}else if(average>=0 && average<=54) {
			System.out.println("You have failed the exam");
		}else
			System.out.println("Invalid grade");
			
		
		System.out.println("________________________________________");
		
		boolean RushHour=false;
		int carType=2;
		double price=0.0;
		//Write an if nested statement that shows the right price
		
		if(RushHour) {
			if(carType==1) {
				price=40.0;
				System.out.println(price);
			}else if(carType==2)
				price=25.0;	
				System.out.println(price);
		}else {
			price=15;
		System.out.println(price);
		}
		System.out.println("______________________________________");

		
		
		
		
		
		
	}

}
