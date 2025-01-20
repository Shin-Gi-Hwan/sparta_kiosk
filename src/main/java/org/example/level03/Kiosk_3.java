package org.example.level03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk_3 {
    private List<MenuItem> menuItems;
    private List<MenuItem> selectedItems;

    private Kiosk_3() {}
    public Kiosk_3(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.selectedItems = new ArrayList<>();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            menus();

            choice = scanner.nextInt();
            userSelectNumber(choice);
        } while (choice != 0);
        userSelectMenus();
    }

    public void menus() {
        int number = 1;
        System.out.println("[ SHAKESHACK MENU ]");
        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        for (MenuItem item : menuItems) {
            System.out.println((number++) + "." + item.getName() + "|" + item.getPrice() + "|" + item.getDescription());
        }
        System.out.println("0. 종료 | 종료");
        System.out.print("번호를 선택해주세요: ");
    }

    public void userSelectNumber(int choice) {
        if (choice == 0) {
            System.out.println("프로그램을 종료합니다.");
        } else if (choice >= 1 && choice <= menuItems.size()) {
            MenuItem selectedItem = menuItems.get(choice - 1);
            System.out.printf("%s를 선택하셨습니다. %s\n", selectedItem.getName(), selectedItem.getDescription());
            selectedItems.add(selectedItem);
        } else {
            System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
        }
    }

    public void userSelectMenus() {
        if (selectedItems.isEmpty()) {
            System.out.println("선택한 메뉴가 없습니다.");
        } else {
            for (MenuItem menu : selectedItems) {
                System.out.println("선택한 메뉴: " + menu.getName() + ", " + menu.getPrice() + ", " + menu.getDescription());
            }
        }
    }
}
