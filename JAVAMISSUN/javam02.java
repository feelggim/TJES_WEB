import java.util.Scanner;

public class javam02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int N = scanner.nextInt();

        int oddSum = 0;
        int evenSum = 0;
        StringBuilder oddNumbers = new StringBuilder();
        StringBuilder evenNumbers = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                evenSum += i;
                evenNumbers.append(i).append(i == N || i == N - 1 ? "" : "+");
            } else {
                oddSum += i;
                oddNumbers.append(i).append(i == N - 1 ? "" : "+");
            }
        }

        System.out.println(oddNumbers + "=" + oddSum);
        System.out.println(evenNumbers + "=" + evenSum);

        System.out.print("");
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
