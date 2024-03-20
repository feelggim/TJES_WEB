public class javam03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String number = String.valueOf(i);
            int count = 0;

            for (char 별 : number.toCharArray()) {
                if (별 == '3' || 별 == '6' || 별 == '9') {
                    count++;
                }
            }

            if (count > 0) {
                for (int j = 0; j < count; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.println(i);
            }
        }
    }
}
