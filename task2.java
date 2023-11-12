import java.util.*;
public class task2{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Welcome To Student Grade caluculator");
		System.out.print("Enter Number of Subjects For Caluculation: ");
		int x=sc.nextInt();
		int[] a=new int[10];
		for(int i=1;i<=x;i++){
			System.out.print("Enter Marks for "+i+":- ");
			a[i] =sc.nextInt();
		}
		System.out.println();
		for(int i=1;i<=x;i++){
			System.out.println("Your Marks for "+i+" is:- "+a[i]);
		}
		int sum=0;
		for(int i=1;i<=x;i++){
			sum+=a[i];
		}
		int y=(x*100);
		System.out.println("\nTotal Marks are:- "+y);
		System.out.println("Total Marks You Secured:- "+sum+"\n");
		double avg=(sum/x);
		System.out.println("Grade Percentage is:- "+avg+"\n");
		if(avg>=90){
			System.out.println("Your Grade is:-  O");
		}
		else if(avg>=80 && avg<90){
			System.out.println("Your Grade is:-  A+");
		}
		else if(avg>=70 && avg<80){
			System.out.println("Your Grade is:-  A");
		}
		else if(avg>=60 && avg<70){
			System.out.println("Your Grade is:-  B");
		}
		else if(avg>=50 && avg <60){
			System.out.println("Your Grade is:-  C");
		}
		else if(avg>=40 && avg<50){
			System.out.println("Your Grade is:-  D");
		}
		else{
			System.out.println("Your Grade is:-  F");
		}
		System.out.println("Best Of Luck");
	}
}
	