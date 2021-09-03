package footballscore;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "start";
        do {

                System.out.println("Pls Enter FootBal Score Ex \"Thai 2-0 UAE\" \nExit Program Press Enter");
                input = sc.nextLine();
                FootBallLiveScore1 footBallLiveScore1 = new FootBallLiveScore1();
                FootBallLiveScore2 footBallLiveScore2 = new FootBallLiveScore2();
                FootBallScoreController footBallScoreController = new FootBallScoreController();

            if(!input.isEmpty()) {
                footBallScoreController.register(footBallLiveScore1);
                footBallScoreController.register(footBallLiveScore2);
                footBallScoreController.setInput_data(input);
            }
        }while (!input.isEmpty());


    }
}
