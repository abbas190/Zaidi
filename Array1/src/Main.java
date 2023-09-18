
public class Main {
    public static void main(String[] args) {
        int[] integers = new int[20];
        int six = 0;
        for(int i = 0; i < integers.length; i++){
        int random = (int)(Math.random() * 6) + 1;
            integers[i] = random;
            System.out.println(integers[i]);
            if (integers[i] == 6) {
                six++;

            }
            }
System.out.println("There are "+six+" six");
        }
    }
