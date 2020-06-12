import java.util.Random;

public class EmpWage{

void DailyWage(int a, int b){
		DWage=a*b;
		System.out.println("Daily Wage: "+DWage);
	}

public static void main(String args[]){

int empCheck, WageperHr=20, Fullday=8, Halfday=4;
float DWage=0;

EmpWage emp= new EmpWage();
System.out.println("Welcome to Employee Wage Program in JAVA");
Random ran = new Random();
empCheck = ran.nextInt(3);

switch(empCheck){
	case 0:
			System.out.println("Present, FULL DAY!");
			emp.DailyWage(Fullday,WageperHr);
			break;

	case 1:
			System.out.println("Present, HALF DAY!");
			emp.DailyWage(Halfday,WageperHr);
			break;

	case 2:
			System.out.println("Absent! Sorry, NO WAGE TODAY.");
			break;
default:
			System.out.println("Not a Valid Entry!");
		}
	}
}
