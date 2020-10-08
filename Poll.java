import java.util.Scanner;

public class Poll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of representatives   ");
        int n = input.nextInt();
        int[] voices = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Set your voice   ");
            voices[i] = input.nextInt();
        }
        int maxvoice = 0;
        Estimation int[] estimation  = new Estimation(voices[n]);
        System.out.println("most common meaning is" + estimation[].election(voices[]));
    }

}
