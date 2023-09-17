import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Choose rock, paper or scissors. `r` for rock, `p` for paper and `s` for scissors");
    int end = 0;
    int win = 0;
    int lose = 0;
    while(end == 0) {
        System.out.println("***********************************************");
        System.out.println("Wins: "+win+" Losses: "+lose);
        System.out.println("Players Choice:");
        String myMove = scanner.nextLine();
        String playerMove;
        String comMove;
        String computerMove;
        String result = "error";
        int ranNum = random.nextInt(3);
        if(ranNum == 0) {
            comMove = "r";
        }
        else if (ranNum == 1) {
            comMove = "p";
        }
        else {
            comMove = "s";
        }
        if((myMove.equals("r") && comMove.equals("s"))||(
                myMove.equals("p") && comMove.equals("r"))||(
                        myMove.equals("s") && comMove.equals("p")))
        {
            if(comMove.equals("p")){computerMove = "Paper";}
            else if(comMove.equals("r")){computerMove = "Rock";}
            else {computerMove = "Scissors";}

            if(myMove.equals("p")){playerMove = "Paper";}
            else if(myMove.equals("r")){playerMove = "Rock";}
            else {playerMove = "Scissors";}
            result = "You win!";
            System.out.println(result);
            System.out.println("Player Choice: "+playerMove+"     Computer Choice: "+computerMove);

            win++;
        }
        else if((myMove.equals("r") && comMove.equals("p"))||(
                myMove.equals("p") && comMove.equals("s"))||(
                myMove.equals("s") && comMove.equals("r")))
        {
            if(comMove.equals("p")){computerMove = "Paper";}
            else if(comMove.equals("r")){computerMove = "Rock";}
            else {computerMove = "Scissors";}

            if(myMove.equals("p")){playerMove = "Paper";}
            else if(myMove.equals("r")){playerMove = "Rock";}
            else {playerMove = "Scissors";}
            result = "You Lose!";
            System.out.println(result);
            System.out.println("Player Choice: "+playerMove+"     Computer Choice: "+computerMove);

            lose++;
        }
        else if (myMove.equals(comMove)){
            if(comMove.equals("p")){computerMove = "Paper";}
            else if(comMove.equals("r")){computerMove = "Rock";}
            else {computerMove = "Scissors";}

            if(myMove.equals("p")){playerMove = "Paper";}
            else if(myMove.equals("r")){playerMove = "Rock";}
            else {playerMove = "Scissors";}
            result = "Draw!";
            System.out.println(result);
            System.out.println("Player Choice: "+playerMove+"     Computer Choice: "+computerMove);

        }
        else if (myMove.equals("x")){
            end++;
            result = "Game has ended";
        }


            }
        }
    }

