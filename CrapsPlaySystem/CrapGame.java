package crap.game;
import java.security.SecureRandom;
public class CrapGame {
    private static final SecureRandom randomnumbers=new SecureRandom();
    private enum Status{CONTI,WON,LOST};
    private static final int  SNAKEEYE=2;
    private static final int TREY=3;
    private static final int YOLEVEN=11;
    private static final int BOXCARS=12;
    private static final int SEVEN=7;
    public static void main (String[]args){
        int mypoint=0;
        Status gamestatus;
        int sumofdice=rollofdice();
        switch(sumofdice){
            case SEVEN:
            case YOLEVEN:
                gamestatus=Status.WON;
                break;
            case SNAKEEYE:          
            case BOXCARS:
            case TREY:
                gamestatus=Status.LOST;
                break;
                default :
                gamestatus=Status.CONTI;
                mypoint=sumofdice;
                System.out.println("my point is"+mypoint);
                break;
                      }
        while(gamestatus==Status.CONTI)
        {sumofdice=rollofdice();
            if(sumofdice==mypoint)
            {
                 gamestatus=Status.WON;
            }
        else
            {
                if(sumofdice==SEVEN)
                {
                     gamestatus=Status.LOST;
                }
            }
              }
            if(gamestatus==Status.WON)
        {
            System.out.println("player wins");
        }
        else{
            System.out.println("player lost");
        }
               }       
          public static int rollofdice(){
              int die1=randomnumbers.nextInt(6);
              int die2=randomnumbers.nextInt(6);
              int sum=die1+die2;
              System.out.println("sum is"+sum);
              return sum;
          }  
}