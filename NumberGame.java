import java.util.Scanner;
class range{
    public int generate(int max, int min){
        return(int)(Math.random()*(max-min+1)+min);
    }
}
public class NumberGame{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        range rg= new range(); 
        int TA =8;
        int win=0;
        while (true) {
            System.out.println("Enter the minimum number:");
            int min= s.nextInt();
            System.out.println("Enter the maximum number:");
            int max= s.nextInt();
            s.nextLine();
            int c= rg.generate(max,min);
            int A=0;
            System.out.println("Hey Buddy\n Guess the number between "  +min+  " and " +max);
            while (true) {
                int g= s.nextInt();
                A++;
                if(g>c){
                    System.out.println("It is Greater!");
                }
                else if(g<c){
                    System.out.println("It is Lower!");
                }
                else{
                    System.out.println("Correct Guess!");
                    win++;
                    break;
                }
            }
                TA+=TA;
                System.out.println("Attempt= "+A);
                System.out.println("Wins= "+win);

                double winrate=(double) win/TA *100;
                System.out.println("Your Winrate is\n"+winrate);
                System.out.println("Do you Want to play again(y / n)");
                String PA= s.next();
                if (!PA.equalsIgnoreCase("y")) {
                    s.close();
                    System.exit(0);
                }
                s.nextLine();
            }

        }
    }