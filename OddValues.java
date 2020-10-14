
import java.util.Scanner;
public class OddValues {


	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] arr = new int[5];
		 System.out.println("Enter all the elements:");
	        for (int i = 0; i<arr.length; i++) 
	        {
	            arr[i] = sc.nextInt();
	        }
	        System.out.println("Odd Numbers: ");
	        for(int i=0;i<arr.length;i++)
	        {
	        	if(arr[i] % 2 !=0){
	        		System.out.println(arr[i]+" ");
	        	}
	        }
	}

}
