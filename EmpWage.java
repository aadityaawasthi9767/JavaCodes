import java.util.Random;
//import java.util.String;
public class EmpWage
{
public static int[] WageRecords=new int[20];
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
		for(int i=0;i<19;i++)
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
System.out.println("Welcome to Employee Wage Program in JAVA");
EmpWage emp1= new EmpWage("DMart",20,20,100);
EmpWage emp2= new EmpWage("AllFreash",50,25,200);
//System.out.println("Welcome to Employee Wage Program in JAVA");

emp1.DailyWage("DMart",20,20,100);
emp2.DailyWage("AllFresh",50,25,200);
//emp1.displayEmpWage();
//emp2.displayEmpWage();
}

}
