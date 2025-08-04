import java.util.Scanner;
import java.util.Random;
class GAME{
    public static void main(String[] args) {
        String choices[] = {"ROCK","PAPER","SCISSOR"};
        System.out.println("WELCOME TO ROCK PAPER SCISSOR GAME");
        Scanner md = new Scanner(System.in);
        Random dm = new Random();
        System.out.print("ENTER YOUR CHOICHES :");
        String a = md.nextLine();
        String b = choices[dm.nextInt(3)];
        String c=a.toUpperCase();
        System.out.println("YOUR CHOICE IS : "+c);
        System.out.println("COMPUTER CHOICE IS : "+b);
        if (c.equals(b)) {
            System.out.println("THERE IS A TIE");    
        }
        else if(c.equals("ROCK") && b.equals("PAPER")){
            System.out.println("SORRY,BUT COMPUTER WINS");
        }
        else if(c.equals("ROCK") && b.equals("SCISSOR")){
            System.out.println("CONGRATULATION YOU WIN THE GAME");
        }
        else if (c.equals("PAPER") && b.equals("ROCK")){
            System.out.println("CONGRATULATION YOU WIN THE GAME");
        }
        else if(c.equals("PAPER") && b.equals("SCISSOR")){
            System.out.println("SORRY,BUT COMPUTER WINS");
        }
        else if(c.equals("SCISSOR") && b.equals("ROCK" )){
            System.out.println("SORRY,BUT COMPUTER WINS");
        }
        else if(c.equals("SCISSOR") && b.equals("PAPER")){
            System.out.println("CONGRATULATION YOU WIN THE GAME");
        }
        else{
            System.out.println("PLEASE ENTER CORRECT INPUT");
        }
        md.close();
        }

    }
    

