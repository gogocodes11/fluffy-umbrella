package avengers;
import java.util.Scanner;
public class Avenger {
	int age;
	Scanner sc=new Scanner(System.in);
	String name,power,weapon,planet;
	
	public void getDetails(){
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the age:");
		age=sc.nextInt();
		System.out.println("Enter the power:");
		power=sc.next();
		System.out.println("Enter the weapon:");
		weapon=sc.next();
		System.out.println("Enter the planet name:");
		planet=sc.next();
	}
	
	public void displayDetails(){
		System.out.println("The name is "+name+". The age is "+age+". His power is "+power+", his weapon is "+weapon+". He is from the planet,"+planet+".");
	}
}
