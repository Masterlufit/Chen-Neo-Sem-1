import java.util.Scanner;
public class Lab_04_2B
{
	static float UniNum1 = 0;
	static float UniNum2 = 0;
	static float UniNum3 = 0;
	static float UniAvg = 0;
	
	public static void main(String[]args)
	{
		Lab_04_2B Method = new Lab_04_2B();
		Scanner S1 = new Scanner(System.in);
		Scanner S2 = new Scanner(System.in);
		Scanner S3 = new Scanner(System.in);
		
		System.out.println("Enter Number 1:");
		UniNum1 = S1.nextFloat();
		System.out.println("Enter Number 2:");
		UniNum2 = S2.nextFloat();
		System.out.println("Enter Number 3:");
		UniNum3 = S3.nextFloat();
		
		Method.Avg(UniNum1,UniNum2,UniNum3);
		
		Method.Print();
		
	}
	
	public void Avg(float a, float b, float c)
	{
		float Sum = UniNum1+UniNum2+UniNum3;
		UniAvg = Sum/3;
	}
	
	public void Print()
	{
		System.out.println("Average of 3 numbers is: "+UniAvg);
	}
}