import java.util.*;

public class Program {
    public static void main(String args[]){
        Random num = new Random();
        Scanner scan = new Scanner(System.in);
        int myGuess = 0;
        int compGuess = 0;
        System.out.println("I'm thinking of a number between 1 and 10. What number am I thinking of???");
        myGuess = scan.nextInt();
        compGuess = num.nextInt(10) + 1;
        if (myGuess == compGuess){
            System.out.println("You must be a mind reader!!");
        }
        else System.out.println("Incorrect. I'm just too unpredictable");
    }
}
