import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Here is your card : ");
        int player1 = randomCard();
        printCard(player1);

        System.out.println("Here is the computer  card : ");
        int player2 = randomCard();
        while (player1 == player2){
            player2 = randomCard();
        }

        printCard(player2);

        System.out.println("Now the dealer will draw 5 cards, Press enter to continue : ");
        String reponse = input.nextLine();
        if (reponse.equals("")){

            System.out.print("egal");


        }else{
            System.exit(0);
        }



        input.close();

    }


    /**
     *
     * @return
     *
     * This function return a random number between From 1 to 13
     */
    public static int randomCard(){
        double number = (Math.random() * 12) + 1 ;


        return (int) number;



    }

    /**
     *
     * @param numberCard
     *
     * This function print Cards
     */
    public static void printCard(int numberCard){

        switch (numberCard){

            case 1 :

                System.out.println(
                        "   _____\n"+
                        "  |A _  |\n"+
                        "  | ( ) |\n"+
                        "  |(_'_)|\n"+
                        "  |  |  |\n"+
                        "  |____V|\n");
                break;
            case 2:

                System.out.println(
                        "   _____\n"+
                        "  |2    |\n"+
                        "  |  o  |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____Z|\n"
                );
                break;

            case 3:
                System.out.println(
                        "   _____\n" +
                        "  |3    |\n"+
                        "  | o o |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____E|\n"
                );
                break;

            case 4:
                System.out.println(
                        "   _____\n" +
                        "  |4    |\n"+
                        "  | o o |\n"+
                        "  |     |\n"+
                        "  | o o |\n"+
                        "  |____h|\n"
                );
                break;
            case 5:
                System.out.println(
                        "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n"
                );
                break;


            case 6:
                System.out.println(
                        "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n"

                );
                break;
            case 7:
                System.out.println(
                        "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n"

                );
                break;
            case 8:
                System.out.println(
                        "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n"

                );
                break;
            case 9:
                System.out.println(
                        "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n"

                );
                break;
            case 10:
                System.out.println(
                        "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n"

                );
                break;
            case 11:
                System.out.println(
                        "   _____\n" +
                        "  |J  ww|\n"+
                        "  | o {)|\n"+
                        "  |o o% |\n"+
                        "  | | % |\n"+
                        "  |__%%[|\n"

                );
                break;
            case 12:
                System.out.println(
                        "   _____\n" +
                        "  |Q  ww|\n"+
                        "  | o {(|\n"+
                        "  |o o%%|\n"+
                        "  | |%%%|\n"+
                        "  |_%%%O|\n"

                );
                break;
            case 13:
                System.out.println(
                        "   _____\n" +
                        "  |K  WW|\n"+
                        "  | o {)|\n"+
                        "  |o o%%|\n"+
                        "  | |%%%|\n"+
                        "  |_%%%>|\n"

                );
                break;


            default:
                System.out.println("Error");

        }

    }


}