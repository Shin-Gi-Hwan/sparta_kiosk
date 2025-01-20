package org.example.level02;

public class MenuItem {
    private String name;
    private String price;
    private String description;

    private MenuItem() {}
    // 메뉴를 받을 생성자 생성
    public MenuItem(String name, String price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    // Getter, Setter 구현
    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
