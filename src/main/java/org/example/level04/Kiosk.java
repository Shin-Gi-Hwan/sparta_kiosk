package org.example.level04;

import org.example.level04.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;

    public Kiosk() {
        this.menus = new ArrayList<Menu>();
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategory());
            }
            System.out.println("0. 종료");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            if (choice > 0 && choice <= menus.size()) {
                Menu selectedMenu = menus.get(choice - 1);
                System.out.println("[ " + selectedMenu.getCategory().toUpperCase() + " MENU ]");
                selectedMenu.displayMenuItems();

                int itemChoice = scanner.nextInt();
                scanner.nextLine();

                if (itemChoice == 0) {
                    continue;
                }

                if (itemChoice > 0 && itemChoice <= selectedMenu.getItems().size()) {
                    MenuItem selectedItem = selectedMenu.getItems().get(itemChoice - 1);
                    System.out.println("선택한 메뉴: " + selectedItem);
                } else if (itemChoice == 0) {
                    continue;
                } else {
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                }
            }
        }
    }
}
