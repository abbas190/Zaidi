// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey what`s your name? (Sorry i keep forgetting;)");
        String name = scanner.nextLine();
        System.out.println("Ok " + name + ", how old are you");
        String age = scanner.nextLine();
        int Age = Integer.parseInt(age);
        if (Age < 16) {
            System.out.println( "You can`t drive." );}
            else if (Age >= 16 && Age <= 17) {
                System.out.println( "You can drive but not vote." );
            }
        else if (Age >= 18 && Age <= 24) {
            System.out.println( "You can vote but not rent a car.");
        }
        else if (Age >24) {
            System.out.println( "You can do pretty much anything.");
    }
}
}