import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Are you ready for the quiz?");
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        System.out.println("Here it comes!");
        System.out.println("Q1) What is the capital of Alaska");
        System.out.println("          1) Melbourne");
        System.out.println("          2) Anchorage");
        System.out.println("          3) Juneau");
        String ans1 = scanner.nextLine();
        int answer1 = Integer.parseInt(ans1);
        if (answer1 == 3) {
            System.out.println("That`s right.");
            ans ++;
        } else System.out.println("Wrong answer");
        {
        }
        System.out.println("Q2) Can you store the value 'cat' in a variable of type int");
        System.out.println("          1) Yes");
        System.out.println("          2) No");
        String ans2 = scanner.nextLine();
        int answer2 = Integer.parseInt(ans2);
        if (answer2 == 2) {
            System.out.println("That`s right.");
            ans ++;
        } else System.out.println("Sorry 'cat is a string. ints can only store numbers");
        {
        }
        System.out.println("Q3) What is the result of 9+6/3");
        System.out.println("          1) 5");
        System.out.println("          2) 11");
        System.out.println("          3) 15/3");
        String ans3 = scanner.nextLine();
        int answer3 = Integer.parseInt(ans3);
        if (answer3 == 2) {
            System.out.println("That`s right.");
            ans ++;
        } else System.out.println("Wrong answer");{}
        System.out.println("Overall, you got "+ans+" out of 3 correct");
        System.out.println("Thanks for playing");
    }
}