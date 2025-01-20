package org.example.level04;

public class Main_Kiosk {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        // Burgers 메뉴 생성
        Menu burgers = new Menu("Burgers");
        burgers.addMenuItem(new MenuItem("ShackBurger", "W 6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("SmokeShack", "W 8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Cheeseburger", "W 6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Hamburger", "W 5.4", "비프패티를 기반으로 야채가 들어간 기본버거"));
        // Drinks 메뉴 생성
        Menu drinks = new Menu("Drinks");
        drinks.addMenuItem(new MenuItem("Coke", "W 2.0", "시원한 콜라"));
        drinks.addMenuItem(new MenuItem("Sprite", "W 2.0", "시원한 스프라이트"));
        drinks.addMenuItem(new MenuItem("Lemonade", "W 3.0", "상큼한 레모네이드"));
        // Desserts 메뉴 생성
        Menu desserts = new Menu("Desserts");
        desserts.addMenuItem(new MenuItem("Ice Cream", "W 4.5", "달콤한 아이스크림"));
        desserts.addMenuItem(new MenuItem("Brownie", "W 3.5", "진한 초콜릿 브라우니"));
        // Kiosk에 메뉴 추가
        kiosk.addMenu(burgers);
        kiosk.addMenu(drinks);
        kiosk.addMenu(desserts);
        // 프로그램 시작
        kiosk.start();
    }
}
