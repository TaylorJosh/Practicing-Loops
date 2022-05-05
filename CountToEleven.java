import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number less than 11");
        int userNum = input.nextInt();
        int i;
        

        for (i=userNum; i<=11; i++){
            System.out.println(i);
        }
    }
}
