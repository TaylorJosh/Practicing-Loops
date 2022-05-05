import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);   
        
        
        while (true) {
            System.out.println("Enter a number: ");
            int userNum = input.nextInt();
                if(userNum < 0){
                    System.out.println("Number must be a positive number");
                } else if (userNum == 0){
                    break;
                } else {
                    System.out.println("Number is " + userNum);
                }

        }

    }
}
