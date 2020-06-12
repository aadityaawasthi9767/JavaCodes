import java.util.Random;

class EmpWage
{
public int[] WageRecords=new int[20];
public int counter=0;
public int sum=0;


	void DailyWage(int a, int b)
	{
		int DWage=0;
		DWage=a*b;
		WageRecords[counter]=DWage;
		counter++;
	}
	void displayWage()
	{
		for(int i=0;i<WageRecords.length;i++)
		{
			System.out.println("Today's Wage:"+WageRecords[i]);
			sum=sum+WageRecords[i];
		}
			System.out.println("Monthy Salary: "+sum);
	}

public static void main(String args[])
{

int empCheck, WageperHr=20, Fullday=8, Halfday=4,Max_Of_Days=20;
float DWage=0;
EmpWage emp= new EmpWage();
System.out.println("Welcome to Employee Wage Program in JAVA");
//Random ran = new Random();empCheck = ran.nextInt(3);


for(int i=0;i<Max_Of_Days;i++)
{
Random ran = new Random();
empCheck = ran.nextInt(3);


	switch(empCheck)
	{
		case 0:
			emp.DailyWage(Fullday,WageperHr);
			break;

		case 1:
			emp.DailyWage(Halfday,WageperHr);
			break;

		case 2:
			System.out.println("Absent! Sorry, NO WAGE TODAY.");
			break;
	default:
			System.out.println("Not a Valid Entry!");
	}
}
emp.displayWage();
}
}
