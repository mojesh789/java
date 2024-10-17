import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        int pos=-1;
        int low=0;
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
        int high=n-1;
        int mid;
        while(low<=high)
        {
             mid=low+(high-low)/2;
        }
        if(arr[mid]==key)
        {
            pos=mid+1;
            
        }
        else if(arr[mid]>key)
        {
            high=mid-1;
        }
        else{
            low=mid+1;
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
