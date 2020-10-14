package avengers;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Avenger[] Avengers=new Avenger[5];
		
		
		for(int i=0;i<5;i++){
			Avengers[i]=new Avenger();
			Avengers[i].getDetails();
		}
	for(int i=0;i<5;i++){
		Avengers[i].displayDetails();
	}
		

	}

}
