import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();

        // 사용자로부터 5개의 점수 입력 받기
        for (int i = 0; i < 5; i++) {
            System.out.print("점수를 입력하세요: ");
            int score = scanner.nextInt();
            scores.add(score);
        }

        // 입력한 점수 출력
        System.out.println("입력한 점수: " + scores);

        // 최고 점수 & 최저 점수 찾기
        int maxScore = Collections.max(scores);
        int minScore = Collections.min(scores);

        System.out.println("최고 점수: " + maxScore);
        System.out.println("최저 점수: " + minScore);

        scanner.close();
    }
}

