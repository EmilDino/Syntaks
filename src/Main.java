public class Main {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        int[] intArrray = new int[5];
        boolean dinMor = false;

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


    }
}
