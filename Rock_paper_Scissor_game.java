import java.util.*;
public class rockpaperscissor {
    public static void main(String str[]){
        Scanner sc=new Scanner(System.in);
        //make object of random class to take random number as input
        Random rand=new Random();
        System.out.print("ROCK PAPAER SCISSOR GAME:\n");
        System.out.print("Select one number at a time:\n1-->ROCK\n2-->Scissor\n3-->PAPER\nother input is invalid\n");
         int userinput=sc.nextInt();
         System.out.println("user input :"+userinput);
         int computerinput=rand.nextInt(3)+1;
         System.out.println("Computer input: "+computerinput);
         if(userinput>3||userinput<1){
          System.out.println("Invalid input Restart");
          sc.close();
          return;
         }
         //logic
         //rock v/s paper-->paper wins
         //paper v/s Scissor-->scissor wins
         //rock v/s Scissor-->rock wins
         if(userinput==computerinput){
            System.out.println("Match Draw!");
         }
         else if((userinput==3&&computerinput==1)||(userinput==2&&computerinput==3)||(userinput==1&&computerinput==2)){
            System.out.println("user wins!");
         }
         else{
            System.out.println("Computer wins!");
         }

         sc.close();
    }
}
