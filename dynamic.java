import java.io.*;
import java.util.*;
class Bike{
void run(){
    System.out.println("BIKE IS RUNNING");
}
}
public class Splender extends Bike{
    void run(){
        System.out.println("Splender is running");
    }
    public static void main(String args[]){
        Splender h=new Splender();
        h.run();
        Bike b1=new Bike();
        b1.run();
        Bike b2=new Splender();
        b2.run();
    }
}
