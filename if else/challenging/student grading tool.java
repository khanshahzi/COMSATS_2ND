package javaapplication127;
import java.util.Scanner;

public class JavaApplication127 {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int marks=input.nextInt();
if(marks<=100&&marks>90){
    System.out.println("A grade");
}
else if(marks<=90&&marks>80){
    System.out.println("B grade");
}
else if(marks<=80&&marks>70){
    System.out.println("C grade");
}
else if(marks<=70&&marks>60){
    System.out.println("D grade");
}
else{
    System.out.println("F grade");
}

    }
    
}
