package org.example.level02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk_2 {
    public static void main(String[] args) {
        // List 선언 및 초기화
        List<MenuItem> hamburgers = new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        hamburgers.add(new MenuItem("ShackBurger", "W 6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        hamburgers.add(new MenuItem("SmokeShack", "W 8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        hamburgers.add(new MenuItem("Cheeseburger를", "W 6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        hamburgers.add(new MenuItem("Hamburger를", "W 5.4", "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Scanner 선언
        Scanner scanner = new Scanner(System.in);


        int choice;
        List<MenuItem> selectedMenus = new ArrayList<>();
        do {
            int number = 1;

            System.out.println("[ SHAKESHACK MENU ]");
            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            for (MenuItem item : hamburgers) {
                System.out.println((number++) + "." + item.getName() + "|" + item.getPrice() + "|" + item.getDescription());
            }
            System.out.println("0. 종료 | 종료");
            System.out.print("번호를 선택해주세요: ");
            // 숫자를 입력 받기
            choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
            } else if (choice >= 1 && choice <= hamburgers.size()) {
                MenuItem selectedItem = hamburgers.get(choice - 1);
                System.out.printf("%s를 선택하셨습니다. %s\n", selectedItem.getName(), selectedItem.getDescription());
                selectedMenus.add(selectedItem);
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }

        } while (choice != 0);

        // 선택한 메뉴 출력
        if (selectedMenus.isEmpty()) {
            System.out.println("선택한 메뉴가 없습니다.");
        } else {
            for (MenuItem menu : selectedMenus) {
                System.out.println("선택한 메뉴: " + menu.getName() + ", " + menu.getPrice() + ", " + menu.getDescription());
            }
        }
    }
}
