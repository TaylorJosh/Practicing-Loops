import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");

        int userNum = scanner.nextInt();
        int i;


        for (i=1; i<11; i++){
            System.out.println((userNum) + " x " + i + " = " + (userNum * i));
        }


    }
}
