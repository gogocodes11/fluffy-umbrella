import java.util.Scanner;
public class PrintArraySum 
{ 
     static int arr[] = {12,3,4,15,20}; 
       
     Scanner sc=new Scanner(System.in);
     static int sum() 
     { 
         int sum = 0; 
         int i; 
        
      
         for (i = 0; i < arr.length; i++) 
            sum +=  arr[i]; 
        
         return sum; 
     } 
       

     public static void main(String[] args)  
     { 
         System.out.println("Sum of given array is " + sum()); 
        } 
 } 
