package javaapplication126;
import java.util.Scanner;
public class JavaApplication126 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println("this is leap year");
        }
        else {
            System.out.println("this is not leap year");
        }
    }
    
}
