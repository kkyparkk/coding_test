import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        int N = Integer.parseInt(n, 16);

        System.out.println(N);
    }
}