import java.util.Scanner;

public class Bank {
    private Account[] accounts;
    private int totalAccount;

    public Bank() {
        accounts = new Account[1000];
        totalAccount = 0;
    }


        //accountNumber 계좌번호 accountNumber 예금주 balance 최초 예금액 password 비번

    public void createAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("계좌번호>> ");
        String accountNumber = scanner.nextLine();
        System.out.print("예금주>> ");
        String accountHolder = scanner.nextLine();
        System.out.print("최초예금액>> ");
        int balance = scanner.nextInt();
        scanner.nextLine();
        System.out.print("비밀번호>> ");
        int password = scanner.nextInt();
        scanner.nextLine();

        accounts[totalAccount] = new Account(accountNumber, accountHolder, balance, password);
        totalAccount++;
        System.out.println("'" + accountHolder + "' 님의 계좌가 개설되었습니다.");
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("계좌번호>> ");
        String accountNumber = scanner.nextLine();
        System.out.print("입금액>> ");
        int amount = scanner.nextInt();

        for (int i = 0; i < totalAccount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i].deposit(amount);
                System.out.println("'" + accounts[i].getAccountHolder() + "' 님의 계좌에 " + amount + " 원이 입금되었습니다.");
                return;
            }
        }
        System.err.println("해당 계좌번호를 찾을 수 없습니다.");
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("계좌번호>> ");
        String accountNumber = scanner.nextLine();
        System.out.print("비밀번호>> ");
        int password = scanner.nextInt();
        System.out.print("출금액>> ");
        int amount = scanner.nextInt();

        for (int i = 0; i < totalAccount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                if (accounts[i].getPassword() == password) {
                    System.out.println("'" + accounts[i].getAccountHolder() + "' 님의 계좌에 " + amount + " 원이 출금되었습니다.");
                } else {
                    System.err.println("비밀번호가 다릅니당!");
                }
                return;
            }
        }
        System.err.println("해당 꼐좌번호를 찾을 수 없습니다.");
    }

    public void inquire() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("계좌번호>> ");
        String accountNumber = scanner.nextLine();
        System.out.print("비밀번호>> ");
        int password = scanner.nextInt();

        for (int i = 0; i < totalAccount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber) && accounts[i].getPassword()== (password)) {
                System.out.println("'" + accounts[i].getAccountHolder() + "' 님의 계좌잔액은 " + accounts[i].getBalance() + " 원 입니다.");
                return;
            }
        }
        System.out.println("해당 계좌번호를 찾을 수 없습니다.");
    }

    public void listAccounts() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("관리자 비밀번호>> ");
        String adminPassword = scanner.nextLine();

        if (!adminPassword.equals("1111")) {
            System.err.println("비밀번호가ㅣ 다릅니다!");
            return;
        }

        System.out.println("예금주 계좌번호 잔고");
        for (int i = 0; i < totalAccount; i++) {
            System.out.println(accounts[i].getAccountHolder() + " " + accounts[i].getAccountNumber() + " " + accounts[i].getBalance());
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===================================");
            System.out.println("1. 계좌등록");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 계좌조회");
            System.out.println("5. 계좌목록");
            System.out.println("6. 종료");
            System.out.println("===================================");
            System.out.print("입력>> ");

            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    bank.createAccount();
                    break;
                case 2:
                    bank.deposit();
                    break;
                case 3:
                    bank.withdraw();
                    break;
                case 4:
                    bank.inquire();
                    break;
                case 5:
                    bank.listAccounts();
                    break;
                case 6:
                    System.out.println("시스템을 종료합니다.");
                    System.exit(0);
            }
        }
    }
}
