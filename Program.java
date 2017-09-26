import java.util.*;

public class Program {
    public static void main(String args[]){
        Random num = new Random();
        Scanner scan = new Scanner(System.in);
        int userNum = 0;
        int compNum = 0;
        System.out.println("I'm thinking of a number between 1 and 10. What number am I thinking of???");
        userNum = scan.nextInt();
        compNum = num.nextInt(10) + 1;
        if (userNum == compNum){
            System.out.println("You must be a mind reader!!");
        }
        else System.out.println("Incorrect. I'm just too unpredictable");
    }
}
