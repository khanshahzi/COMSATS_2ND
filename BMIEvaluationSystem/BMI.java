package bmi;
import java.util.Scanner;
public class BMI {
 public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your weight");
        double weight=input.nextDouble();
         System.out.println("weight is:"+weight);
          System.out.println("enter your height");
        double height=input.nextDouble();
        System.out.println("height is:"+height);
       final double kiloperpound= 0.45359237; 
       final double meterperinch= 0.0254;
         double heightininch=height*meterperinch;
      System.out.println("heightininch is:"+heightininch);
      double weightinkilo=weight*kiloperpound;
      System.out.println("weightinkilo is:"+weightinkilo);
              double BMI=weightinkilo/heightininch*heightininch;
        System.out.println("BMI is:"+BMI);
        if(BMI<18.5)
        {
            System.out.println("underweight");
        }
        else if(BMI<25 && BMI>=18) 
        {
            System.out.println("normal");
        }
        else if(BMI<30 && BMI>=25)
        {
            System.out.println("OVERWEIGHT");
        }
        else if (BMI>=30)
        {
            System.out.println("obese");
        }
        else 
        {
            System.out.println("weight is in bad condition");
        } 
 }
}
