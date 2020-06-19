import java.util.Scanner;
import java.util.Random;
//import java.util.String;
public class EmpWage
{
public static int[] WageRecords=new int[19];
public static final int IS_FULL_TIME=1;
public static final int IS_HALF_TIME=2;
public static String comName;
public static int empRate,numofDays,MaxHoursMonth;
	EmpWage(String comName, int empRate, int numofDays, int MaxHoursMonth){

	this.comName=comName;
	this.empRate=empRate;
	this.numofDays=numofDays;
	this.MaxHoursMonth=MaxHoursMonth;

	}

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
		for(int i=0;i<99;i++)
			{
				int counter=0;
				WageRecords[counter]=totalEmpWage;
				counter++;
			}


System.out.print("Total Emp Wage for company: " +comName+"="+totalEmpWage);
return totalEmpWage;
	}

	/*void displayWage(){

		for(int i=0 ; i< WageRecords.lenght() ; i++)
		{
			System.out.println("Today's Wage for"+comName+"is: "+WageRecords[i]);
			
		}
	}*/


public static void main(String args[])
{
//EmpWage emp1 = new EmpWage();
//EmpWage emp2= new EmpWage();
System.out.println("Welcome to Employee Wage Program in JAVA");
Scanner sc= new Scanner(System.in);
System.out.println("Enter Number of companies");
int numofCompanies=sc.nextInt();

for(int j=0;j<numofCompanies;j++){
	System.out.println("Enter Company name");
	comName=sc.next();

	System.out.println("Enter Employee Rate per Hour");
	empRate=sc.nextInt();

	System.out.println("Enter Maximum number Working Days");
	numofDays=sc.nextInt();

	System.out.println("Enter Maximum number of Working Hours in a Month");
	MaxHoursMonth=sc.nextInt();
	}
EmpWage emp1 = new EmpWage(comName,empRate,numofDays,MaxHoursMonth);
emp1.DailyWage(comName,empRate,numofDays,MaxHoursMonth);
//EmpWage emp2 = new EmpWage(comName,empRate,numofDays,MaxHoursMonth);
//System.out.println("Welcome to Employee Wage Program in JAVA");
}
//emp[x].DailyWage(comName,empRate,numofDays,MaxHoursMonth);
//emp[x].DailyWage(comName,empRate,numofDays,MaxHoursMonth);
//emp1.displayEmpWage();
//emp2.displayEmpWage();
}


