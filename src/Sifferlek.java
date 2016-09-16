import java.util.Random;
import java.util.Scanner;
/**
 * Created by bepe14 on 2016-09-16.
 */
public class Sifferlek {
    static int[] num1 , num2;
    static int[] svar;
    public static void main(String[] args) {

        nummer();
        question();
        correct();

    }

        public static void nummer() {
            num1 = new int[10];
            num2 = new int[10];
            Random rand = new Random();
            for (int i=0 ; i < 10 ; i++) {
                num1[i] = (int)(Math.random() * 100);
                num2[i] = (int)(Math.random() * 100);
            }
    }

        public static void question() {
            svar = new int[10];
            Scanner tgb = new Scanner(System.in);
            for (int i = 0 ; i < 10 ; i++){
                System.out.println("Vad är " + num1[i] + "+" + num2[i] + "?");
                svar[i] = tgb.nextInt();
            }

        }

        public static void correct() {
            int score = 0;
            for (int i = 0 ; i < 10 ; i++) {
                if(num1[i] + num2[i] == svar[i]) {
                    System.out.println("Du svara rätt: " + num1[i] + "+" + num2[i] + "=" + svar[i]);
                    score+=10;
                }
                else {
                    System.out.println("Du svara fel, rätt svar var: " + num1[i] + "+" + num2[i] + "=" + ( num1[i] + num2[i]));
                }
            }
            System.out.println("Ditt slut poäng är: " + score);
        }



            //Arrayer med nummer och svar , random nummer
                //random.math
            //Skapa frågor
                // random + random
            //ställa frågorna
                //print frågor
                //scanner
            //rätta
                //rätt = 10 poäng

    }

