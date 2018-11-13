import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean continueInput = true;
        int x = 0;
        int y = 0;
        int tal = 0;
        int[] intArrray = new int[5];
        boolean dinMor = false;
        Scanner s = new Scanner(System.in);
        System.out.println("intast en integer");

        do {
            try {
                tal = s.nextInt();
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("invalid input. you must enter an integer");
                s.nextLine();
            }
            /** finally {
                tal = 0;
            } */
        }while(continueInput);

        System.out.println("tallet er" + tal);


        for(int i = 0; i < intArrray.length; i++) {
            intArrray[i] = i;
            System.out.println(i);
        }
        for(int e: intArrray) {
            System.out.println(e);
        }

        while(x < 3) {
            System.out.println("while loppet virker " + x);
            x++;
        }
        do  {
            System.out.println("do while virker " + y);
            y++;
        } while(y <2);

        if (dinMor == true) {
            System.out.println("din Mor!");
        }
        else System.out.println("Martins Mor!");

        if (tal < 10) {
            System.out.println("tallet er mindre end 10");
        }
        else if (tal < 20 && tal >= 10) {
            System.out.println("tallet er mindre end 20");
        }
        else {
            System.out.println("tallet er større end 20");
        }

    }
}
