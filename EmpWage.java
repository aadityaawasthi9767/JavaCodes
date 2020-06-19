import java.util.Random;

public class EmpWage
{
public static int[] WageRecords=new int[20];
public int counter=0;
public static int sum=0,DWage=0;
public static int Max_number_Days=20;
public static int Max_Hrs=100;
public static int numDays=0;
public static int HrsperDay=0;
public static int empCheck, WageperHr=20, Fullday=8, Halfday=4;



	void DailyWage(){

     while(Max_number_Days>numDays && Max_Hrs>HrsperDay){

		for(int i=0;i<Max_number_Days;i++)
		{
			Random ran = new Random();
			empCheck = ran.nextInt(3);

	   	switch(empCheck)
   		{
      	case 0:
					 //int DWage=0;
            numDays++;
            DWage=Fullday*WageperHr;
            WageRecords[counter]=DWage;
            counter++;

         	//emp.DailyWage(Fullday,WageperHr);
         	HrsperDay=HrsperDay+Fullday;
         break;

      	case 1:
				 //int DWage=0;
            numDays++;
            DWage=Halfday*WageperHr;
            WageRecords[counter]=DWage;
            counter++;

         	//emp.DailyWage(Halfday,WageperHr);
         	HrsperDay=HrsperDay+Halfday;
         break;

      	case 2:
         	System.out.println("Absent! Sorry, NO WAGE TODAY.");
         	//emp.DailyWage(0,WageperHr);
				 //int DWage=0;
            numDays++;
            DWage=0*WageperHr;
            WageRecords[counter]=DWage;
            counter++;

         	HrsperDay=HrsperDay+0;
         break;
   		default:
         	System.out.println("Not a Valid Entry!");
   		}
		}


				/*int DWage=0;
				numDays++;				
				DWage=a*b;
				WageRecords[counter]=DWage;
				counter++;*/
		}
	}

	void displayWage(){

		for(int i=0;i<WageRecords.length;i++)
		{
			System.out.println("Today's Wage:"+WageRecords[i]);
			sum=sum+WageRecords[i];
		}
			System.out.println("Monthy Salary: "+sum);
	}


public static void main(String args[])
{

//int empCheck, WageperHr=20, Fullday=8, Halfday=4,Max_Of_Days=20, numDays=0, Max_Hrs=100,HrsperDay=0;
//float DWage=0;
EmpWage emp= new EmpWage();
System.out.println("Welcome to Employee Wage Program in JAVA");

emp.DailyWage();
//System.out.println(HrsperDay);
emp.displayWage();
}
//System.out.println(""+HrsperDay);
}
