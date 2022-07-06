import java.util.Scanner;
import java.util.*;

public class Mainsalescommission {

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the employeeid");
		int empid= sc.nextInt();
		
		System.out.println("Please enter employee name");
		String empname= sc.next();
		
		
		Salescommission mysalescommission= new Salescommission(empid,empname);
		
		System.out.println("enter total sales");
		double tsales=sc.nextDouble();
		
		
		mysalescommission.settsales(tsales);
		mysalescommission.setcommissionrate();
		mysalescommission.settsalescommission();
		
		
		System.out.println("totalsales: " + mysalescommission.gettsales());
		System.out.println("commission rate : " + mysalescommission.getcommissionrate());
		System.out.println("total sales commission : " + mysalescommission.gettsalescommission());
		
		
		
	
		
		
		
		
		
		
		

	}
 
}
