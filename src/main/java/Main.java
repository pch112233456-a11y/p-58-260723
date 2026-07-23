import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        experiment1();
    }

    public static void experiment1() {

        String input = """
                등록
                너 자신을 알라
                소크라테스
                """;

        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();
        String saying = sc.nextLine();
        System.out.println("입력한 명령어: " + cmd);
        System.out.println("입력한 명언: " + saying);

    }

}