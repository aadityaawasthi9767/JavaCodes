import java.util.Random;

public class EmpWage
{
public static final int IS_FULL_TIME=1;
public static final int IS_HALF_TIME=2;

	int DailyWage(String comName, int empRate, int numOfDays, int maxHoursMonth){

		int empHrs=0,totalWorkingDays=0,totalEmpHrs=0;

		while(totalEmpHrs<=maxHoursMonth && totalWorkingDays<numOfDays){

			totalWorkingDays++;
			Random ran = new Random();
			int empCheck = ran.nextInt(3);

	   	switch(empCheck)
   		{
      	case IS_FULL_TIME:
						empHrs=8;
         break;

      	case IS_HALF_TIME:
						empHrs=4;
         break;

      	case 0:
         	System.out.println("Absent! Sorry, NO WAGE TODAY.");
						empHrs=0;
         break;
   		default:
         	System.out.println("Not a Valid Entry!");
   		}
			totalEmpHrs=totalEmpHrs+empHrs;
			System.out.println("Day "+totalWorkingDays+ "Emp Hr: "+empHrs);
		}
		int totalEmpWage=totalEmpHrs*empRate;
System.out.print("Total Emp Wage for company: " +comName+"="+totalEmpWage);
return totalEmpWage;
	}

	/*void displayWage(){

		for(int i=0;i<WageRecords.length;i++)
		{
			System.out.println("Today's Wage:"+WageRecords[i]);
			sum=sum+WageRecords[i];
		}
			System.out.println("Monthy Salary: "+sum);
	}*/


public static void main(String args[])
{

EmpWage emp= new EmpWage();
System.out.println("Welcome to Employee Wage Program in JAVA");

emp.DailyWage("DMart",20,20,10);
emp.DailyWage("AllFresh",50,25,20);
}
}
