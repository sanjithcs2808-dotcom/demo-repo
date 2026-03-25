import java.util.*;
public class arrayf {
public static void main(String args[])
    {   
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the sixze of the array:");
        int n=scan.nextInt();
        int arr[]= new int[n];
    
        for(int i=0;i<n;i++) //array creation
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Array:"+(Arrays.toString(arr)));
        
        int max=arr[0];
        for (int i=1;i<n;i++) //largest
        {
            if(arr[i]>max);
            max=arr[i];
        }
        System.out.println("Largest:" +max);
       
        int rev[]=new int[n];
        System.out.print("Reverse:["); //reverse
        for(int i=0;i<n;i++)
        {
        rev[i]= arr[n-i-1];
        System.out.print( rev[i] +" ");
        }
        System.out.print("]");


    }
}
