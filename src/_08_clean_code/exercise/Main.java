package _08_clean_code.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm người chơi 1");

        int scorePlayer1 = scanner.nextInt();
        System.out.println("Nhập điểm người chơi 2");
        int scorePlayer2 = scanner.nextInt();
        System.out.println(TennisGame.getScore("Trường", "Khoa",scorePlayer1,scorePlayer2));
    }
}
