import java.util.Scanner;


public class TakeABreak {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        
        


        while (true) {
            System.out.println("Do you want to take a break?");
            String input = scanner.nextLine();
            if (input.equals("yes")){
                break;
            } else{ 
                System.out.println("Okay. Let's keep going!");
            }
        }

        System.out.println("Okay. Come back in 15 minutes!");






















    }
}
