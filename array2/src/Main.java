
public class Main {
    public static void main(String[] args) {
        int[] integers = new int[10];
        int sum = 0;
        for(int i = 0; i < integers.length; i++){
            int random = (int)(Math.random() * 100) + 1;
            integers[i] = random;
            sum = sum + integers[i];
            System.out.println(integers[i]);



        }
        System.out.println("The average is "+sum / 10);
    }
}
