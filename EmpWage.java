import java.util.Random;

public class EmpWage{

void AttendanceFunc(){

	Random ran = new Random();

	int empCheck = ran.nextInt(2);
	System.out.print(empCheck);
	if(empCheck==0)
		System.out.println("Present");
	else
		System.out.println("Absent");
}

public static void main(String args[]){

System.out.println("Welcome to Employee Wage Program in JAVA");
EmpWage emp = new EmpWage();
emp.AttendanceFunc();

	}
}
