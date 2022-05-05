import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int input=0;
        
        while (input != 5) {
            System.out.println("Pick a number: ");
            input = scanner.nextInt(); 
        }

    }
}
