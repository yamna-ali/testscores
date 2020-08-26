import java.util.Scanner;

public class testscores {


    public static void main (String args[]){
        int min=0 , max=0, sum=0;
        double avg=0;
        int score, counter = 0;

        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a test score. Type -1 to quit.");
        score = keybd.nextInt();
        keybd.nextLine();
        max = score;
        min= score;

        while (score != -1) {

            sum+= score;
            counter+=1;
            if(score > max){
                max = score;
            }


            if(score < min){
                min= score;
            }
            System.out.println("Please enter another testscore: ");
            score = keybd.nextInt();





        }

        if (counter > 0){
            avg = sum / counter;

        System.out.println("Min: " + min + " Max: " + max + " Avg: " + avg);
    }
        else System.out.println("No numbers were entered. Program is terminated.");








}}







