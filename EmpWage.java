import java.util.Random;

public class EmpWage{

int empCheck, WageperHr=20, Fullday=8;
float DWage=0;
void AttendanceFunc(){

	Random ran = new Random();

	empCheck = ran.nextInt(2);
	if(empCheck==0)
		System.out.println("Present");
	else
		System.out.println("Absent");
}

void DailyWage(){
	if(empCheck==0){
		DWage=Fullday*WageperHr;
		System.out.println("Daily Wage: "+DWage);
	}
	else
		System.out.println("Daily Wage: "+DWage);
	}

public static void main(String args[]){

System.out.println("Welcome to Employee Wage Program in JAVA");
EmpWage emp = new EmpWage();
emp.AttendanceFunc();
emp.DailyWage();
	}
}
