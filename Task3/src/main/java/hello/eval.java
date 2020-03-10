package hello;

import java.util.Scanner;

public class eval {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the calculation you want perform");
		String s1=sc.next();
		System.out.println("Enter the two numbers");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		add a=new add();
		sub s=new sub();
		mul m=new mul();
		div d=new div();
		if(s1.equals("addition"))
		{
			a.addi(n,n1);
		}
		else if(s1.equals("subtraction"))
		{
			s.subt(n,n1);
		}
		else if(s1.equals("multiplication"))
		{
			m.mult(n,n1);
		}
		else if(s1.equals("division"))
		{
			d.divi(n,n1);
		}
		
	}
}
