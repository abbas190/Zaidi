import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your current earth weight");
        String stringWeight = scanner.nextLine();
        int weight = Integer.parseInt(stringWeight);
        System.out.println("I have the information for the following planets");
        System.out.println(" 1. Venus    2. Mars    3. Jupiter");
        System.out.println(" 4. Saturn   2. Uranus  3. Neptune");
        System.out.println("Which planet are you visiting?");
        String stringPlanet = scanner.nextLine();
        int planet = Integer.parseInt(stringPlanet);
        if (planet == 1){
            System.out.println(weight * 0.78);
        }
        else if (planet == 2){
            System.out.println(weight * 0.39);}

        else if (planet == 3){
            System.out.println(weight * 2.65);}

        else if (planet == 4){
            System.out.println(weight * 1.17);}

        else if (planet == 5){
            System.out.println(weight * 1.05);}

        else if (planet == 6){
            System.out.println(weight * 1.23);}


    }
}