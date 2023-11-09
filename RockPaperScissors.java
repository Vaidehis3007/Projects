import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rounds you want to play - ");
        int rounds= Integer.parseInt(scanner.nextLine());

        for(int i=0;i<rounds;i++){
            playRockPaperScissors(scanner);
        }
    }

    static void playRockPaperScissors(Scanner scanner){
        System.out.println("Enter your choice - (rock/paper/scissors)");
        String playerMove = scanner.nextLine();

        Random random = new Random();
        int randomNumber=random.nextInt(3);

        String computerMove="a";

        if(randomNumber==0){
            computerMove="rock";
        }
        if(randomNumber==1){
            computerMove="paper";
        }
        if(randomNumber==2){
            computerMove="scissor";
        }

        System.out.println("Computer chose - "+ computerMove +"!");

        if(playerMove.equals(computerMove)){
            System.out.println("It's a draw!");
        }
        else if(playerWins(playerMove,computerMove)){
            System.out.println("You win!");
        }
        else{
            System.out.println("Computer wins!");
        }
    }

    static boolean playerWins(String playerMove, String computerMove){
        if(playerMove.equals("rock")){
            return computerMove.equals("scissors");
        }
        else if(playerMove.equals("paper")){
            return computerMove.equals("rock");
        }
        else{
            return computerMove.equals("paper");
        }
    }
    
}

