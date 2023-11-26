import java.util.Scanner;
import java.lang.Math;
// class innings_break{ // If you want to add innings_break 
//     public void first_half_break(){
//         System.out.println("-----------------------------------------------------------------------------");
//         System.out.println("And that the end of the first innings!!!!!!");
//         System.out.println("Second innings starts very soon");
//         System.out.println("-----------------------------------------------------------------------------");
//         batbowl batbowl=new batbowl();
//         batbowl.bowling_player_1_And_batting_player_2();
//     }
// }
class batbowl{
    int min_score=1,max_score=6,player_1_hit,player_2_bowl;//player-1
    int player_1_score=0;//player-1
    int player_2_hit,player_1_bowl;
    int player_2_score=0;//player-2
    //int player_1_bat_visit=0;//player1 batting visit
    //int player_2_bat_visit=0;//player2 batting visit
    public void batting_player_1_And_bowling_player_2(int player2_batted){
        int player1_batted=1;
        //innings_break rest=new innings_break();
        System.out.println("player-1 is batting and player-2 is bowling");
        Scanner sc = new Scanner(System.in);
        // int min_score=1,max_score=6,player_1_hit,player_2_bowl;
        // int player_1_score=0;
        while(true){
            System.out.println("player_1 hit (1-6 only ) : ");
            player_1_hit=sc.nextInt();
            if(player_1_hit>6){
                System.out.println("Enter a valid input\nvalue should be between 1-6 : ");
                player_1_hit=sc.nextInt();
            }
            System.out.println("player_2 bowls (1-6 only) : ");
            player_2_bowl=min_score+(int)(Math.random()*max_score);
            System.out.println("player_1 hits : "+player_1_hit+"  player_2 bowls : "+player_2_bowl);
            if(player_1_hit==player_2_bowl){
                System.out.println("--------------------------------------------------------------------------------------------------");
                System.out.println("ooh noo!!!!!!!\nplayer-1 is out!!!!!!!!!!!!!\nthat's a magnificiant ball from player_2\nNow let's take innings break");
                System.out.println("Player_1 score is "+player_1_score);
                System.out.println("----------------------------------------------------------------------------------------------------");
                //rest.first_half_break();
                if(player2_batted==0)
                    bowling_player_1_And_batting_player_2(player1_batted);
                    break;
            }
            else{
                player_1_score+=player_1_hit;
                if(player_1_score>player_2_score && player2_batted==1){
                    System.out.println("player_1 score is "+player_1_score);
                    break;
                }
            }
            if(player_1_score%50==0 && player_1_score!=0){
                System.out.println("Wanna declare innings\nIf yes choose 1\nIf no choose 0");
                int declare;
                declare=sc.nextInt();
                switch (declare) {
                    case 1:
                    if(player2_batted==0)
                        bowling_player_1_And_batting_player_2(player1_batted);
                        //rest.first_half_break();
                        break;
                    case 2:
                         continue;
                }
            }
        }
    }
    public void bowling_player_1_And_batting_player_2(int player1_batted){
        int player2_batted=1;
        Scanner sc=new Scanner(System.in);
        //innings_break rest=new innings_break();
        System.out.println("player-2 is batting and player-1 is bowling");
        while(true){
            //System.out.println("player_2_hits (1-6 only) : ");
            player_2_hit=min_score+(int)(Math.random()*max_score);
            System.out.println("player_1 bowl (1-6 only ) : ");
            player_1_bowl=sc.nextInt();
            if(player_1_bowl>6){
                System.out.println("Enter a valid input\nvalue should be between 1-6 : ");
                player_1_bowl=sc.nextInt();
            }
            System.out.println("player_2 hits : "+player_2_hit+"  player_1 bowls : "+player_1_bowl);
            if(player_2_hit==player_1_bowl){
                System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println("ooh noo!!!!!!!\nplayer-2 is out!!!!!!!!!!!!!\nthat's a magnificiant ball from player_1\nNow let's take innings break");
                System.out.println("Player_2 score is "+player_2_score);
                System.out.println("------------------------------------------------------------------------------------------------------");
                //rest.first_half_break();
                if(player1_batted==0)
                   batting_player_1_And_bowling_player_2(player2_batted);
                   break;
            }
            else{
                player_2_score+=player_2_hit;
                if(player_2_score>player_1_score && player1_batted==1){
                    System.out.println("player_2 score is "+player_2_score);
                    break;
                }
            }
            if(player_2_score%50==0 && player_2_score!=0){
                System.out.println("Wanna declare innings\nIf yes choose 1\nIf no choose 0");
                int declare;
                declare=sc.nextInt();

                switch (declare) {
                    case 1:
                        //rest.first_half_break();
                        if(player1_batted==0)
                            batting_player_1_And_bowling_player_2(player2_batted);
                            break;
                    case 2:
                         continue;
                }
            }
        }
        if(player_1_score>player_2_score){
           System.out.println("CONGRATULATIONs");
           System.out.println("player-1 is the winner");
        }
        else{
           System.out.println("CONGRATULATIONS");
           System.out.println("player-2 is the winner");
        }
    }
}

public class game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        batbowl batbowl=new batbowl();
        
        System.out.println("");
        System.out.println("---------------------------------123456(HAND CRICKET)654321---------------------------------------------");
        System.out.println();
        System.out.println("_________ABOUT GAME_________");
        System.out.println("This is a Multi Player Game.\nHere two teams will play, where every team consists of only 1 player\nTeam-1 have player-1(user)\nteam-2 have player-2(computer)");
        System.out.println();
        System.out.println("_________Game Rules_________");
        System.out.println("1 : Before the game begins we toss the coin to decide who has to bat and who has to bowl\n2 : Then we start the game\n3 : A player can score 1,2,3,4,5,6\n4 : Maximum run a player can score is 6 runs\n5 : Once the game starts both the players starts to deliver a random number between 1-6\n6 : If bowler throws same number as the batter then batter is out now the bowler will bat and batter will bowl.\n7 : As player-1 is user we give the chance to player-1 to choose at the time of toss(1 or 0)\n8 : If player-1 chooses 1 and we get one when the coin is tossed then he can choose whether to bat or bowl.");
        System.out.println();
        System.out.println("Let's begin the game!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println();
        System.out.println("It's time fo the TOSS\nBoth the players are here and there you go\ncoin is Tossed");
        int player_1_coin_choice;
        System.out.println("player-1 choice for the Toss(1 or 0 only)");
        player_1_coin_choice=sc.nextInt();
        System.out.println("And!!!!!!! player-1 chooses : ");
        System.out.println(player_1_coin_choice);
        double toss_result=Math.random();
        if(toss_result>=0.5){
            toss_result=1;
        }
        else{
            toss_result=0;
        }
        int player1_batted=0;
        int player2_batted=0;
        if(player_1_coin_choice==toss_result){
            System.out.println("!!!!!!!!!!!!player-1 won the toss!!!!!!!!!!!!!!!!!!");
            System.out.println("choose 1 for batting and 2 for bowling");
            int battin_or_bowling_choice;
            battin_or_bowling_choice=sc.nextInt();
            switch (battin_or_bowling_choice) {
                case 1:
                    batbowl.batting_player_1_And_bowling_player_2(player2_batted);
                    break;
                case 2:
                    batbowl.bowling_player_1_And_batting_player_2(player1_batted);
                    break;
                default:
                    System.out.println("Enter a valid input(1 or 2)");
            }
        }
        else{
            int min=1,max=2;
            System.out.println("!!!!!!!!!!!!player-2 won!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("choose 1 for batting and 2 for bowling (computer)");
            int battin_or_bowling_choice;
            battin_or_bowling_choice=min+(int)Math.random()*max;
            switch (battin_or_bowling_choice) {
                case 1:
                batbowl.bowling_player_1_And_batting_player_2(player1_batted);
                break;
                case 2:
                batbowl.batting_player_1_And_bowling_player_2(player2_batted);
                break;
                default:
                   System.out.println("Enter a valid input(1 or 2)");
            }
        }
        
    }
}
