import java.io.*;
import java.lang.String;
class Main{
    public static void main(String args[]){
        StringBuilder sb1=new StringBuilder("Hello");
          System.out.println("the string is: "+sb1);
        sb1.append("java");
       System.out.println("the string is: "+sb1);
           StringBuilder sb2=new StringBuilder("Hello");
           sb2.insert(2,"java");
             System.out.println("the string is: "+sb2);
        StringBuilder sb3=new StringBuilder("Hello");
        sb3.replace(1,4,"java");
         System.out.println("the string is: "+sb3);
          StringBuilder sb4=new StringBuilder("Hello");
          sb4.delete(1,3);
           System.out.println("the string is: "+sb4);
           StringBuilder sb5=new StringBuilder("Hello");
           sb5.reverse();
            System.out.println("the string is: "+sb5);
            
    }
}
