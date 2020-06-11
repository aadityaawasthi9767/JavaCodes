import java.util.Random;

public class EmpWage{

int empCheck, WageperHr=20, Fullday=8, Halfday=4;
float DWage=0;
void AttendanceFunc(){

	Random ran = new Random();

	empCheck = ran.nextInt(3);
	if(empCheck==0)
		System.out.println("Present, FULL DAY!");
	else if(empCheck==1)
		System.out.println("Absent");
	else
		System.out.println("Present, HALF DAY!");
}

void DailyWage(){
	if(empCheck==0){
		DWage=Fullday*WageperHr;
		System.out.println("Daily Wage: "+DWage);
	}
	else if(empCheck==1)
		System.out.println("Daily Wage: "+DWage);
	else{
		DWage=Halfday*WageperHr;
		System.out.println("Daily Wage: "+DWage);
	}
}
public static void main(String args[]){

System.out.println("Welcome to Employee Wage Program in JAVA");
EmpWage emp = new EmpWage();
emp.AttendanceFunc();
emp.DailyWage();
	}
}
