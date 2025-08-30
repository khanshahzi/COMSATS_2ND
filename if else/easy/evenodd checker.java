package javaapplication124;
import java.util.Scanner;
public class JavaApplication124 {
public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
    int num=input.nextInt();
    if(num%2==0){
        System.out.println("num is even");
    }
    else{
        System.out.println("number is odd");
    }
    }
    
}
