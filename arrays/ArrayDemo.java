import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of elements in array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter"+n+"values:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the values in the array are: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        
        
    }
}
