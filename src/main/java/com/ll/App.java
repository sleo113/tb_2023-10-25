package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    List<String> wise_sayings = new ArrayList<>();
    List<String> authors = new ArrayList<>();

    void run() {
        int i;
        int a = 0;

        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");

            Scanner scanner = new Scanner(System.in);
            String sc = scanner.nextLine();

            if (sc.equals("등록")) {
                System.out.print("명언 : ");
                String wise_saying = scanner.nextLine();

                System.out.print("작가 : ");
                String author = scanner.nextLine();
                System.out.println("\n");

                wise_sayings.add(wise_saying);
                authors.add(author);

                a++;

                System.out.println(a + "번 명언이 등록되었습니다.");
                System.out.println("\n");

            } else if (sc.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");

                for (i = wise_sayings.size() - 1; i >= 0; i--) {
                    System.out.println((i + 1) + " / " + authors.get(i) + " / " + wise_sayings.get(i));
                }

            }else if (sc.equals("삭제")){
                for (i = wise_sayings.size() - 1; i >= 0; i--) {
                    System.out.println((a + " / " + authors.get(i) + " / " + wise_sayings.get(i)));
                }
                System.out.print("\n");

            }else if (sc.equals("종료")) {
                break;
            }
            System.out.printf("입력하신 명령 : %s\n", sc);
        }
    }
}