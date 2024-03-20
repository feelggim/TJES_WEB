import java.util.Scanner;

public class javam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("영어 점수 : ");
        int eng = scanner.nextInt();

        System.out.print("수학 점수 : ");
        int math = scanner.nextInt();

        System.out.print("자바 점수 : ");
        int java = scanner.nextInt();

        int total = eng + math + java;
        double average = total / 3.0;

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + average);
    }

    @Override
    public String toString() {
        return "javam01 []";
    }
}