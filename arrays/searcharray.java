import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        int pos=-1;
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
        System.out.println("enter key element for search: ");
        int key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                pos=i+1;
                break;
            }
        }
        if(pos==-1)
        { 
        System.out.println("Elements not found:");
        }
        else{
            System.out.println(key+"element found at"+pos);
        }
        
        
        
    }
}
