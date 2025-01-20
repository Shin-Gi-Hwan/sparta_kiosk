package org.example.level04;

import org.example.level04.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String category;
    List<MenuItem> items;

    // 생성자 선언?
    private Menu() {}
    public Menu(String category) {
        this.category = category;
        this.items = new ArrayList<>();
    }

    // getter / setter 생성
    public String getCategory() {
        return category;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public void addMenuItem(MenuItem menuItem) {
        items.add(menuItem);
    }

    public void displayMenuItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
        System.out.println("0. 뒤로가기");
    }

}
